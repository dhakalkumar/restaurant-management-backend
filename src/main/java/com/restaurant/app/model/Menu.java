package com.restaurant.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
public class Menu {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column
	private String Name;
	
	@Column
	private float Price;
	
	@Column
	private String Image;
	
	@Column
	private String Description;
	
	@OneToOne
	@JoinColumn
	private Category category;
	
	@OneToMany
	@JoinColumn
	private List<Flavour> Type;
	
}
