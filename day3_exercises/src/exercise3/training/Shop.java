package exercise3.training;

import exercise3.training.interfaces.RentalAgency;

public class Shop {
	
	public RentalAgency getProduct(int key)
	{
		switch(key)
		{
		case 1:
			return new Computer();
		case 2:
			return new Furniture();
		case 3:
			return new AirConditioner();
		default:
			return null;
		}
	}
	
	

}
