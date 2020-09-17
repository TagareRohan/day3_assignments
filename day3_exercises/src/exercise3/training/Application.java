package exercise3.training;

import java.util.Scanner;

import exercise3.training.interfaces.RentalAgency;

public class Application {

	
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		Shop obj = new Shop();
		
		int choice = 0;
		String response = "";
		
		do
		{
			System.out.println("1)Computer\n2)Furniture\n3)AirConditioner\nEnter Choice");
			choice = scanner.nextInt();
			
			RentalAgency rentObj = obj.getProduct(choice);
			
			if (rentObj == null)
			{
				System.out.println("enter 1,2,3");
			}
			else
			{
				rentObj.calculateRent();

			}
			
			
			System.out.println("Rent another?");
			response = scanner.next();
		}while(response.equalsIgnoreCase("Yes"));
	}
}
