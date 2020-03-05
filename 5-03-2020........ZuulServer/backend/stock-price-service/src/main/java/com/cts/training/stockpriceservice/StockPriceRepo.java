package com.cts.training.stockpriceservice;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//@Repository
import com.cts.training.stockpriceservice.StockPrice;

public interface StockPriceRepo extends JpaRepository<StockPrice, Integer>{

}
