package com.example.test;

import java.util.Scanner;

import com.example.services.LoginImpl;
import com.example.services.LoginInterface;
import com.example.services.ServiceImpl;
import com.example.services.ServiceInterface;
import com.example.beans.*;
import java.util.*;

public class TestAccount {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice=0;
		System.out.println("Enter username");
		String uname = sc.next();
		System.out.println("Enter password");
		String pass = sc.next();
		LoginInterface login = new LoginImpl();
		String role = login.Authenticate(uname, pass);
		ServiceInterface si = new ServiceImpl();
		if(role.equals("users")) {
			do {
				System.out.println("enter choice from menu below");
				System.out.println("1. Create an Account \n2. Withdraw Amount \n3. Deposit Account \n4. Transfer Funds");
				System.out.println("5. Display All \n6.Change pin \n7. Check balance \n8. Exit");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					//Add acount
					System.out.println("enter your choice: ");
					System.out.println("1. Saving Account");
					System.out.println("2. Current Account");
					int ch = sc.nextInt();
					boolean status = si.AddAccount(ch);
					if(status) {
						System.out.println("Account created");
					}
					else {
						System.out.println("Something went wrong...");
					}
					break;
				case 2:
					//withdraw amount
					System.out.println("Enter account id");
					String id = sc.next();
					System.out.println("Enter pin");
					int pin = sc.nextInt();
					System.out.println("Enter amount you want to withdraw");
					double amnt = sc.nextDouble();
					double result = si.Withdraw(id, pin, amnt);
					if(result==1) {
						System.out.println("Amount deducted");
					}
					else if(result==-1) {
						System.out.println("acid or pin are wrong");
					}
					else {
						System.out.println("Insufficent balance");
					}
					break;
				case 3:
					//deposit amount
					System.out.println("Enter account id");
					id = sc.next();
					System.out.println("Enter pin");
					pin = sc.nextInt();
					System.out.println("Enter amount you want to withdraw");
					amnt = sc.nextDouble();
					boolean stat = si.DepositAmount(id, pin, amnt);
					if(stat) {
						System.out.println("Amount added");
					}
					else {
						System.out.println("wrong credentials");
					}
					break;
				case 4:
					//Transfer fund
					break;
				case 5:
					//Display all
					Set<Account>aset = si.displayAll();
					for(Account ac:aset) {
						System.out.println(ac);
					}
					break;
				case 6:
					//change pin
					break;
				case 7:
					//check balance
					break;
				case 8:
					System.out.println("thank you");
					break;
				}
			} while(choice!=8);
		}


	}

}
