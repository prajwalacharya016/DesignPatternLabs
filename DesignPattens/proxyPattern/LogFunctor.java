package proxyPattern;
public class LogFunctor implements Functor {
    @Override
    public void preLog() {
        System.out.println("Before");
    }
    @Override
    public void postLog() {
        System.out.println("After");
    }
}
