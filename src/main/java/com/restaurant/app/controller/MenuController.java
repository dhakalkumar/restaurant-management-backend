package com.restaurant.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.app.model.Menu;
import com.restaurant.app.repository.AddMenuItem;

@RestController
public class MenuController {

	@Autowired
	private AddMenuItem menuItem;
	
	@GetMapping("/menu")
	public List<Menu> getAllMenuItems() {
		
		return menuItem.findAll();
	}
	
	@GetMapping("/edit/{id}")
	public Optional<Menu> editMenu(@PathVariable("id") int id, Model model) {
		//model.addAttribute("menumodel", menuItem.findById(id));
		
		return menuItem.findById(id);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteMenuItem(@PathVariable("id") int id, Model model) {
		menuItem.deleteById(id);
		//model.addAttribute("menuList", menuItem.findAll());
		
		return "Deleted item no. "+id+" successfully";
	}
	
	@GetMapping("/update")
	public Menu updateMenu(@RequestBody Menu m) {
		
		//model.addAttribute("menuList", menuItem.findAll());
		
		return menuItem.save(m);
	}
	
	
	
}
