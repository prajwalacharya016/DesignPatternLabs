package Composition;

public class Card implements CompositeInterface {
	public double netPrice() {
		return 10.00;
	}

	public double discountPrice() {
		return 1.00;
	}

	public double computePrice() {
		return netPrice();
	}

	@Override
	public void set(CompositeInterface b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(CompositeInterface d) {
		// TODO Auto-generated method stub

	}
}
