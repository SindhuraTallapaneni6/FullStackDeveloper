package com.cts.training.stockpriceservice;

import java.util.List;

import com.cts.training.stockpriceservice.StockPrice;

public interface StockPriceService {
	
	public StockPrice addStockPrice(StockPrice stockPrice);
    public void deleteStockPrice(int id);
    public StockPrice updateStockPrice(StockPrice stockPrice);
    public List<StockPrice> getAllStockPrices();
    public StockPrice getStockPriceById(int id);

}
