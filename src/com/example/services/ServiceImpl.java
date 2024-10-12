package com.example.services;

import com.example.beans.Account;
import com.example.beans.Current;
import com.example.beans.Savings;
import com.example.dao.DaoImpl;
import com.example.dao.DaoInterface;
import java.util.*;
public class ServiceImpl implements ServiceInterface {
	static Scanner sc = new Scanner(System.in);
	DaoInterface acdao = new DaoImpl();
	Account acc;


	public boolean AddAccount(int ch) {
		System.out.println("enter account name");
		String nm = sc.next();
		System.out.println("enter pin");
		int pin = sc.nextInt();
		sc.nextLine();
		System.out.println("enter security question");
		String question = sc.nextLine();
		System.out.println("enter security answer");
		String answer = sc.next();
		System.out.println("enter balance");
		double balance = sc.nextDouble();
		if(ch==1) {
			//for saving account
			System.out.println("enter cheque number");
			int cheque = sc.nextInt();
			acc = acdao.CreateAccount(new Savings(nm, pin, question, answer, balance, cheque));
			return true;
		}
		else if(ch==2) {
			System.out.println("enter minimum transaction");
			int min_trans = sc.nextInt();
			Account acc = acdao.CreateAccount(new Current(nm, pin, question, answer, balance, min_trans));
			return true;
		}
		return false;
	}
	
	private Account GetById(String id, int pin) {
		return acdao.FindById(id, pin);
	}


	public int Withdraw(String id, int pin, double amnt) {
		Account ac = GetById(id, pin);
		if(ac!=null) {
			ac.withdraw(amnt);
		}
		return -1;
	}

	public boolean DepositAmount(String id, int pin, double amnt) {
		Account ac = GetById(id, pin);
		if(ac!=null) {
			ac.Deposit(amnt);
		}
		return false;
	}

	public Set<Account> displayAll() {
		return acdao.GetAll();
	}

}
