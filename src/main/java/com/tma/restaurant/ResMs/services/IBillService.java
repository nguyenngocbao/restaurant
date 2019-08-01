package com.tma.restaurant.ResMs.services;

import com.tma.restaurant.ResMs.entities.Bill;

public interface IBillService {

	void addBill(Bill bill);

	Bill getBill(Long id);

	void updateBill(Bill bill);

}
