package com.tma.restaurant.ResMs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tma.restaurant.ResMs.entities.Menu;
import com.tma.restaurant.ResMs.services.IMenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private IMenuService menuService;

	@PostMapping("")
	public void addMenu(@RequestBody Menu menu) {
		menuService.addMenu(menu);

	}

	@PutMapping("")
	public void editMenu(@RequestBody Menu menu) {
		menuService.editMenu(menu);

	}

	@GetMapping("/{id}")
	public Menu getMenu(@PathVariable Long id) {
		return menuService.getMenu(id);

	}

	@DeleteMapping("/{id}")
	public void deleteMenu(@PathVariable Long id) {
		menuService.deleteMenu(id);

	}
	
	@GetMapping("/all")
	public Page<Menu> getMenu(Pageable pageable) {
		return menuService.findAll(pageable);

	}

}
