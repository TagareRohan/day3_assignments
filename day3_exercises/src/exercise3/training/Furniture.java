package exercise3.training;

import exercise3.training.interfaces.RentalAgency;
import java.util.*;

public class Furniture implements RentalAgency {

	int quantity=0;
	
	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return 4000.0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Godrej";
	}
	
	@Override
	public double calculateRent(int duration)
	{
		double rent=0.0;
		return rent;
	}
	
	@Override
	public void updateQuantity(int quantity)
	{
		this.quantity=quantity;
		
	}
	
	@Override
	public int getQuantity()
	{
		return this.quantity;
	}
	

}
