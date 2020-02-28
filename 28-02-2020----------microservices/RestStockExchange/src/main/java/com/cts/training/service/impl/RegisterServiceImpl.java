//package com.cts.training.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.BeanUtils;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cts.training.dao.RegisterRepo;
//import com.cts.training.dto.RegisterDTO;
//import com.cts.training.model.Register;
//import com.cts.training.service.RegisterService;
//
//@Service
//public class RegisterServiceImpl implements RegisterService{
//	
//	@Autowired
//	RegisterRepo rr;
//
//	@Override
//	public String addUser(String rd) {
//		Register re = new Register();
//		BeanUtils.copyProperties(rd, re);
//		rr.save(re);
//		
//		return rd;
//	}
//
//	
//
//	@Override
//	public void deleteUser(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public RegisterDTO updateUser(RegisterDTO user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<RegisterDTO> getAllUsers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public RegisterDTO getUserById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
