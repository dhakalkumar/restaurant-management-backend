package com.restaurant.app.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.app.model.Bill;

//@Repository
public interface BillRepo extends JpaRepository<Bill, Integer> {

}
