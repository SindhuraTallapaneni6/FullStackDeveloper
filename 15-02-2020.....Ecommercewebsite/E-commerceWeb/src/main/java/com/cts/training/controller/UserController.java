package com.cts.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.UserDAO;
import com.cts.training.model.Category;
import com.cts.training.model.User;



@Controller
public class UserController {
	@Autowired
	UserDAO userDAO;
	@GetMapping("/user-home")
	public String UserPage(Model model)
	{
		List<User> users = userDAO.getAllUsers(); 
		  model.addAttribute("userslist", users);
	 
		model.addAttribute("usermodel", new User());
		return "UserView";
	}
	@PostMapping("/user/save")
	
	public String addUser(@ModelAttribute("usermodel") User user) {//gets data from the form
		userDAO.addOrUpdate(user);
		
		return "redirect:/user-home";
	}
	@GetMapping("/removeuser/{id}")//{}-->path Variable
	public String deleteUser(@PathVariable("id") int id) {//to get path variable dynamic or we can use @RequestParam
		User user = userDAO.getUserById(id);
		userDAO.deleteUser(user);
		return "redirect:/user-home";
		
	}
	@GetMapping("/updateuser/{id}")
	public String updateUser(@PathVariable("id") int id, Model model)
	{
		User user= userDAO.getUserById(id);
		model.addAttribute("usermodel",user);
		List<User> users= userDAO.getAllUsers();
		model.addAttribute("userslist", users);
		return "UserView";
	}

}
