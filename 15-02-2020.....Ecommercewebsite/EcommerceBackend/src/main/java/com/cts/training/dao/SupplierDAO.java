package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.Supplier;

public interface SupplierDAO
{
	public boolean addOrUpdate(Supplier supplier);
	
	public boolean deleteSupplier(Supplier supplier);
	
	public Supplier getSupplierById(int id);
	
	public List<Supplier> getAllSuppliers();
}
