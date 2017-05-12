package Composition;
public class Lab3 {
    static public void main(String args[]) {
        CompositeInterface cab = new Cabinet();
        CompositeInterface board = new Board();

        CompositeInterface d1= new Drive();
        CompositeInterface d2= new Drive();
        CompositeInterface d3= new Drive();
        CompositeInterface bus = new Bus();

        CompositeInterface card1 = new Card();
        CompositeInterface card2 = new Card();
        CompositeInterface card3 = new Card();

        cab.set(board);
        cab.add(d1);
        cab.add(d1);
        cab.add(d1);

        board.set(bus);
        board.add(card1);
        board.add(card2);
        board.add(card3);
        
        System.out.println("Total price of computer is: "+ cab.computePrice());
    }
}
