package proxyPattern;
public class LogProxy<T> implements Thing<T> {
	
	private String name;
	
	private Thing aThing;

    private Functor prePostFunctor;
	
	public LogProxy(Thing aThing, Functor prePostFunctor) {
		this.aThing = aThing;
        this.prePostFunctor = prePostFunctor;
	}

	@Override
	public void compute(T str) {
		prePostFunctor.preLog();
		aThing.compute(str);
        prePostFunctor.postLog();
	}

}
