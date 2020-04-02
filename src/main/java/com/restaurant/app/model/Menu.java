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

@Entity
@Table
public class Menu {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	
	@Column
	private float price;
	
	@Column
	private String image;
	
	@Column
	private String description;
	
	@OneToOne
	@JoinColumn
	private Category category;
	
	@OneToMany
	@JoinColumn
	private List<Flavour> type;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public String getImage() {
		return image;
	}

	public String getDescription() {
		return description;
	}

	public Category getCategory() {
		return category;
	}

	public List<Flavour> getType() {
		return type;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setType(List<Flavour> type) {
		this.type = type;
	}
}
