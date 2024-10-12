package com.example.dao;

import java.util.HashSet;
import java.util.Set;

import com.example.beans.Account;
import com.example.beans.Savings;

public class DaoImpl implements DaoInterface{
	Account acc;
	public static Set<Account> accset;
	static {
		accset = new HashSet<Account>();
	}
	public Account CreateAccount(Account account) {
		accset.add(account);
		return null;
	}
	public Account FindById(String id, int pin) {
		for(Account ac:accset) {
			if(ac.getAcid().equals(id) && ac.getPin()==pin) {
				return ac;
			}
		}
		return null;
	}
	public Set<Account> GetAll(){
		return accset;
	}

}
