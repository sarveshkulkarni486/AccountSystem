package com.example.dao;

import java.util.Set;

import com.example.beans.Account;
import com.example.beans.Savings;

public interface DaoInterface {

	Account CreateAccount(Account account);

	Account FindById(String id, int pin);

	Set<Account> GetAll();
	

}
