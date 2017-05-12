package Composition;

import java.util.*;

public class Cabinet implements CompositeInterface {
	private CompositeInterface board;
	private Vector<CompositeInterface> drivelist = new Vector();

	public double netPrice() {
		return 6.00;
	}

	public double discountPrice() {
		return 3.00;
	}

	public double computePrice() {
		double tmp = netPrice();
		if (board != null)
			tmp += board.computePrice();
		for (CompositeInterface drive : drivelist)
			tmp += drive.computePrice();
		return tmp;
	}

	@Override
	public void set(CompositeInterface b) {
		board = b;
		// TODO Auto-generated method stub

	}

	@Override
	public void add(CompositeInterface d) {
		drivelist.addElement(d);
		// TODO Auto-generated method stub

	}
}
