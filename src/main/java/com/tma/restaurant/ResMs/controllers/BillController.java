package com.tma.restaurant.ResMs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tma.restaurant.ResMs.entities.Bill;
import com.tma.restaurant.ResMs.services.IBillService;

@RestController
@RequestMapping("bill")
public class BillController {
	@Autowired
	private IBillService billService;

	@PostMapping()
	public void addBill(@RequestBody Bill bill) {

		billService.addBill(bill);

	}

	@GetMapping("/{id}")
	public Bill retrieveBill(@PathVariable("id") Long id) {

		return billService.getBill(id);
	}

	@PutMapping()
	public void updateBill(@RequestBody Bill bill) {
		billService.updateBill(bill);

	}

}
