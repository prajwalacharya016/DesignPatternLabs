package proxyPattern;
public class AThing<T> implements Thing<T> {
	
	private String name;
	
	public AThing(String name) {
		this.name = name;
	}

	@Override
	public void compute(T str) {
		System.out.println(str + ": " + name);
	}

}
