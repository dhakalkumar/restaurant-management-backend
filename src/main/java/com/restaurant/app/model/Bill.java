package com.restaurant.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.restaurant.app.model.Menu;

import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Getter
@Setter
public class Bill {
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Column
	private int BillNo;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date billingDate;
	
	@Column
	@Temporal(TemporalType.TIME)
	private Date billingTime;
	
	@Column
	private int TableNo;
	
	@OneToMany
	@JoinColumn
	private List<Food> foodItems;
	
}
