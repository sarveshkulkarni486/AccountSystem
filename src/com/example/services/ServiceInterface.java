package com.example.services;

import java.util.Set;

import com.example.beans.Account;

public interface ServiceInterface {

	boolean AddAccount(int ch);

	int Withdraw(String id, int pin, double amnt);

	boolean DepositAmount(String id, int pin, double amnt);

	Set<Account> displayAll();

}
