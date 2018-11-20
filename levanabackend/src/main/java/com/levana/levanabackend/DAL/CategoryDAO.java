package com.levana.levanabackend.DAL;

import java.util.List;

import com.levana.levanabackend.Model.Category;


public interface CategoryDAO {
	
	boolean CreateCategory(Category category);
	boolean UpdateCategory(Category category);
	boolean DeleteCategory(String CategoryName);
	List<Category> ViewAllCategory();
	Category ViewOneCategory(String CategoryName);
	
	}


