package com.acharya.application;

import com.acharya.currentacc;

public class mmccurrentacc extends currentacc  {
	
	
	 
	public mmccurrentacc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	public void withdraw(float creditLimit ) {
	
}
	

	@Override
	public String toString() {
		return "mmccurrentacc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	}
	
