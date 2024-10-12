package com.example.beans;
import java.util.*;
abstract public class Account {
	private String acid;
	private String acname;
	private int pin;
	private String questions;
	private String answers;
	protected double balance;
	static int cnt;
	static {
		cnt = 1;
	}
	public Account() {
		super();
	}
	public Account(String type, String acname, int pin, String questions, String answers, double balance) {
		super();
		this.acid=generateId(type, acname, pin);
		this.acname=acname;
		this.pin=pin;
		this.questions=questions;
		this.answers=answers;
		this.balance=balance;
		
	}
	private String generateId(String type, String acname, int pin) {
		String id = null;
		if(acname!=null) {
			id = type+acname.substring(0, 4)+pin+cnt;
		}
		else {
			id = type+"xx"+pin+cnt;
		}
		return id;
	}
	//getters and setters;
	public String getAcid() {
		return acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Account.cnt = cnt;
	}
	public String toString() {
		return "Account [acid=" + acid + ", acname=" + acname + ", pin=" + pin + ", questions=" + questions
				+ ", answers=" + answers + ", balance=" + balance + "]";
	}
	public abstract double withdraw(double amnt);
	public double Deposit(double amnt) {
		return balance=balance+amnt;
	}
	

}
