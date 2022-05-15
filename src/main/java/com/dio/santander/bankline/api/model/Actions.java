package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

public class Actions {

	private Integer id;
	private LocalDateTime date;
	private String description;
	private Double value;
	private ActionsType type;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
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
	
	public ActionsType getType() {
		return type;
	}
	
	public void setType(ActionsType type) {
		this.type = type;
	}
	
	
	
}
