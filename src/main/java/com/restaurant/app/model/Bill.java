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

import org.springframework.stereotype.Component;

import com.restaurant.app.model.Menu;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
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

	public int getId() {
		return Id;
	}

	public int getBillNo() {
		return BillNo;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public Date getBillingTime() {
		return billingTime;
	}

	public int getTableNo() {
		return TableNo;
	}

	public List<Food> getFoodItems() {
		return foodItems;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setBillNo(int billNo) {
		BillNo = billNo;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public void setBillingTime(Date billingTime) {
		this.billingTime = billingTime;
	}

	public void setTableNo(int tableNo) {
		TableNo = tableNo;
	}

	public void setFoodItems(List<Food> foodItems) {
		this.foodItems = foodItems;
	}

}
