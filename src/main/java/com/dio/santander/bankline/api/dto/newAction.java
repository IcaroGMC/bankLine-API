package com.dio.santander.bankline.api.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.dio.santander.bankline.api.model.ActionsType;

public class newAction {

	private String description;
	private Double value;
	private Integer accountId;
	private ActionsType type;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	public ActionsType getType() {
		return type;
	}
	
	public void setType(ActionsType type) {
		this.type = type;
	}
	

}


