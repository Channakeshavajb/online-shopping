package com.jbc.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbc.shoppingbackend.dao.CategoryDAO;
import com.jbc.shoppingbackend.dto.CategoryDTO;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	public static List<CategoryDTO> categories = new ArrayList<>();
	
	
	static {
		CategoryDTO category=new CategoryDTO();
		//Adding first category
		category.setId(1);
		category.setName("TV");
		category.setDescription("The is some description for TV");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		//second category
		category=new CategoryDTO();
		category.setId(2);
		category.setName("MOBILE");
		category.setDescription("The is some description for MOBILE");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
		//third category
		category=new CategoryDTO();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("The is some description for Laptop");
		category.setImageURL("CAT_3.png");
		categories.add(category);
		
		//fourth category
		category=new CategoryDTO();
		category.setId(4);
		category.setName("Camera");
		category.setDescription("The is some description for Camera");
		category.setImageURL("CAT_4.png");
		categories.add(category);
	}
	
	@Override
	public List<CategoryDTO> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public CategoryDTO get(int id) {

		for (CategoryDTO categoryDTO : categories) {

			if(categoryDTO.getId() == id) return categoryDTO;
		}
		return null;
	}

}
