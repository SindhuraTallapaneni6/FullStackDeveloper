package com.cts.training.spring.dao;

import java.util.List;

import com.cts.training.spring.model.Data;



public interface DataDAO {
	
	public boolean addData(Data data);

	public boolean updateData(Data data);

	public boolean deleteData(Data data);

	public Data getDataById(int id);

	public List<Data> getAllData();

}
