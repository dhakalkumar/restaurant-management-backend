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
	private int Id;
	
	@Column
	private String flavour;
}
