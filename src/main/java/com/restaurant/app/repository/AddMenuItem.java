package com.restaurant.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.app.model.Menu;

public interface AddMenuItem extends JpaRepository<Menu, Integer> {

}
