//package com.levana.levanabackend;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.levana.levanabackend.DAL.CategoryDAO;
//import com.levana.levanabackend.DAL.CategoryDAOImpl;
//import com.levana.levanabackend.DAL.ProductDAO;
//import com.levana.levanabackend.DAL.ProductDAOImpl;
//import com.levana.levanabackend.Model.Category;
//import com.levana.levanabackend.Model.Product;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringJUnitConfig(classes=DBconfig.class)
//
//public class ProductCreateTest {
//	
//	@Autowired
//	ProductDAO ProductDAOImpl;
//	
//	@Autowired
//	CategoryDAO categoryDAOImpl;
//	
//	Product p;
//	
//	Category c;
//	
//	@Before
//	public void setUp() throws Exception {
//		
//		 c=new Category();
//		 c.setCategory_Name("Eyes");
//		 c.setCategoryDesc("new");
//		 
//		 categoryDAOImpl.CreateCategory(c);
//		p=new Product();
//		p.setProduct_Name("Eye liner");
//		p.setProductDesc("new");
//		p.setQuantity("1");
//		p.setPrice("100");
//		p.setCategory(categoryDAOImpl.ViewOneCategory("Eyes"));
//		
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		//ProductDAOImpl.DeleteProduct(p);
//		categoryDAOImpl.DeleteCategory("Eyes");
//	}
//
//	@Test
//	public void Create() {
//		assertEquals("success", true, ProductDAOImpl.CreateProduct(p));
//	}
//
//
//
//		
//		
////	
//	
////	@Test
////	public void nullTest()
////	{
////		Product p = new Product();
////	
////		p.setProduct_Name("");
////		 //c.getCategory_id();
////		 p.setProductDesc("");
////		 p.setQuantity("");
////		 p.setPrice("");
////		 p.setCategory("");
//	
//	//	assertEquals("success", true, ProductDAOImpl.CreateProduct(p));	
////	}
//	
//	
//	
//}
