package com.dio.santander.bankline.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

import com.dio.santander.bankline.api.dto.newAccountHolder;
import com.dio.santander.bankline.api.model.Account;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.repository.accountHolderRepository;

@Service
public class accountHolderService {

	@Autowired
	private accountHolderRepository repository;
	public void save(newAccountHolder NewAccountHolder) {
		
		AccountHolder accountHolder = new AccountHolder();
		accountHolder.setCpf(NewAccountHolder.getCpf());
		accountHolder.setName(NewAccountHolder.getName());
		
		Account account = new Account();
		account.setBalance(0.0);
		account.setNumber(new Date().getTime());
		
		accountHolder.setAccount(account);
		
		repository.save(accountHolder);
		
	}
	
}
