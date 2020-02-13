package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.IPODAO;
import com.cts.training.model.IPO;
import com.cts.training.model.Register;

@Controller
public class IPOController {
	@Autowired
	IPODAO ipoDAO;
	@GetMapping("/ipo-home")
	public String ipoPage(Model model)
	{
		List<IPO> users = ipoDAO.getAllIPOs(); 
		  model.addAttribute("list3", users);
	 
		model.addAttribute("ipomodel", new IPO());
		return "ipoview";
	}
	
@PostMapping("/ipo/save")
	
	public String addIpo(@ModelAttribute("ipomodel") IPO ipo) {//gets data from the form
		ipoDAO.saveOrUpdateIPO(ipo);
		
		return "redirect:/ipo-home";
	}
@GetMapping("/removeipo/{id}")//{}-->path Variable
public String deleteUser(@PathVariable("id") int id) {//to get path variable dynamic or we can use @RequestParam
	IPO ipo = ipoDAO.getIPOById(id);
	ipoDAO.deleteIPO(ipo);
	return "redirect:/ipo-home";
	
}
@GetMapping("/updateipo/{id}")
public String updateUser(@PathVariable("id") int id, Model model)
{
	IPO ipo= ipoDAO.getIPOById(id);
	model.addAttribute("ipomodel",ipo);
	List<IPO> users= ipoDAO.getAllIPOs();
	model.addAttribute("list3", users);
	return "ipoview";
}
	
	
}
