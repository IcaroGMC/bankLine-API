package com.dio.santander.bankline.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.newAction;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.model.Actions;
import com.dio.santander.bankline.api.model.ActionsType;
import com.dio.santander.bankline.api.repository.accountHolderRepository;
import com.dio.santander.bankline.api.repository.actionsRepository;

import ch.qos.logback.core.joran.action.Action;

@Service
public class actionService {

	@Autowired
	private accountHolderRepository accountHolderRepository;
	private actionsRepository repository;
	public void save (newAction newAction) {
		
		Actions action = new Actions();
		
		Double value = newAction.getType()==ActionsType.RECEIPT ? newAction.getValue() : newAction.getValue() * -1;
		
		action.setDate(LocalDateTime.now());
		action.setDescription(newAction.getDescription());
		action.setAccountId(newAction.getAccountId());
		action.setType(newAction.getType());
		action.setValue(value);
		
		AccountHolder accountHolder = accountHolderRepository.findById(newAction.getAccountId()).orElse(null);
		
		if (accountHolder != null) {
			
			accountHolder.getAccount().setBalance(accountHolder.getAccount().getBalance() + value);
			
			accountHolderRepository.save(accountHolder);
			
		}
		
		repository.save(action);
		
	}
	
}
