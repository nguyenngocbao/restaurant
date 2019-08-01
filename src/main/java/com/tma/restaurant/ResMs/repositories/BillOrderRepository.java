package com.tma.restaurant.ResMs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tma.restaurant.ResMs.entities.BillOrder;
@Repository
public interface BillOrderRepository extends JpaRepository<BillOrder, Long> {

}
