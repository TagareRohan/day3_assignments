package com.training;

public class Lawyer extends ServiceProvider {

	
	private String type;
	private String qualification;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Lawyer(long phoneNumber, String firstName, String type, String qualification) {
		super(phoneNumber, firstName);
		this.type = type;
		this.qualification = qualification;
	}
	
	public double calculateFees()
	{
		double baseAmount=3000.0;
		if (this.type.equalsIgnoreCase("High Court"))
		{
			baseAmount = baseAmount*10;
		}
		else if (this.type.equalsIgnoreCase("Supreme Court"))
		{
			baseAmount = baseAmount*20;
		}
		else
		{
			baseAmount=baseAmount*5;
		}
		
		return baseAmount;
		
		
	}
	
	
}
