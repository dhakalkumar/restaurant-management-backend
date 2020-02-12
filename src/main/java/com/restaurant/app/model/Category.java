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
	private int Id;
	
	@Column
	private String itemName;

	public int getId() {
		return Id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
