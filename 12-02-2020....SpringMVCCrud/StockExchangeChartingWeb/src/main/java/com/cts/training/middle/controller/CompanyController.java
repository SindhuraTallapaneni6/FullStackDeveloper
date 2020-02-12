package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.model.Company;
import com.cts.training.model.Register;


@Controller
public class CompanyController {
	@Autowired
	CompanyDAO companyDAO;
	@GetMapping("/company-home")
	public String companyPage(Model model)
	{
		List<Company> companies = companyDAO.getAllCompany(); 
		  model.addAttribute("list1", companies);
	 
		model.addAttribute("company", new Company());
		return "companies";
	}
	@PostMapping("/company/save")

	public String addCompany(@ModelAttribute("company") Company company) {//gets data from the form
		companyDAO.saveOrUpdateCompany(company);
		
		return "redirect:/company-home";
	}
	@GetMapping("/removecompany/{id}")//{}-->path Variable
	public String deleteUser(@PathVariable("id") int id) {//to get path variable dynamic or we can use @RequestParam
		Company company = companyDAO.getUserById(id);
		companyDAO.deleteCompany(company);
		return "redirect:/company-home";
		
	}
	@GetMapping("/updatecompany/{id}")
	public String updateUser(@PathVariable("id") int id, Model model)
	{
		Company companies= companyDAO.getUserById(id);
		model.addAttribute("company",companies);
		List<Company> companys= companyDAO.getAllCompany();
		model.addAttribute("list1", companys);
		return "companies";
	}

}
