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

@Component
@Entity
@Getter
@Setter
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
	
}








