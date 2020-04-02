package com.restaurant.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table
public class Bill {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private int billNo;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date billingDate;
	
	@Column
	@Temporal(TemporalType.TIME)
	private Date billingTime;
	
	@Column
	private int tableNo;
	
	@OneToMany
	@JoinColumn
	private List<Food> foodItems;

	public int getId() {
		return id;
	}

	public int getBillNo() {
		return billNo;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public Date getBillingTime() {
		return billingTime;
	}

	public int getTableNo() {
		return tableNo;
	}

	public List<Food> getFoodItems() {
		return foodItems;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public void setBillingTime(Date billingTime) {
		this.billingTime = billingTime;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	public void setFoodItems(List<Food> foodItems) {
		this.foodItems = foodItems;
	}
}
