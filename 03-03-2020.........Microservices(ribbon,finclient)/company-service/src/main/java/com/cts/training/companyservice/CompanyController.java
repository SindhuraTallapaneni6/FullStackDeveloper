package com.cts.training.companyservice;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.companyservice.CompanyRepo;


import com.cts.training.companyservice.Company;
import com.cts.training.companyservice.CompanyService;


@CrossOrigin(origins="*")
@RestController
public class CompanyController {
	@Autowired
	CompanyRepo companyRepo;
	
	@Autowired
	CompanyService companyService;
	
	@RequestMapping(value="/company", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Company> findAll(){
//		return companyRepo.findAll();
//		
//	}
	public ResponseEntity<?> getAllCompanies(){
		List<Company> list = companyService.getAllCompanies();
		if(list.size()>0) {
			return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	@RequestMapping(value="/company/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Company findone(@PathVariable int id){
	
		Optional<Company> com = companyRepo.findById(id);
		Company company = com.get();
		return company;
		
		
	}
	
	@RequestMapping(value="/company", method= RequestMethod.POST)
	public Company save(@RequestBody Company com){
	
		Company company = companyRepo.save(com);
		return company;
	}
	@RequestMapping(value="/company/{id}", method= RequestMethod.DELETE)
	public void  delete(@PathVariable int id){
		companyRepo.deleteById(id);
	
		
	}
	@RequestMapping(value = "/company", method = RequestMethod.PUT)
	public Company update(@RequestBody Company com) {
		Company company = companyRepo.save(com);
		return company; 
	}

}
