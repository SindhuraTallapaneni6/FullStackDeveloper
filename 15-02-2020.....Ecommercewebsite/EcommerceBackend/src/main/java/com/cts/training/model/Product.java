package com.cts.training.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="Product")
@Component
public class Product implements Serializable 
{
	private static final long serialVersionUID = 1409367712933820667L;
	@Id
	@GeneratedValue
	private int id;
	private String productName;
	private String description;
	private double price;
	
	public Product() 
	{
		super();
	}

	public Product(int id, String productName, String description, double price) 
	{
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setPname(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Product [id=" + id + ", productName=" + productName + ", description=" + description + ", price=" + price + "]";
	}	
}
