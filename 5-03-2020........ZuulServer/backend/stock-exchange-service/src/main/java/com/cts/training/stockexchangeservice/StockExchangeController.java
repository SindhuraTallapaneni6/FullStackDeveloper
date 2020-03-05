package com.cts.training.stockexchangeservice;

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

import com.cts.training.stockexchangeservice.StockExchange;

@CrossOrigin(origins="*")
@RestController
public class StockExchangeController {
	@Autowired
	StockExchangeRepo stockExchangeRepo;
	
	@Autowired
	StockExchangeService stockExchangeService;
	
	@RequestMapping(value="/stockexchange", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Company> findAll(){
//		return companyRepo.findAll();
//		
//	}
	public ResponseEntity<?> getAllStocks(){
		List<StockExchange> list = stockExchangeService.getAllStocks();
		if(list.size()>0) {
			return new ResponseEntity<List<StockExchange>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	@RequestMapping(value="/stockexchange/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockExchange findone(@PathVariable int id){
	
		Optional<StockExchange> stock = stockExchangeRepo.findById(id);
		StockExchange exchange = stock.get();
		return exchange;
		
		
	}
	
	@RequestMapping(value="/stockexchange", method= RequestMethod.POST)
	public StockExchange save(@RequestBody StockExchange stock){
	
		StockExchange stockExchange = stockExchangeRepo.save(stock);
		return stockExchange;
	}
	@RequestMapping(value="/stockexchange/{id}", method= RequestMethod.DELETE)
	public void  delete(@PathVariable int id){
		stockExchangeRepo.deleteById(id);
	
		
	}
	@RequestMapping(value = "/stockexchange", method = RequestMethod.PUT)
	public StockExchange update(@RequestBody StockExchange stock) {
		StockExchange stockExchange = stockExchangeRepo.save(stock);
		return stockExchange;
	}

}
