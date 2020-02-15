package com.cts.training.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Userr")
@Component
public class User implements Serializable
{

	private static final long serialVersionUID = 7959153899722950463L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String username;
	private String password;
	private String address;
	private long phone;
	
	public User()
	{
		super();
	}

	public User(int id, String name, String username, String password, String address, long phone)
	{
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() 
	{
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", address="
				+ address + ", phone=" + phone + "]";
	}
	
	
}
