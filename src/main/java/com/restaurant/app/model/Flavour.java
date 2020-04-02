package com.restaurant.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Flavour {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String flavour;
	

	public int getId() {
		return id;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	
}
