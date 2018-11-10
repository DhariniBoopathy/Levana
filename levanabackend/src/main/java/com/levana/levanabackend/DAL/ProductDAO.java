package com.levana.levanabackend.DAL;

import java.util.List;

import com.levana.levanabackend.Model.Product;

public interface ProductDAO {

	boolean CreateProduct(Product product);
	boolean UpdateProduct(Product product);
	boolean DeleteProduct(Product product);
	Product SelectProduct(int id);
	List<Product> SelectAllProduct();	
	List<Product> SelectCatproduct(String cat_name);
}