package exercise3.training;

import java.util.Scanner;

import exercise3.training.interfaces.RentalAgency;

public class Computer implements RentalAgency {

	
	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return 1000.0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Dell";
	}
	
	@Override
	public double calculateRent(int duration)
	{
		double rent=0.0;
		rent=duration*this.getRate();
		return rent;
	}
	
	
}
