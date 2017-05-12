package proxyPattern;
public class ProxyDemo {
	public static void main(String[] args) {
		/*
		 * Output
		 * 
		 * Hello: A
		 * Before
		 * Hello: A
		 * After
		 * Hello: B
		 * Before
		 * Hello: B
		 * After
		*/

        Functor prePostFunctor = new LogFunctor();

		Thing t = new AThing("A");
		t.compute("Hello"); // 3b
		
		t = new LogProxy(t, prePostFunctor);
		t.compute("Hello"); //3d
		
		t = new BThing("B");
		t.compute("Hello"); //3e
		
		t = new LogProxy(t, prePostFunctor);
		t.compute("Hello"); //3e
		
		
	}
}
