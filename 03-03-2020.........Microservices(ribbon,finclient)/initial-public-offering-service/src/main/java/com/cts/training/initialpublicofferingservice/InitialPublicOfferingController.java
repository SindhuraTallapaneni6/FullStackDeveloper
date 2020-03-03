package com.cts.training.initialpublicofferingservice;

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

import com.cts.training.initialpublicofferingservice.InitialPublicOffering;;


@CrossOrigin(origins="*")
@RestController
public class InitialPublicOfferingController {
	@Autowired
	InitialPublicOfferingRepo ipoRepo;
	
	@Autowired
	InitialPublicOfferingService ipoService;
	
	@RequestMapping(value="/ipo", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllIPOs(){
		List<InitialPublicOffering> list = ipoService.getAllIPOs();
		if(list.size()>0) {
			return new ResponseEntity<List<InitialPublicOffering>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	@RequestMapping(value="/ipo/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public InitialPublicOffering findone(@PathVariable int id){
	
		Optional<InitialPublicOffering> ipo = ipoRepo.findById(id);
		InitialPublicOffering publicOffering = ipo.get();
		return publicOffering;
		
		
	}
	
	@RequestMapping(value="/ipo", method= RequestMethod.POST)
	public InitialPublicOffering save(@RequestBody InitialPublicOffering ipo){
	
		InitialPublicOffering publicOffering = ipoRepo.save(ipo);
		return publicOffering;
	}
	@RequestMapping(value="/ipo/{id}", method= RequestMethod.DELETE)
	public void  delete(@PathVariable int id){
		ipoRepo.deleteById(id);
	
		
	}
	@RequestMapping(value = "/ipo", method = RequestMethod.PUT)
	public InitialPublicOffering update(@RequestBody InitialPublicOffering ipo) {
		InitialPublicOffering publicOffering = ipoRepo.save(ipo);
		return publicOffering; 
	}


}
