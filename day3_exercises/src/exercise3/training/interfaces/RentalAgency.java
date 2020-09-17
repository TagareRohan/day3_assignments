package exercise3.training.interfaces;

public interface RentalAgency {

	double getRate();
	String getName();
	void updateQuantity(int quantity);
	double calculateRent(int duration);
	int getQuantity();
}
