package com.cts.training.stockpriceservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.stockpriceservice.StockPrice;
import com.cts.training.stockpriceservice.StockPriceRepo;
import com.cts.training.stockpriceservice.StockPriceService;

@Service
public class StockPriceServiceImpl implements StockPriceService {
	
	@Autowired
	StockPriceRepo stockPriceRepo; 
	
	
	@Override
	public 	StockPrice addStockPrice(StockPrice stockPrice) {
		stockPriceRepo.save(stockPrice);
	    return stockPrice;
	}
	@Override
	public List<StockPrice> getAllStockPrices(){
		List<StockPrice> entities = stockPriceRepo.findAll();
		List<StockPrice> stockPrices = new ArrayList<StockPrice>();
		for(StockPrice entity: entities) {
			StockPrice stockPrice = new StockPrice();
			BeanUtils.copyProperties(entity, stockPrice);
			stockPrices.add(stockPrice);
		}
		System.out.println("Entity: "+entities);
		System.out.println("DTO: "+stockPrices);
		return stockPrices;
	}
	@Override
	public void deleteStockPrice(int id) {
		stockPriceRepo.deleteById(id);
	}
	@Override
	public StockPrice getStockPriceById(int id){
		Optional<StockPrice> stockPrices = stockPriceRepo.findById(id);
		StockPrice stockPrice = new StockPrice();
		BeanUtils.copyProperties(stockPrices.orElse(new StockPrice()), stockPrice);
		return stockPrice;
	}
	@Override
	public StockPrice updateStockPrice(StockPrice stockPrice) {
		stockPriceRepo.save(stockPrice);
		return stockPrice;
	}


}
