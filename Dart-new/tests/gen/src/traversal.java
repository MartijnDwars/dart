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

@SuppressWarnings("all") public class traversal  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constCons33;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constCons32;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constCons31;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm constNil9;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm const87;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static Context init(Context context)
  { 
    synchronized(traversal.class)
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
          context.registerComponent("traversal");
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
        result = context.invokeStrategyCLI(main_0_0.instance, "traversal", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("traversal" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
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
      return context.invokeStrategyCLI(main_0_0.instance, "traversal", args);
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
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    const87 = termFactory.makeString("inline-td");
    const88 = termFactory.makeString("inline on empty list");
    constNil9 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const89 = termFactory.makeString("inline with id");
    const90 = termFactory.makeInt(3);
    constCons31 = (IStrategoTerm)termFactory.makeListCons(traversal.const90, (IStrategoList)traversal.constNil9);
    const91 = termFactory.makeInt(2);
    constCons32 = (IStrategoTerm)termFactory.makeListCons(traversal.const91, (IStrategoList)traversal.constCons31);
    const92 = termFactory.makeInt(1);
    constCons33 = (IStrategoTerm)termFactory.makeListCons(traversal.const92, (IStrategoList)traversal.constCons32);
    const93 = termFactory.makeTuple(traversal.const90, traversal.constNil9);
    const94 = termFactory.makeString("inline with [<id>]");
  }

  @SuppressWarnings("all") public static class inline_td_1_0 extends Strategy 
  { 
    public static inline_td_1_0 instance = new inline_td_1_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_5166)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("inline_td_1_0");
      Fail394:
      { 
        IStrategoTerm i_5166 = null;
        IStrategoTerm j_5166 = null;
        IStrategoTerm k_5166 = null;
        term = m_5166.invoke(context, term);
        if(term == null)
          break Fail394;
        IStrategoTerm term32 = term;
        Success32:
        { 
          Fail395:
          { 
            IStrategoTerm l_5166 = null;
            l_5166 = term;
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail395;
            term = l_5166;
            { 
              IStrategoTerm term33 = term;
              Success33:
              { 
                Fail396:
                { 
                  if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                    break Fail396;
                  if(true)
                    break Success33;
                }
                term = term33;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail394;
                i_5166 = ((IStrategoList)term).head();
                k_5166 = ((IStrategoList)term).tail();
                term = m_5166.invoke(context, i_5166);
                if(term == null)
                  break Fail394;
                j_5166 = term;
                term = this.invoke(context, k_5166, m_5166);
                if(term == null)
                  break Fail394;
                term = termFactory.makeTuple(j_5166, term);
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail394;
              }
              if(true)
                break Success32;
            }
          }
          term = term32;
          lifted315 lifted3150 = new lifted315();
          lifted3150.m_5166 = m_5166;
          term = SRTS_all.instance.invoke(context, term, lifted3150);
          if(term == null)
            break Fail394;
        }
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
      Fail397:
      { 
        term = test_suite_2_0.instance.invoke(context, term, lifted316.instance, lifted317.instance);
        if(term == null)
          break Fail397;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class test_inline_empty_0_0 extends Strategy 
  { 
    public static test_inline_empty_0_0 instance = new test_inline_empty_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("test_inline_empty_0_0");
      Fail398:
      { 
        term = apply_test_4_0.instance.invoke(context, term, lifted318.instance, lifted319.instance, lifted321.instance, lifted322.instance);
        if(term == null)
          break Fail398;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class test_inline_id_0_0 extends Strategy 
  { 
    public static test_inline_id_0_0 instance = new test_inline_id_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("test_inline_id_0_0");
      Fail399:
      { 
        term = apply_test_4_0.instance.invoke(context, term, lifted323.instance, lifted324.instance, lifted326.instance, lifted327.instance);
        if(term == null)
          break Fail399;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class test_inline_0_0 extends Strategy 
  { 
    public static test_inline_0_0 instance = new test_inline_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("test_inline_0_0");
      Fail400:
      { 
        term = apply_test_4_0.instance.invoke(context, term, lifted328.instance, lifted329.instance, lifted331.instance, lifted332.instance);
        if(term == null)
          break Fail400;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted332 extends Strategy 
  { 
    public static final lifted332 instance = new lifted332();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail401:
      { 
        term = traversal.constCons33;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted331 extends Strategy 
  { 
    public static final lifted331 instance = new lifted331();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail402:
      { 
        term = traversal.constCons33;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted329 extends Strategy 
  { 
    public static final lifted329 instance = new lifted329();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail403:
      { 
        term = inline_td_1_0.instance.invoke(context, term, lifted330.instance);
        if(term == null)
          break Fail403;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted330 extends Strategy 
  { 
    public static final lifted330 instance = new lifted330();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail404:
      { 
        IStrategoTerm term34 = term;
        Success34:
        { 
          Fail405:
          { 
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail405;
            if(true)
              break Success34;
          }
          term = term34;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)traversal.constNil9);
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted328 extends Strategy 
  { 
    public static final lifted328 instance = new lifted328();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail406:
      { 
        term = traversal.const94;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted327 extends Strategy 
  { 
    public static final lifted327 instance = new lifted327();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail407:
      { 
        term = make$Conc_0_0.instance.invoke(context, traversal.const93);
        if(term == null)
          break Fail407;
        term = termFactory.makeTuple(traversal.const91, term);
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail407;
        term = termFactory.makeTuple(traversal.const92, term);
        term = make$Conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail407;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted326 extends Strategy 
  { 
    public static final lifted326 instance = new lifted326();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail408:
      { 
        term = traversal.constCons33;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted324 extends Strategy 
  { 
    public static final lifted324 instance = new lifted324();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail409:
      { 
        term = inline_td_1_0.instance.invoke(context, term, _Id.instance);
        if(term == null)
          break Fail409;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted323 extends Strategy 
  { 
    public static final lifted323 instance = new lifted323();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail410:
      { 
        term = traversal.const89;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted322 extends Strategy 
  { 
    public static final lifted322 instance = new lifted322();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail411:
      { 
        term = traversal.constNil9;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted321 extends Strategy 
  { 
    public static final lifted321 instance = new lifted321();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail412:
      { 
        term = traversal.constNil9;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted319 extends Strategy 
  { 
    public static final lifted319 instance = new lifted319();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail413:
      { 
        term = inline_td_1_0.instance.invoke(context, term, _Id.instance);
        if(term == null)
          break Fail413;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted318 extends Strategy 
  { 
    public static final lifted318 instance = new lifted318();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail414:
      { 
        term = traversal.const88;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted317 extends Strategy 
  { 
    public static final lifted317 instance = new lifted317();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail415:
      { 
        term = test_inline_empty_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail415;
        term = test_inline_id_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail415;
        term = test_inline_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail415;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted316 extends Strategy 
  { 
    public static final lifted316 instance = new lifted316();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail416:
      { 
        term = traversal.const87;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted315 extends Strategy 
  { 
    Strategy m_5166;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail417:
      { 
        term = inline_td_1_0.instance.invoke(context, term, m_5166);
        if(term == null)
          break Fail417;
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
      compiledContext.registerComponent("traversal");
      traversal.init(compiledContext);
      varScope.addSVar("inline_td_1_0", new InteropSDefT(inline_td_1_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
      varScope.addSVar("test_inline_empty_0_0", new InteropSDefT(test_inline_empty_0_0.instance, context));
      varScope.addSVar("test_inline_id_0_0", new InteropSDefT(test_inline_id_0_0.instance, context));
      varScope.addSVar("test_inline_0_0", new InteropSDefT(test_inline_0_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("traversal");
      traversal.init(compiledContext);
      varScope.addSVar("inline_td_1_0", new InteropSDefT(classLoader, "traversal$inline_td_1_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "traversal$main_0_0", context));
      varScope.addSVar("test_inline_empty_0_0", new InteropSDefT(classLoader, "traversal$test_inline_empty_0_0", context));
      varScope.addSVar("test_inline_id_0_0", new InteropSDefT(classLoader, "traversal$test_inline_id_0_0", context));
      varScope.addSVar("test_inline_0_0", new InteropSDefT(classLoader, "traversal$test_inline_0_0", context));
    }
  }
}