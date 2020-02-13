package com.cts.training.spring.model;

public class Data {
	private int id;
	private String name;
	private String username;
	private String password;
	private long phone;
	
	public Data() {
		
	}
	
	public Data(int id, String name, String username, String password, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", phone="
				+ phone + "]";
	}
	
	

}
