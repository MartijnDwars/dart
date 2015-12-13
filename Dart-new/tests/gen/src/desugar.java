import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.lang.parallel.stratego_parallel.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constVarDeclStmt1;

  protected static IStrategoTerm constVarDeclStmt0;

  protected static IStrategoTerm const135;

  protected static IStrategoTerm constCons61;

  protected static IStrategoTerm constCons60;

  protected static IStrategoTerm constVarDecl3;

  protected static IStrategoTerm constVarDecl2;

  protected static IStrategoTerm constCons59;

  protected static IStrategoTerm constCons58;

  protected static IStrategoTerm constVar1;

  protected static IStrategoTerm constDec1;

  protected static IStrategoTerm const134;

  protected static IStrategoTerm const133;

  protected static IStrategoTerm const132;

  protected static IStrategoTerm constCons57;

  protected static IStrategoTerm constVarDecl1;

  protected static IStrategoTerm constVarDecl0;

  protected static IStrategoTerm constCons56;

  protected static IStrategoTerm constVar0;

  protected static IStrategoTerm constDec0;

  protected static IStrategoTerm const131;

  protected static IStrategoTerm const130;

  protected static IStrategoTerm constType0;

  protected static IStrategoTerm const129;

  protected static IStrategoTerm constMetadata0;

  protected static IStrategoTerm const128;

  protected static IStrategoTerm const127;

  protected static IStrategoTerm constNil14;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consMetadata_1;

  public static IStrategoConstructor _consType_1;

  public static IStrategoConstructor _consVarDecl_3;

  public static IStrategoConstructor _consVar_2;

  public static IStrategoConstructor _consDec_1;

  public static IStrategoConstructor _consVarDeclStmt_1;

  public static Context init(Context context)
  { 
    synchronized(desugar.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.stratego_sglr.Main.init(context);
          org.strategoxt.stratego_gpp.Main.init(context);
          org.strategoxt.stratego_xtc.Main.init(context);
          org.strategoxt.stratego_aterm.Main.init(context);
          org.strategoxt.lang.parallel.stratego_parallel.Main.init(context);
          context.registerComponent("desugar");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static void main(String args[])
  { 
    Context context = init();
    context.setStandAlone(true);
    try
    { 
      IStrategoTerm result;
      try
      { 
        result = context.invokeStrategyCLI(main_0_0.instance, "desugar", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("desugar" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
        context.printStackTrace();
        context.setStandAlone(false);
        System.exit(1);
      }
      else
      { 
        System.out.println(result);
        context.setStandAlone(false);
        System.exit(0);
      }
    }
    catch(StrategoErrorExit exit)
    { 
      context.setStandAlone(false);
      System.err.println(exit.getLocalizedMessage());
      System.exit(exit.getValue());
    }
    catch(StrategoExit exit)
    { 
      context.setStandAlone(false);
      System.exit(exit.getValue());
    }
  }

  public static IStrategoTerm mainNoExit(String ... args) throws StrategoExit
  { 
    return mainNoExit(new Context(), args);
  }

  public static IStrategoTerm mainNoExit(Context context, String ... args) throws StrategoExit
  { 
    try
    { 
      init(context);
      return context.invokeStrategyCLI(main_0_0.instance, "desugar", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return main_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consMetadata_1 = termFactory.makeConstructor("Metadata", 1);
    _consType_1 = termFactory.makeConstructor("Type", 1);
    _consVarDecl_3 = termFactory.makeConstructor("VarDecl", 3);
    _consVar_2 = termFactory.makeConstructor("Var", 2);
    _consDec_1 = termFactory.makeConstructor("Dec", 1);
    _consVarDeclStmt_1 = termFactory.makeConstructor("VarDeclStmt", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil14 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const127 = termFactory.makeString("desugar");
    const128 = termFactory.makeString("var decl with one var");
    constMetadata0 = termFactory.makeAppl(desugar._consMetadata_1, new IStrategoTerm[]{desugar.constNil14});
    const129 = termFactory.makeString("int");
    constType0 = termFactory.makeAppl(desugar._consType_1, new IStrategoTerm[]{desugar.const129});
    const130 = termFactory.makeString("y");
    const131 = termFactory.makeString("1");
    constDec0 = termFactory.makeAppl(desugar._consDec_1, new IStrategoTerm[]{desugar.const131});
    constVar0 = termFactory.makeAppl(desugar._consVar_2, new IStrategoTerm[]{desugar.const130, desugar.constDec0});
    constCons56 = (IStrategoTerm)termFactory.makeListCons(desugar.constVar0, (IStrategoList)desugar.constNil14);
    constVarDecl0 = termFactory.makeAppl(desugar._consVarDecl_3, new IStrategoTerm[]{desugar.constMetadata0, desugar.constType0, desugar.constCons56});
    constVarDecl1 = termFactory.makeAppl(desugar._consVarDecl_3, new IStrategoTerm[]{desugar.constMetadata0, desugar.constType0, desugar.constVar0});
    constCons57 = (IStrategoTerm)termFactory.makeListCons(desugar.constVarDecl1, (IStrategoList)desugar.constNil14);
    const132 = termFactory.makeString("var decl with two vars");
    const133 = termFactory.makeString("z");
    const134 = termFactory.makeString("2");
    constDec1 = termFactory.makeAppl(desugar._consDec_1, new IStrategoTerm[]{desugar.const134});
    constVar1 = termFactory.makeAppl(desugar._consVar_2, new IStrategoTerm[]{desugar.const133, desugar.constDec1});
    constCons58 = (IStrategoTerm)termFactory.makeListCons(desugar.constVar1, (IStrategoList)desugar.constNil14);
    constCons59 = (IStrategoTerm)termFactory.makeListCons(desugar.constVar0, (IStrategoList)desugar.constCons58);
    constVarDecl2 = termFactory.makeAppl(desugar._consVarDecl_3, new IStrategoTerm[]{desugar.constMetadata0, desugar.constType0, desugar.constCons59});
    constVarDecl3 = termFactory.makeAppl(desugar._consVarDecl_3, new IStrategoTerm[]{desugar.constMetadata0, desugar.constType0, desugar.constVar1});
    constCons60 = (IStrategoTerm)termFactory.makeListCons(desugar.constVarDecl3, (IStrategoList)desugar.constNil14);
    constCons61 = (IStrategoTerm)termFactory.makeListCons(desugar.constVarDecl1, (IStrategoList)desugar.constCons60);
    const135 = termFactory.makeString("surround by VarDeclStmt");
    constVarDeclStmt0 = termFactory.makeAppl(desugar._consVarDeclStmt_1, new IStrategoTerm[]{desugar.constVarDecl0});
    constVarDeclStmt1 = termFactory.makeAppl(desugar._consVarDeclStmt_1, new IStrategoTerm[]{desugar.constCons57});
  }

  @SuppressWarnings("all") public static class inline_td_1_0 extends Strategy 
  { 
    public static inline_td_1_0 instance = new inline_td_1_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_68191)
    { 
      context.push("inline_td_1_0");
      Fail501:
      { 
        term = p_68191.invoke(context, term);
        if(term == null)
          break Fail501;
        IStrategoTerm term43 = term;
        Success43:
        { 
          Fail502:
          { 
            IStrategoTerm o_68191 = null;
            o_68191 = term;
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail502;
            term = o_68191;
            { 
              IStrategoTerm term44 = term;
              Success44:
              { 
                Fail503:
                { 
                  if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                    break Fail503;
                  if(true)
                    break Success44;
                }
                term = term44;
                IStrategoTerm q_68191 = null;
                IStrategoTerm r_68191 = null;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail501;
                q_68191 = ((IStrategoList)term).head();
                r_68191 = ((IStrategoList)term).tail();
                term = this.invoke(context, r_68191, p_68191);
                if(term == null)
                  break Fail501;
                term = p_68191.invoke(context, q_68191);
                if(term == null)
                  break Fail501;
                term = flatten_list_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail501;
              }
              if(true)
                break Success43;
            }
          }
          term = term43;
          lifted397 lifted3970 = new lifted397();
          lifted3970.p_68191 = p_68191;
          term = SRTS_all.instance.invoke(context, term, lifted3970);
          if(term == null)
            break Fail501;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class desugar_0_0 extends Strategy 
  { 
    public static desugar_0_0 instance = new desugar_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("desugar_0_0");
      Fail504:
      { 
        TermReference s_68191 = new TermReference();
        TermReference t_68191 = new TermReference();
        IStrategoTerm u_68191 = null;
        if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarDecl_3 != ((IStrategoAppl)term).getConstructor())
          break Fail504;
        if(s_68191.value == null)
          s_68191.value = term.getSubterm(0);
        else
          if(s_68191.value != term.getSubterm(0) && !s_68191.value.match(term.getSubterm(0)))
            break Fail504;
        if(t_68191.value == null)
          t_68191.value = term.getSubterm(1);
        else
          if(t_68191.value != term.getSubterm(1) && !t_68191.value.match(term.getSubterm(1)))
            break Fail504;
        u_68191 = term.getSubterm(2);
        term = u_68191;
        lifted398 lifted3980 = new lifted398();
        lifted3980.s_68191 = s_68191;
        lifted3980.t_68191 = t_68191;
        term = map_1_0.instance.invoke(context, term, lifted3980);
        if(term == null)
          break Fail504;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)desugar.constNil14);
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class main_0_0 extends Strategy 
  { 
    public static main_0_0 instance = new main_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("main_0_0");
      Fail505:
      { 
        term = test_suite_2_0.instance.invoke(context, term, lifted399.instance, lifted400.instance);
        if(term == null)
          break Fail505;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class test_desugar_vardecl_single_0_0 extends Strategy 
  { 
    public static test_desugar_vardecl_single_0_0 instance = new test_desugar_vardecl_single_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("test_desugar_vardecl_single_0_0");
      Fail506:
      { 
        term = apply_test_4_0.instance.invoke(context, term, lifted401.instance, lifted402.instance, lifted405.instance, lifted406.instance);
        if(term == null)
          break Fail506;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class test_desugar_vardecl_double_0_0 extends Strategy 
  { 
    public static test_desugar_vardecl_double_0_0 instance = new test_desugar_vardecl_double_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("test_desugar_vardecl_double_0_0");
      Fail507:
      { 
        term = apply_test_4_0.instance.invoke(context, term, lifted407.instance, lifted408.instance, lifted411.instance, lifted412.instance);
        if(term == null)
          break Fail507;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class test_desugar_stmt_0_0 extends Strategy 
  { 
    public static test_desugar_stmt_0_0 instance = new test_desugar_stmt_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("test_desugar_stmt_0_0");
      Fail508:
      { 
        term = apply_test_4_0.instance.invoke(context, term, lifted413.instance, lifted414.instance, lifted417.instance, lifted418.instance);
        if(term == null)
          break Fail508;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted418 extends Strategy 
  { 
    public static final lifted418 instance = new lifted418();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail509:
      { 
        term = desugar.constVarDeclStmt1;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted417 extends Strategy 
  { 
    public static final lifted417 instance = new lifted417();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail510:
      { 
        term = desugar.constVarDeclStmt0;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted414 extends Strategy 
  { 
    public static final lifted414 instance = new lifted414();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail511:
      { 
        term = inline_td_1_0.instance.invoke(context, term, lifted415.instance);
        if(term == null)
          break Fail511;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted415 extends Strategy 
  { 
    public static final lifted415 instance = new lifted415();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail512:
      { 
        term = try_1_0.instance.invoke(context, term, desugar_0_0.instance);
        if(term == null)
          break Fail512;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted413 extends Strategy 
  { 
    public static final lifted413 instance = new lifted413();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail513:
      { 
        term = desugar.const135;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted412 extends Strategy 
  { 
    public static final lifted412 instance = new lifted412();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail514:
      { 
        term = desugar.constCons61;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted411 extends Strategy 
  { 
    public static final lifted411 instance = new lifted411();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail515:
      { 
        term = desugar.constVarDecl2;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted408 extends Strategy 
  { 
    public static final lifted408 instance = new lifted408();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail516:
      { 
        term = inline_td_1_0.instance.invoke(context, term, lifted409.instance);
        if(term == null)
          break Fail516;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted409 extends Strategy 
  { 
    public static final lifted409 instance = new lifted409();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail517:
      { 
        term = try_1_0.instance.invoke(context, term, desugar_0_0.instance);
        if(term == null)
          break Fail517;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted407 extends Strategy 
  { 
    public static final lifted407 instance = new lifted407();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail518:
      { 
        term = desugar.const132;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted406 extends Strategy 
  { 
    public static final lifted406 instance = new lifted406();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail519:
      { 
        term = desugar.constCons57;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted405 extends Strategy 
  { 
    public static final lifted405 instance = new lifted405();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail520:
      { 
        term = desugar.constVarDecl0;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted402 extends Strategy 
  { 
    public static final lifted402 instance = new lifted402();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail521:
      { 
        term = inline_td_1_0.instance.invoke(context, term, lifted403.instance);
        if(term == null)
          break Fail521;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted403 extends Strategy 
  { 
    public static final lifted403 instance = new lifted403();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail522:
      { 
        term = try_1_0.instance.invoke(context, term, desugar_0_0.instance);
        if(term == null)
          break Fail522;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted401 extends Strategy 
  { 
    public static final lifted401 instance = new lifted401();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail523:
      { 
        term = desugar.const128;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted400 extends Strategy 
  { 
    public static final lifted400 instance = new lifted400();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail524:
      { 
        term = test_desugar_vardecl_single_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail524;
        term = test_desugar_vardecl_double_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail524;
        term = test_desugar_stmt_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail524;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted399 extends Strategy 
  { 
    public static final lifted399 instance = new lifted399();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail525:
      { 
        term = desugar.const127;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted398 extends Strategy 
  { 
    TermReference s_68191;

    TermReference t_68191;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail526:
      { 
        IStrategoTerm x_68191 = null;
        IStrategoTerm y_68191 = null;
        y_68191 = term;
        x_68191 = term;
        term = y_68191;
        if(s_68191.value == null || t_68191.value == null)
          break Fail526;
        term = termFactory.makeAppl(desugar._consVarDecl_3, new IStrategoTerm[]{s_68191.value, t_68191.value, x_68191});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted397 extends Strategy 
  { 
    Strategy p_68191;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail527:
      { 
        term = inline_td_1_0.instance.invoke(context, term, p_68191);
        if(term == null)
          break Fail527;
        if(true)
          return term;
      }
      return null;
    }
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }

  @SuppressWarnings("unused") public static class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
  { 
    @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
    { 
      register(context, compiledContext, context.getVarScope());
    }

    @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
    { 
      registerLazy(context, compiledContext, classLoader, context.getVarScope());
    }

    private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("desugar");
      desugar.init(compiledContext);
      varScope.addSVar("inline_td_1_0", new InteropSDefT(inline_td_1_0.instance, context));
      varScope.addSVar("desugar_0_0", new InteropSDefT(desugar_0_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
      varScope.addSVar("test_desugar_vardecl_single_0_0", new InteropSDefT(test_desugar_vardecl_single_0_0.instance, context));
      varScope.addSVar("test_desugar_vardecl_double_0_0", new InteropSDefT(test_desugar_vardecl_double_0_0.instance, context));
      varScope.addSVar("test_desugar_stmt_0_0", new InteropSDefT(test_desugar_stmt_0_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("desugar");
      desugar.init(compiledContext);
      varScope.addSVar("inline_td_1_0", new InteropSDefT(classLoader, "desugar$inline_td_1_0", context));
      varScope.addSVar("desugar_0_0", new InteropSDefT(classLoader, "desugar$desugar_0_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "desugar$main_0_0", context));
      varScope.addSVar("test_desugar_vardecl_single_0_0", new InteropSDefT(classLoader, "desugar$test_desugar_vardecl_single_0_0", context));
      varScope.addSVar("test_desugar_vardecl_double_0_0", new InteropSDefT(classLoader, "desugar$test_desugar_vardecl_double_0_0", context));
      varScope.addSVar("test_desugar_stmt_0_0", new InteropSDefT(classLoader, "desugar$test_desugar_stmt_0_0", context));
    }
  }
}