package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.Product;

public interface ProductDAO
{
	public boolean addOrUpdate(Product product);
	
	public boolean deleteProduct(Product product);
	
	public Product getProductById(int id);
	
	public List<Product> getAllProducts();
}
