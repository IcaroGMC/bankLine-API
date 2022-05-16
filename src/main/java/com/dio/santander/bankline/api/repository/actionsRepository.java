package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Actions;

public interface actionsRepository extends JpaRepository<Actions, Integer> {

}
