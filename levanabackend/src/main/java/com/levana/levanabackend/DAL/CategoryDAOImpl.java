package com.levana.levanabackend.DAL;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.levana.levanabackend.Model.Category;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionfactory;

	public boolean CreateCategory(Category category) {
		try {
			sessionfactory.getCurrentSession().save(category);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean UpdateCategory(Category category) {
		try {
			sessionfactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean DeleteCategory(String Category_Name) {
		try {
			sessionfactory.getCurrentSession().delete(ViewOneCategory(Category_Name));
			return true;
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<Category> ViewAllCategory() {
		try {
			return sessionfactory.getCurrentSession().createQuery("from Category").list();
		}

		catch (Exception e) {
			return null;
		}
	}

	public  Category ViewOneCategory(String CategoryName) {
		try {
			return (Category) sessionfactory.getCurrentSession()
					.createQuery("from Category where Category_Name='" + CategoryName + "'").uniqueResult();
		} catch (Exception e) {
			return null;
		}
	}

	
}
