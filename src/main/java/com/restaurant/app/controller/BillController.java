package com.restaurant.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.app.model.Bill;

@RestController
public class BillController {

	@Autowired
	private BillRepo bill;

	@GetMapping("/bill")
	public List<Bill> getAllBills() {
		
		return bill.findAll();
	}
	
	@GetMapping("/bill/{id}")
	public Optional<Bill> getById(@PathVariable("id") int id) {

		return bill.findById(id);
	}
	
}
