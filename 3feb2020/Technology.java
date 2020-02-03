package com.cts.training.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "technolgy")
public class Technology {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	@Column(name = "language")
	private String language;
	@Column(name = "expertise")
	private String Expertise;
	
	@ManyToMany(mappedBy = "technology")
	  private Set<Developer> developer;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getExpertise() {
		return Expertise;
	}
	public void setExpertise(String expertise) {
		Expertise = expertise;
	}
	
}
