package com.levana.levanabackend.DAL;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.levana.levanabackend.Model.Category;
import com.levana.levanabackend.Model.Product;

@Repository
@Transactional

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionfactory;

	public boolean CreateProduct(Product product) {
		try
		{
			sessionfactory.getCurrentSession().save(product);
			return true;
		}
		catch (Exception e) {
			return false;
		}
		
	
	}

	public boolean UpdateProduct(Product product) {
		try
		{
			sessionfactory.getCurrentSession().update(product);
		    return true;
		}
		catch (Exception e) {
			return false;
		}
		
	
	}

	public boolean DeleteProduct(Product product) {
		try
		{
			sessionfactory.getCurrentSession().delete(product);
		    return true;
		}
		catch (Exception e) {
			return false;
		}
		
	
	}

	public Product SelectProduct(int Product_id) {
		try {
			return (Product) sessionfactory.getCurrentSession()
					.createQuery("from Product where Product_id='" + Product_id + "'").uniqueResult();
		}

		catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Product> SelectAllProduct() {
		try {
			return sessionfactory.getCurrentSession()
					.createQuery("from Product").list();
		}

		catch (Exception e) {
			return null;                                 
		}
	}

	@Override
	public List<Product> SelectCatproduct(String cat_name) {
		try {
			Category c=(Category)sessionfactory.getCurrentSession().createQuery("from  Category where Category_Name='"+cat_name+"'").uniqueResult();
			return sessionfactory.getCurrentSession()
					.createQuery("from Product where category_category_id="+c.getCategory_id()).list();
		
		
		}

		catch (Exception e) {
			return null;
		}
	}
}
		





