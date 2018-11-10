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
//import com.levana.levanabackend.Model.Category;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringJUnitConfig(value=DBconfig.class)
//public class CategoryUpdateTest {
// @Autowired
// CategoryDAO categoryDAOImpl;
// Category c;
// 
// @Before
// public void setUp() throws Exception {
//  c=new Category();
//  c.setCategory_Name("Eyes");
//  c.setCategoryDesc("new");
// }
// @After
// public void tearDown() throws Exception {
//  categoryDAOImpl.DeleteCategory("Eyes"); 
// }
// @Test
// public void test() 
// {
//  categoryDAOImpl.CreateCategory(c);
//  Category c1=categoryDAOImpl.ViewOneCategory("Eyes");
//  c1.setCategoryDesc("jdsghfgdhgfh");
//  categoryDAOImpl.UpdateCategory(c1);
//  assertEquals("jdsghfgdhgfh", categoryDAOImpl.ViewOneCategory("Eyes").getCategoryDesc());
// }
//}