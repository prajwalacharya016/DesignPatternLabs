package abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		MyFactory factory= new RamFactory();
		Foods food=factory.myfood();
		Games game=factory.myGame();
		Shape shape=factory.myShape();
		
		System.out.println(food.ReturnName()+" "+food.ReturnType());
		System.out.println(game.returnPlayedWith());
		System.out.println(shape.returnMyShapeName());
		
		MyFactory secfactory= new HariFactory();
		Foods secfood=secfactory.myfood();
		Games secgame=secfactory.myGame();
		Shape secshape=secfactory.myShape();
		
		System.out.println(secfood.ReturnName()+" "+secfood.ReturnType());
		System.out.println(secgame.returnPlayedWith());
		System.out.println(secshape.returnMyShapeName());
	}

}
