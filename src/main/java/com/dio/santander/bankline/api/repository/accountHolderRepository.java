package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.AccountHolder;

public interface accountHolderRepository extends JpaRepository<AccountHolder, Integer> {

}
