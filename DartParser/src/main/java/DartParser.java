import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.inject.util.Modules;
import org.apache.commons.io.IOUtils;
import org.apache.commons.vfs2.FileObject;
import org.metaborg.core.MetaborgException;
import org.metaborg.core.analysis.AnalysisFileResult;
import org.metaborg.core.analysis.AnalysisResult;
import org.metaborg.core.analysis.IAnalysisService;
import org.metaborg.core.context.IContext;
import org.metaborg.core.context.IContextInternal;
import org.metaborg.core.context.IContextService;
import org.metaborg.core.language.ILanguageComponent;
import org.metaborg.core.language.ILanguageDiscoveryRequest;
import org.metaborg.core.language.ILanguageDiscoveryService;
import org.metaborg.core.language.ILanguageImpl;
import org.metaborg.core.messages.IMessage;
import org.metaborg.core.project.ISimpleProjectService;
import org.metaborg.core.resource.IResourceService;
import org.metaborg.core.syntax.ISyntaxService;
import org.metaborg.core.syntax.ParseResult;
import org.metaborg.spoofax.core.SpoofaxModule;
import org.spoofax.interpreter.terms.IStrategoTerm;

import java.io.IOException;
import java.util.Collections;

public class DartParser {
    public static void main(String[] args) throws MetaborgException, IOException {
        Injector injector = Guice.createInjector(
            Modules.override(new SpoofaxModule())
                .with(new DartModule())
        );

        // Get resource service
        IResourceService resourceService = injector.getInstance(IResourceService.class);

        // Get language discovery service
        ILanguageDiscoveryService languageDiscoveryService = injector.getInstance(ILanguageDiscoveryService.class);

        // Get language FileObject
        FileObject languageLocation = resourceService.resolve("/Users/martijn/Projects/dart/Dart-new/include");

        // Get discovery requests
        Iterable<ILanguageDiscoveryRequest> discoveryRequests = languageDiscoveryService.request(languageLocation);

        // Get language components
        Iterable<ILanguageComponent> languageComponents = languageDiscoveryService.discover(discoveryRequests);

        // Get language implementation
        Iterable<? extends ILanguageImpl> languages = languageComponents.iterator().next().contributesTo();
        ILanguageImpl language = languages.iterator().next();

        // Get syntax service
        ISyntaxService<IStrategoTerm> instance = injector.getInstance(
            Key.get(new TypeLiteral<ISyntaxService<IStrategoTerm>>() {
            })
        );

        // Get file to parse
        FileObject file = resourceService.resolve(args[0]);

        // Get file content as string
        String content = IOUtils.toString(file.getContent().getInputStream());

        // Parse!
        ParseResult<IStrategoTerm> parseResult = instance.parse(content, file, language, null);

        // Print result
        for (IMessage message : parseResult.messages) {
            //System.out.println(message.severity() + ": " + message.message());
        }

//        System.out.println(parseResult.result);

        // Get analysis service
        IAnalysisService<IStrategoTerm, IStrategoTerm> analysisService = injector.getInstance(
            Key.get(new TypeLiteral<IAnalysisService<IStrategoTerm, IStrategoTerm>>() {
            })
        );

        // Get context service
        IContextService contextService = injector.getInstance(IContextService.class);

        // Get project service
        ISimpleProjectService projectService = injector.getInstance(ISimpleProjectService.class);

        // Create project
        projectService.create(file);

        // Get context
        IContext context = contextService.get(parseResult.source, parseResult.language);

        // Initialize context index
        IContextInternal indexContext = (IContextInternal) context;
        indexContext.init();

        // Analyse!
        AnalysisResult<IStrategoTerm, IStrategoTerm> analysisResult = analysisService.analyze(Collections.singletonList(parseResult), context);

        for (AnalysisFileResult<IStrategoTerm, IStrategoTerm> analysisFileResult : analysisResult.fileResults) {
            for (IMessage message : analysisFileResult.messages) {
//                System.out.println(message.severity() + ": " + message.message());
            }
        }

        // Signal compile error based on the number of parse/analysis errors
        if (countErrors(parseResult, analysisResult) > 0) {
            System.exit(1);
        } else {
            System.exit(0);
        }
    }

    /**
     * Returns the number of parse errors and analysis errors.
     *
     * @param parseResult
     * @param analysisResult
     * @return
     */
    public static int countErrors(ParseResult<IStrategoTerm> parseResult, AnalysisResult<IStrategoTerm, IStrategoTerm> analysisResult) {
        int parseMessages = Iterables.size(parseResult.messages);
        int analysisMessages = 0;

        for (AnalysisFileResult<IStrategoTerm, IStrategoTerm> analysisFileResult : analysisResult.fileResults) {
            for (IMessage message : analysisFileResult.messages) {
                analysisMessages++;
            }
        }

        return parseMessages + analysisMessages;
    }
}
