package com.cts.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.SupplierDAO;
import com.cts.training.model.Supplier;



@Controller
public class SupplierController {
	
	@Autowired
	SupplierDAO supplierDAO;
	@GetMapping("/supplier-home")
	public String SuppliersPage(Model model)
	{
		List<Supplier> suppliers = supplierDAO.getAllSuppliers(); 
		  model.addAttribute("supplierslist", suppliers);
	 
		model.addAttribute("suppliermodel", new Supplier());
		return "SupplierView";
	}
	@PostMapping("/supplier/save")
	
	public String addSupplier(@ModelAttribute("suppliermodel") Supplier supplier) {//gets data from the form
		supplierDAO.addOrUpdate(supplier);
		
		return "redirect:/supplier-home";
	}
	@GetMapping("/removesupplier/{id}")//{}-->path Variable
	public String deleteSupplier(@PathVariable("id") int id) {//to get path variable dynamic or we can use @RequestParam
		Supplier supplier = supplierDAO.getSupplierById(id);
		supplierDAO.deleteSupplier(supplier);
		return "redirect:/supplier-home";
		
	}
	@GetMapping("/updatesupplier/{id}")
	public String updateSupplier(@PathVariable("id") int id, Model model)
	{
		Supplier supplier = supplierDAO.getSupplierById(id);
		model.addAttribute("suppliermodel",supplier);
		List<Supplier> suppliers= supplierDAO.getAllSuppliers();
		model.addAttribute("supplierslist", suppliers);
		return "SupplierView";
	}

	
}
