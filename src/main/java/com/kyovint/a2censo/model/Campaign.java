package com.kyovint.a2censo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Campaign {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcampaign;
	private String namecompany;
	private int amount;
	private int requestedamount;
	private int adminrate;
	
	public Campaign(){
		
	}
	
	public int getIdcampaign() {
		return idcampaign;
	}
	public void setIdcampaign(int idcampaign) {
		this.idcampaign = idcampaign;
	}
	public String getNameCompany() {
		return namecompany;
	}
	public void setNameCompany(String nameCompany) {
		this.namecompany = nameCompany;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRequestedAmount() {
		return requestedamount;
	}
	public void setRequestedAmount(int requestedAmount) {
		this.requestedamount = requestedAmount;
	}
	public int getAdminRate() {
		return adminrate;
	}
	public void setAdminRate(int adminRate) {
		this.adminrate = adminRate;
	}
	
	
	
}
