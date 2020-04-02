package com.restaurant.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.app.model.Bill;

@RestController
public class BillController {

	@Autowired
	private BillRepo billRepo;
	
	@GetMapping("/error")
	public String getError() {
		
		return "error";
	}

	// get all the bills
	@GetMapping("/bill")
	public List<Bill> getAllBills() {
		
		return billRepo.findAll();
	}
	
	// create a bill
	@PostMapping("/newbill")
	public Bill createBill(@RequestBody Bill bill) {
			
		return billRepo.save(bill);
	}
	
	// get a single bill	
	@GetMapping("/bill/{id}")
	public Optional<Bill> getById(@PathVariable("id") int id) {

		return billRepo.findById(id);
	}
	
	// update a bill
	@PutMapping("/updatebill/{id}")
	public Bill updateBill(@PathVariable("id") int id, @RequestBody Bill billDetails) {
		
		Optional<Bill> bill = billRepo.findById(id);
//		billDetails.setBillNo(bill.get().getBillNo());
//		billDetails.setBillingDate(bill.get().getBillingDate());
//		billDetails.setBillingTime(bill.get().getBillingTime());
//		billDetails.setTableNo(bill.get().getTableNo());
//		billDetails.setFoodItems(bill.get().getFoodItems());

		return billRepo.save(billDetails);		
				
	}
	
	// delete a bill
	@DeleteMapping
	@GetMapping("/deletebill/{id}")
	public String deleteBill(@PathVariable("id") int id) {
		if(billRepo.existsById(id)) {
			billRepo.deleteById(id);		
			return "Deleted bill no. " + id + " successfully";
		} else {
			return "Bill no. " + id + " does not exist in the database!";
		}
	}
}







