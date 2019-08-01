package com.tma.restaurant.ResMs.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tma.restaurant.ResMs.entities.Menu;

public interface IMenuService {

	void addMenu(Menu menu);

	void editMenu(Menu menu);

	Menu getMenu(Long id);

	void deleteMenu(Long id);

	Page<Menu> findAll(Pageable pageable);

}
