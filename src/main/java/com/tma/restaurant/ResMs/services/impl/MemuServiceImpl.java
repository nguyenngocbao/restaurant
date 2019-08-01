package com.tma.restaurant.ResMs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tma.restaurant.ResMs.entities.Menu;
import com.tma.restaurant.ResMs.repositories.MenuRepository;
import com.tma.restaurant.ResMs.services.IMenuService;

@Service
@Transactional(readOnly = true)
public class MemuServiceImpl implements IMenuService {
	@Autowired
	private MenuRepository menuRepos;

	@Override
	@Transactional()
	public void addMenu(Menu menu) {
		menuRepos.save(menu);

	}

	@Override
	@Transactional()
	public void editMenu(Menu menu) {
		menuRepos.save(menu);
	}

	@Override
	public Menu getMenu(Long id) {
		return menuRepos.findOne(id);
	}

	@Override
	@Transactional()
	public void deleteMenu(Long id) {
		menuRepos.delete(id);

	}

	@Override
	public Page<Menu> findAll(Pageable pageable) {
		return menuRepos.findAll(pageable);
	}

}
