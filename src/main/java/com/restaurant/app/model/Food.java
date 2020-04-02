package com.restaurant.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Food {

	@Id
	@GeneratedValue
	private int sn;
	
	@OneToOne
	private Category itemName;
	
	@Column
	private int quantity;
	
	@Column
	private float rate;
	
	@Column
	private float amount;

	public int getSn() {
		return sn;
	}

	public Category getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getRate() {
		return rate;
	}

	public float getAmount() {
		return amount;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public void setItemName(Category itemName) {
		this.itemName = itemName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	
}








