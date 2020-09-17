package com.training;

public class Application {

	
	public static void main(String[] args)
	{
		Lawyer rajesh = new Lawyer(4949,"Rajesh","HighCourt","LLB");
		Musician sharma = new Musician(2345,"Sharma","Flute","Pune");
		
		Billing bill = new Billing();
		// bill.printFees(sharma);
		// bill.printFees(rajesh);
		
		WrapperAndStatic ob = new WrapperAndStatic();
		System.out.println(ob.parse("2"));
		System.out.println(ob.useToString(2).length());
		System.out.println(ob.useValueOf());
		
	}
}
