package abstractfactory;

public class RamFactory implements MyFactory {

	@Override
	public Foods myfood() {
		// TODO Auto-generated method stub
		return new Cookies();
	}

	@Override
	public Games myGame() {
		// TODO Auto-generated method stub
		return new Cricket();
	}

	@Override
	public Shape myShape() {
		// TODO Auto-generated method stub
		return new Circle();
	}

}
