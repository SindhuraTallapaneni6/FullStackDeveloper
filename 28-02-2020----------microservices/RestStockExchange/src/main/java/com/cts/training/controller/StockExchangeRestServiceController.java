package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cts.training.dao.StockExchangeRepo;

import com.cts.training.model.StockExchange;


@CrossOrigin(origins="*")
@RestController
public class StockExchangeRestServiceController {
	@Autowired
	StockExchangeRepo sr;
	@RequestMapping(value="/stockexchange", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StockExchange> findAll(){
		return sr.findAll();
		
	}
	@RequestMapping(value="/stockexchange/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockExchange findone(@PathVariable int id){
	
		Optional<StockExchange> stock = sr.findById(id);
		StockExchange stockexchange = stock.get();
		return stockexchange;
		
		
	}
	@RequestMapping(value="/stockexchange", method= RequestMethod.POST)
	public StockExchange save(@RequestBody StockExchange stock){
	
		StockExchange stockexchange = sr.save(stock);
		return stockexchange;
	}
	@RequestMapping(value="/stockexchange/{id}", method= RequestMethod.DELETE)
	public void  delete(@PathVariable int id){
		sr.deleteById(id);
	
		
	}
	@RequestMapping(value = "/stockexchange", method = RequestMethod.PUT)
	public StockExchange update(@RequestBody StockExchange stock) {
		StockExchange stockexchange = sr.save(stock);
		return stockexchange;
	}
}
