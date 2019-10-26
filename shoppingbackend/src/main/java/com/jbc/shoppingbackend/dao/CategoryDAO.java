package com.jbc.shoppingbackend.dao;

import java.util.List;

import com.jbc.shoppingbackend.dto.CategoryDTO;

public interface CategoryDAO {
	
	List<CategoryDTO> list();
	CategoryDTO get(int id);

}
