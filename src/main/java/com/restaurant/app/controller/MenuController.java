package com.restaurant.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.app.model.Menu;
import com.restaurant.app.repository.AddMenuItem;

@RestController
public class MenuController {

	@Autowired
	private AddMenuItem menuItem;
	
	// show all the menu items
	@GetMapping("/menu")
	public List<Menu> getAllMenuItems() {
		
		return menuItem.findAll();
	}
	// get a single menu item
	@GetMapping("/menu/{id}")
	public Optional<Menu> getById(@PathVariable("id") int id) {
		
		return menuItem.findById(id);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteMenuItem(@PathVariable("id") int id, Model model) {
		menuItem.deleteById(id);
		//model.addAttribute("menuList", menuItem.findAll());
		
		return "Deleted item no. "+id+" successfully";
	}
	
	@PostMapping("/update")
	public Menu updateMenu(@RequestBody Menu m) {
		
		//model.addAttribute("menuList", menuItem.findAll());
		
		return menuItem.save(m);
	}
	
}
