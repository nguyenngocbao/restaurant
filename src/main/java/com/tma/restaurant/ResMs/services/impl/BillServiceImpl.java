package com.tma.restaurant.ResMs.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tma.restaurant.ResMs.entities.Bill;
import com.tma.restaurant.ResMs.services.IBillService;

@Service
@Transactional(readOnly = true)
public class BillServiceImpl implements IBillService {

	@Override
	public void addBill(Bill bill) {
		

	}

	@Override
	public Bill getBill(Long id) {
		return null;
	}

	@Override
	public void updateBill(Bill bill) {
		

	}

}
