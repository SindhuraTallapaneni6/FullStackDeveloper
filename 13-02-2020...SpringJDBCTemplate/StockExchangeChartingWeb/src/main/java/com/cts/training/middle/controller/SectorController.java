package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.SectorDAO;

import com.cts.training.model.Sector;



@Controller
public class SectorController {
	@Autowired
	SectorDAO sectorDAO;
	@GetMapping("/sector-home")
	public String ipoPage(Model model)
	{
		List<Sector> users = sectorDAO.getAllSectors(); 
		  model.addAttribute("list4", users);
	 
		model.addAttribute("sectormodel", new Sector());
		return "SectorView";
	}
@PostMapping("/sector/save")
	
	public String addSector(@ModelAttribute("sectormodel") Sector sector) {//gets data from the form
		
	
	sectorDAO.saveOrUpdateSector(sector);
		
		return "redirect:/sector-home";
	}
@GetMapping("/removesector/{id}")//{}-->path Variable
public String deleteSector(@PathVariable("id") int id) {//to get path variable dynamic or we can use @RequestParam
	Sector sector = sectorDAO.getSectorById(id);
	sectorDAO.deleteSector(sector);
	return "redirect:/sector-home";
	
}
@GetMapping("/updatesector/{id}")
public String updateSector(@PathVariable("id") int id, Model model)
{
	Sector sector= sectorDAO.getSectorById(id);
	model.addAttribute("sectormodel",sector);
	List<Sector> users= sectorDAO.getAllSectors();
	model.addAttribute("list4", users);
	return "SectorView";
}
	

}
