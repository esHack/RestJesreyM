package com.dev.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "expense") 
public class Expense {

	
  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;
	

	@Column(name = "date")
	private String date;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "amount")
	private String amount;
	
	
	@Column(name = "vat")
	private String vat;
	
	
	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "[date:" + date + ", reason:" + reason + ", amount=" + amount + "]";
	}



	public String getVat() {
		return vat;
	}



	public void setVat(String vat) {
		this.vat = vat;
	}
	
}
