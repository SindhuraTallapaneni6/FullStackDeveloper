package com.cts.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.cts.training.dao.ProductDAO;

import com.cts.training.model.Product;


@Controller
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	@GetMapping("/product-home")
	public String ProductPage(Model model)
	{
		List<Product> products = productDAO.getAllProducts(); 
		  model.addAttribute("productslist", products);
	 
		model.addAttribute("productmodel", new Product());
		return "ProductView";
	}
	@PostMapping("/product/save")
	
	public String addProduct(@ModelAttribute("productmodel") Product product) {//gets data from the form
		productDAO.addOrUpdate(product);
		
		return "redirect:/product-home";
	}
	@GetMapping("/removeproduct/{id}")//{}-->path Variable
	public String deleteProduct(@PathVariable("id") int id) {//to get path variable dynamic or we can use @RequestParam
		Product product = productDAO.getProductById(id);
		productDAO.deleteProduct(product);
		return "redirect:/product-home";
		
	}
	@GetMapping("/updateproduct/{id}")
	public String updateProduct(@PathVariable("id") int id, Model model)
	{
		Product product= productDAO.getProductById(id);
		model.addAttribute("productmodel",product);
		List<Product> products= productDAO.getAllProducts();
		model.addAttribute("productslist", products);
		return "ProductView";
	}
}
