package Composition;

public interface CompositeInterface {
	void set(CompositeInterface b);
	void add(CompositeInterface d);
	double netPrice();
	double discountPrice();
	double computePrice();
	
}
