package com.cts.training.companyservice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.companyservice.CompanyRepo;


import com.cts.training.companyservice.Company;
import com.cts.training.companyservice.CompanyService;
import com.cts.training.userservice.Register;


@CrossOrigin(origins="*")
@RestController
public class CompanyController {
	@Autowired
	CompanyRepo companyRepo;
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping(value="/company",produces = MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<?> getAllCompanies(){
		List<Company> list = companyService.getAllCompanies();
		if(list.size()>0) {
			return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping(value="/company/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getCompanyById(@PathVariable int id){
		try {
			Company company =  companyService.getCompanyById(id);
			return new ResponseEntity<Company>(company, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<String>("no such company", HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	@RequestMapping(value="/company", method= RequestMethod.POST)
	public Company save(@RequestBody Company com){
	
		Company company = companyRepo.save(com);
		return company;
	}
	@RequestMapping(value="/company/{id}", method = RequestMethod.DELETE)
	public void  delete(@PathVariable int id){
		companyRepo.deleteById(id);
	
		
	}
	@RequestMapping(value = "/company", method = RequestMethod.PUT)
	public Company update(@RequestBody Company com) {
		Company company = companyRepo.save(com);
		return company; 
	}

}
