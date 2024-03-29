package com.cts.training.dto;

public class CompanyDTO {
	
	private int id;
	private String companyname;
	private String sector;
	private String ceo;
	private String bod;
	private double turnover;
	
	public CompanyDTO() {
		
	}

	public CompanyDTO(int id, String companyname, String sector, String ceo, String bod, double turnover) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.sector = sector;
		this.ceo = ceo;
		this.bod = bod;
		this.turnover = turnover;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBod() {
		return bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	@Override
	public String toString() {
		return "CompanyDTO [id=" + id + ", companyname=" + companyname + ", sector=" + sector + ", ceo=" + ceo
				+ ", bod=" + bod + ", turnover=" + turnover + "]";
	}
	

}
