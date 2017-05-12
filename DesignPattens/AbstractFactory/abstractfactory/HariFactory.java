package abstractfactory;

public class HariFactory implements MyFactory{

	@Override
	public Foods myfood() {
		// TODO Auto-generated method stub
		return new Chocolates();
	}

	@Override
	public Games myGame() {
		// TODO Auto-generated method stub
		return new Football();
	}

	@Override
	public Shape myShape() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

}
