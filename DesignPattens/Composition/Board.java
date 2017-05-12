package Composition;

import java.util.*;

public class Board implements CompositeInterface {
	private CompositeInterface bus;
	private Vector<CompositeInterface> cardlist = new Vector();


	public double netPrice() {
		return 26.00;
	}

	public double discountPrice() {
		return 6.00;
	}

	public double computePrice() {
		double tmp = discountPrice();
		if (bus != null)
			tmp += bus.computePrice();
		for (CompositeInterface card : cardlist)
			tmp += card.computePrice();
		return tmp;
	}

	@Override
	public void set(CompositeInterface b) {
		bus = b;
		// TODO Auto-generated method stub

	}

	@Override
	public void add(CompositeInterface d) {
		cardlist.addElement(d);
		// TODO Auto-generated method stub

	}

}
