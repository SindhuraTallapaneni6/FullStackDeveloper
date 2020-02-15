package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Supplier")
@Component
public class Supplier implements Serializable
{
	
	private static final long serialVersionUID = 1216235515762118026L;
	@Id
	@GeneratedValue
	private int id;
	private String supplierName;
	private String supplierAddress;
	private long supplierPhone;
	
	public Supplier()
	{
		super();
	}

	public Supplier(int id, String supplierName, String supplierAddress, long supplierPhone)
	{
		super();
		this.id = id;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.supplierPhone = supplierPhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public long getSupplierPhone() {
		return supplierPhone;
	}

	public void setSupplierPhone(long supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	@Override
	public String toString()
	{
		return "Supplier [id=" + id + ", supplierName=" + supplierName + ", supplierAddress=" + supplierAddress
				+ ", supplierPhone=" + supplierPhone + "]";
	}
	
	
}
