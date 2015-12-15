import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.metaborg.core.project.IProjectService;
import org.metaborg.core.project.ISimpleProjectService;
import org.metaborg.core.project.SimpleProjectService;

public class DartModule extends AbstractModule {
    public DartModule() {

    }

    @Override
    protected void configure() {
        bind(SimpleProjectService.class).in(Singleton.class);

        bind(IProjectService.class).to(SimpleProjectService.class);
        bind(ISimpleProjectService.class).to(SimpleProjectService.class);
    }
}
