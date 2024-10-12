package com.example.beans;

public class Current extends Account {
	private int min_transaction;
	private static float int_rate;
	private static double min_balance;
	
	static {
		int_rate=0.02f;
		min_balance=0;
	}

	public Current() {
		super();
	}

	public Current(String acname, int pin, String questions, String answers, double balance, int min_transaction) {
		super("c",acname , pin, questions ,answers, balance);
		this.min_transaction = min_transaction;
	}

	public int getMin_transaction() {
		return min_transaction;
	}

	public void setMin_transaction(int min_transaction) {
		this.min_transaction = min_transaction;
	}

	public static float getInt_rate() {
		return int_rate;
	}

	public static void setInt_rate(float int_rate) {
		Current.int_rate = int_rate;
	}

	public static double getMin_balance() {
		return min_balance;
	}

	public static void setMin_balance(double min_balance) {
		Current.min_balance = min_balance;
	}

	public String toString() {
		return super.toString()+"Current [min_transaction=" + min_transaction + "]";
	}

	@Override
	public
	double withdraw(double amnt) {
		if(balance-amnt>min_balance) {
			return balance-amnt;
		}
		return 2;
	}
	

}
