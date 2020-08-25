package com.LCFour.api;

public class CreditCard {

	private int firstFourDigit;
	private int secondFourDigit;
	private int thirdFourDigit;
	private int fourthFourDigit;

	public int getFirstFourDigit() {
		return firstFourDigit;
	}
	public void setFirstFourDigit(int firstFourDigit) {
		this.firstFourDigit = firstFourDigit;
	}
	public int getSecondFourDigit() {
		return secondFourDigit;
	}
	public void setSecondFourDigit(int secondFourDigit) {
		this.secondFourDigit = secondFourDigit;
	}
	public int getThirdFourDigit() {
		return thirdFourDigit;
	}
	public void setThirdFourDigit(int thirdFourDigit) {
		this.thirdFourDigit = thirdFourDigit;
	}
	public int getFourthFourDigit() {
		return fourthFourDigit;
	}
	public void setFourthFourDigit(int fourthFourDigit) {
		this.fourthFourDigit = fourthFourDigit;
	}
	
	@Override
	public String toString() {
		return getFirstFourDigit()+"-"+getSecondFourDigit()+"-"+getThirdFourDigit()+"-"+getFourthFourDigit();
	}
	
}
