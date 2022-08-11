package com.acharya.application;

import com.acharya.savingacc;

public class mmsavingacc extends  savingacc {
	
	public mmsavingacc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

	public void withdraw(float accBal ) {
		
	final float MINBAL =50.0f;	
		
		
} 
	
 
	
	@Override
	public String toString() {
		return "mmsavingacc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	}
}