package com.cts.training.service;

import java.util.List;

import com.cts.training.dto.RegisterDTO;

public interface RegisterService {
	
	
	//public RegisterDTO insert(RegisterDTO rd);
	public String addUser(RegisterDTO user);
	public void deleteUser(int id);
	public RegisterDTO updateUser(RegisterDTO user);
	public List<RegisterDTO> getAllUsers();
	public RegisterDTO getUserById(int id);
	
	

}
