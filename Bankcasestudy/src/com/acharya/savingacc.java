package com.acharya;

public abstract class savingacc extends bankfactory {
	
	private boolean isSalary;
	
	public abstract void withdraw (float accBal ) ;
	{
		System.out.println("the charges of the: "+ accBal  );
	} 
	
	private static final float MINBAL=100;
	
	
	
	public savingacc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	{
		public void withdraw (float accBal) {
			
 System.out.println("")
}
	

	public boolean isSalary() {
		return isSalary;
	}


	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}


	public static float getMinbal() {
		return MINBAL;
	}


	@Override
	public String toString() {
		return "savingacc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	}

}
