package com.restaurant.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String itemName;

	public int getId() {
		return id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	
}
