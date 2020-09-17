package exercise3.training;

import exercise3.training.interfaces.RentalAgency;
import java.util.*;

public class Furniture implements RentalAgency {

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
	public void calculateRent()
	{
		Scanner scanner = new Scanner(System.in);
		double rent=0.0;
		int duration=0;
		System.out.println("enter duration");
		duration = scanner.nextInt();
		rent=duration*this.getRate();
		System.out.println("Rent: "+rent);
	}

}
