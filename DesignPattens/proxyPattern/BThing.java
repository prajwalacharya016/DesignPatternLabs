package proxyPattern;
public class BThing<T> implements Thing<T> {
	
	private String name;
	
	public BThing(String name) {
		this.name = name;
	}

	@Override
	public void compute(T str) {
		System.out.println(str + ": " + name);
	}

}
