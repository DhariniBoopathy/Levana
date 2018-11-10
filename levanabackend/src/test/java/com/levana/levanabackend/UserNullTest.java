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
//import com.levana.levanabackend.DAL.UserDAO;
//import com.levana.levanabackend.Model.Category;
//import com.levana.levanabackend.Model.User;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringJUnitConfig(classes=DBconfig.class)
//
//public class UserNullTest {
//	
//	@Autowired
//	UserDAO  userDAOImpl;
//
//	User u;
//
//	
//
//	@Before
//	public void setUp() throws Exception {
//		
//		
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void test() {
//		User u = new User();
//		assertEquals("success", true, userDAOImpl.CreateUserDetails(u));
//	}
//
//}
