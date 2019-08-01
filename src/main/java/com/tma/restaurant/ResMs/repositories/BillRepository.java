package com.tma.restaurant.ResMs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tma.restaurant.ResMs.entities.Bill;
@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {	

}
