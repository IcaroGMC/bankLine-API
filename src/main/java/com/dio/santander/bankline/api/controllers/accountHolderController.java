package com.dio.santander.bankline.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.newAccountHolder;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.repository.accountHolderRepository;
import com.dio.santander.bankline.api.service.accountHolderService;

import java.util.List;

@RestController
@RequestMapping("/accountHolder")
public class accountHolderController {
	
	@Autowired
	private accountHolderRepository repository;
	
	@Autowired
	private accountHolderService service;
	
	@GetMapping
	public List<AccountHolder> findAll() {
		
		return repository.findAll();
		
	}
	
	@PostMapping
	public void save(@RequestBody newAccountHolder accountHolder) {
		service.save(accountHolder);
	}
	
}
