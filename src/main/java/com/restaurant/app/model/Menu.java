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

@Entity
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

	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public float getPrice() {
		return Price;
	}

	public String getImage() {
		return Image;
	}

	public String getDescription() {
		return Description;
	}

	public Category getCategory() {
		return category;
	}

	public List<Flavour> getType() {
		return Type;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public void setImage(String image) {
		Image = image;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setType(List<Flavour> type) {
		Type = type;
	}
}
