package Composition;

public class Bus implements CompositeInterface {
	public double netPrice() {
		return 5.00;
	}

	public double discountPrice() {
		return 1.00;
	}

	public double computePrice() {
		return netPrice();
	}

	@Override
	public void set(CompositeInterface value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(CompositeInterface value) {
		// TODO Auto-generated method stub

	}
}
