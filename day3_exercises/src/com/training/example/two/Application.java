package com.training.example.two;

import java.util.Scanner;

import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ShowRoom saiCars = new ShowRoom();
		Scanner scanner = new Scanner(System.in); 
		
		ShowRoom objShow = new NewShowRoom();
		int key=0;
		String choice="";
		do
		{
			System.out.println("enter choice");
			key=scanner.nextInt();
			
			Automobile selectedNew = objShow.getProduct(key);
			if (selectedNew == null)
			{
				System.out.println("choose 1,2 or 3");
			}
			else
			{
				objShow.printEstimate(selectedNew);
			}
			
			System.out.println("exit?");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("No"));
		
		

	}

}
