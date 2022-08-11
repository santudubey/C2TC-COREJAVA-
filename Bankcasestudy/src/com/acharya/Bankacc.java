package com.acharya;

public abstract class Bankacc<Saving, Current> {
	
	public abstract Saving  getNewSavingAccount(int AccNo, string accNm, float accBal,boolean isSalaried);
	
	public abstract Current  getNewCurrentAccount(int AccNo,string  accNm,float accBal, float  creditLimit);
}
