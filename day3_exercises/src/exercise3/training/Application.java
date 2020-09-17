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
		double total=0.0;
		
		RentalAgency objList[] = new RentalAgency[1000];
		int i=0;
		do
		{
			System.out.println("1)Computer\n2)Furniture\n3)AirConditioner\nEnter Choice");
			choice = scanner.nextInt();
			
			RentalAgency rentObj = obj.getProduct(choice);
			int duration = 0;
			System.out.println("Enter duration");
			duration = scanner.nextInt();
			
			if (rentObj == null)
			{
				System.out.println("enter 1,2,3");
			}
			else
			{
				total=total+rentObj.calculateRent(duration);
				objList[i]=rentObj;
			}
			
			
			System.out.println("Rent another?");
			response = scanner.next();
			i++;
		}while(response.equalsIgnoreCase("Yes"));
		
		for (int k=0;k<i;k++)
		{
			System.out.println("Name: "+objList[k].getName());
			System.out.println("Rate: "+objList[k].getRate());
		}
		System.out.println("Total Rent: "+total);
	}
}
