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
//import com.levana.levanabackend.Model.Category;
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringJUnitConfig(classes=DBconfig.class)
//
//public class CategoryNullTest {
//    
//	@Autowired
//	CategoryDAO  categoryDAOImpl;
//
//	Category c;
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void test() {
//		Category c = new Category();
//		assertEquals("success", true, categoryDAOImpl.CreateCategory(c));
//	}
//
//}
