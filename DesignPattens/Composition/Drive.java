package Composition;

public class Drive implements CompositeInterface {
	public double netPrice() {
		return 10.00;
	}

	public double discountPrice() {
		return 4.00;
	}

	public double computePrice() {
		return discountPrice();
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
