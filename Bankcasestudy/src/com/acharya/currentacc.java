package com.acharya;

public abstract class currentacc extends bankfactory {
	
	private final float creditLimit;
	 
	public currentacc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public void withdraw(float creditLimit) {
	System.out.println("you balance is updated:"+ creditLimit);
	
	}	
		
	

	@Override
	public String toString() {
		return "currentacc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	}


