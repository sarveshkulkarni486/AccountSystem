package com.example.beans;

public class Savings extends Account {
	private int chequenumber;
	private static float int_rate;
	private static double min_balance;
	static {
		int_rate=0.04f;
		min_balance=1000f;
		
	}
	public Savings() {
		super();
	}
	public Savings(String acname, int pin, String questions, String answers, double balance, int chequenumber) {
		super("s", acname, pin, questions, answers, balance);
		this.chequenumber = chequenumber;
	}
	public int getChequenumber() {
		return chequenumber;
	}
	public void setChequenumber(int chequenumber) {
		this.chequenumber = chequenumber;
	}
	public static float getInt_rate() {
		return int_rate;
	}
	public static void setInt_rate(float int_rate) {
		Savings.int_rate = int_rate;
	}
	public static double getMin_balance() {
		return min_balance;
	}
	public static void setMin_balance(double min_balance) {
		Savings.min_balance = min_balance;
	}
	public String toString() {
		return super.toString()+"Savings [chequenumber=" + chequenumber + "]";
	}
	@Override
	public double withdraw(double amnt) {
		if(balance-amnt>min_balance) {
			return balance-amnt;
		}
		return 2;
	}
	

}
