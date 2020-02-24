package com.cts.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.model.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer>{

}
