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
//import com.levana.levanabackend.DAL.UserDAO;
//import com.levana.levanabackend.Model.Product;
//import com.levana.levanabackend.Model.User;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringJUnitConfig(classes=DBconfig.class)
//
//public class UserCreateTest {
//
//	@Autowired
//	UserDAO UserDAOImpl;
//	User u;
//	
//	@Before
//	public void setUp() throws Exception {
//		
//		u=new User();
//		u.setUser_name("abc");
//		u.setEmailid("levana.new@gmail.com");
//		u.setPhoneno("9876543210");
//		u.setPassword("sa");
//	
//	}
//	
//
//	@After
//	public void tearDown() throws Exception {
//		
//		UserDAOImpl.DeleteUserDetails(u);
//	}
//
//	@Test
//	public void duplication()
//	{
//	
//	//	assertEquals("success", true, UserDAOImpl.CreateUserDetails(u));
//	//	assertEquals("success", true, UserDAOImpl.CreateUserDetails(u));
//	}
//}	
//
//
