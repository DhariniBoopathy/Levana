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
//import com.levana.levanabackend.DAL.ProductDAO;
//import com.levana.levanabackend.Model.Category;
//import com.levana.levanabackend.Model.Product;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringJUnitConfig(classes=DBconfig.class)
//
//public class ProductNullTest {
//	
//	@Autowired
//	ProductDAO  productDAOImpl;
//
//	Product P;
//
//
//	@Before
//	public void setUp() throws Exception {
//		P=new Product();
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void test() {
//		Product p = new Product();
//		assertEquals("success", true, productDAOImpl.CreateProduct(p));
//	
//	}
//
//}
