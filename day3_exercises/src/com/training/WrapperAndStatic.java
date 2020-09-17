package com.training;

public class WrapperAndStatic {

	
	private int id;
	private static String aadharNumber;
	
	public void show()
	{
		System.out.println("static: "+aadharNumber);
		System.out.println("non: "+id);
	}
	
	public static void display()
	{
		System.out.println("static: "+aadharNumber);
		//System.out.println("non: "+id);
		
	}
	
	public int parse(String strNumber)
	{
		int num=Integer.parseInt(strNumber);
		return num;
	}
	
	public String useToString(int number)
	{
		return Integer.toString(number);
	}
	
	public Integer useValueOf()
	{
		String age="22";
		return Integer.valueOf(age,8);
	}
}
