package com.cts.training.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.CategoryDAO;
import com.cts.training.model.Category;



@Controller
public class CategoryController {
	@Autowired
	CategoryDAO categoryDAO;
	@GetMapping("/category-home")
	public String ProductPage(Model model)
	{
		List<Category> catagories = categoryDAO.getAllCategories(); 
		  model.addAttribute("categorylist", catagories);
	 
		model.addAttribute("categorymodel", new Category());
		return "CategoryView";
	}
	@PostMapping("/category/save")
	
	public String addCategory(@ModelAttribute("categorymodel") Category category) {//gets data from the form
		categoryDAO.addOrUpdate(category);
		
		return "redirect:/category-home";
	}
	@GetMapping("/removecategory/{id}")//{}-->path Variable
	public String deleteCategory(@PathVariable("id") int id) {//to get path variable dynamic or we can use @RequestParam
		Category category = categoryDAO.getCategoryById(id);
		categoryDAO.deleteCategory(category);
		return "redirect:/category-home";
		
	}
	@GetMapping("/updatecategory/{id}")
	public String updateCategory(@PathVariable("id") int id, Model model)
	{
		Category category= categoryDAO.getCategoryById(id);
		model.addAttribute("categorymodel",category);
		List<Category> categories= categoryDAO.getAllCategories();
		model.addAttribute("categorylist", categories);
		return "CategoryView";
	}

	
}
