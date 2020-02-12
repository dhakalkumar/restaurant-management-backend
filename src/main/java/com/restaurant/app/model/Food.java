package com.restaurant.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class Food {

	@Id
	@GeneratedValue
	private int Sn;
	
	@OneToOne
	private Category Item;
	
	@Column
	private int Quantity;
	
	@Column
	private float Rate;
	
	@Column
	private float Amount;

	public int getSn() {
		return Sn;
	}

	public Category getItem() {
		return Item;
	}

	public int getQuantity() {
		return Quantity;
	}

	public float getRate() {
		return Rate;
	}

	public float getAmount() {
		return Amount;
	}

	public void setSn(int sn) {
		Sn = sn;
	}

	public void setItem(Category item) {
		Item = item;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public void setRate(float rate) {
		Rate = rate;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

}








