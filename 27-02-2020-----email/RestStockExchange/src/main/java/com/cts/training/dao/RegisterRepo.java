package com.cts.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cts.training.model.Register;

public interface RegisterRepo extends JpaRepository<Register, Integer>{

	public Register findByEmail(String email);
}
