package com.dio.santander.bankline.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.newAccountHolder;
import com.dio.santander.bankline.api.dto.newAction;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.model.Actions;
import com.dio.santander.bankline.api.repository.accountHolderRepository;
import com.dio.santander.bankline.api.repository.actionsRepository;
import com.dio.santander.bankline.api.service.accountHolderService;
import com.dio.santander.bankline.api.service.actionService;

import java.util.List;

@RestController
@RequestMapping("/actions")
public class actionsController {
	
	@Autowired
	private actionsRepository repository;
	
	@Autowired
	private actionService service;
	
	@GetMapping
	public List<Actions> findAll() {
		
		return repository.findAll();
		
	}
	
	@PostMapping
	public void save(@RequestBody newAction action) {
		service.save(action);
	}
	
}
