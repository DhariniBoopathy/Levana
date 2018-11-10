package com.levana.levanafrontend.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.levana.levanabackend.DAL.CategoryDAO;
import com.levana.levanabackend.DAL.ProductDAO;
import com.levana.levanabackend.Model.Product;

@Controller
public class ProductController 
{
 @Autowired
 ProductDAO productdaoImpl;
 
 @Autowired
 CategoryDAO catagorydaoImpl;
 
 
 
 void addimage(MultipartFile f,int id)
	{
		try
		{
			String path="E:\\NIIT Project\\levanafrontend\\src\\main\\webapp\\resources\\pimages\\";
			path=path+String.valueOf(id)+".jpg";
			if(!f.isEmpty())
			{
				byte[] imagebytes=f.getBytes();
				File x=new File(path);
				if(x.exists())
				{
					x.delete();
					BufferedOutputStream bs=new  BufferedOutputStream(new FileOutputStream(x));
					bs.write(imagebytes);
					bs.close();
				}
				else
				{
					BufferedOutputStream bs=new  BufferedOutputStream(new FileOutputStream(x));
					bs.write(imagebytes);
					bs.close();
				}
			}
			Thread.sleep(5000);
		}
		catch (Exception e) {
			
		}
		
	}



@RequestMapping(value= {"/Product"})
 public String registerpage(Model m) {
  m.addAttribute("productpage",true);
  m.addAttribute("title","levana-Product");
  m.addAttribute("catlist",catagorydaoImpl.ViewAllCategory());
  m.addAttribute("prodlist",productdaoImpl.SelectAllProduct());
  m.addAttribute("Product",new Product());
  m.addAttribute("edit", false);
  return "index";
   
  }
 @RequestMapping("/addProduct")
 public String addproduct(@Valid @ModelAttribute("Product")Product product,BindingResult BR,Model m)
 {
  if(BR.hasErrors())
  {
	  
   System.out.println("re");
   m.addAttribute("productpage",true);
   m.addAttribute("title","levana-Product");
   m.addAttribute("catlist",catagorydaoImpl.ViewAllCategory());
   m.addAttribute("prodlist",productdaoImpl.SelectAllProduct());
   m.addAttribute("Product",product);
   m.addAttribute("edit", false);
   
  }
   
  else
  {
   
   if(productdaoImpl.CreateProduct(product))
   {
   addimage(product.getPimage(),product.getProduct_id());
   m.addAttribute("productpage",true);
   m.addAttribute("title","levana-Product");
   m.addAttribute("catlist",catagorydaoImpl.ViewAllCategory());
   m.addAttribute("prodlist",productdaoImpl.SelectAllProduct());
   m.addAttribute("Product",new Product());
   m.addAttribute("edit", false);
   }
   else
   {
    m.addAttribute("productpage",true);
    m.addAttribute("title","levana-Product");
    m.addAttribute("catlist",catagorydaoImpl.ViewAllCategory());
    m.addAttribute("prodlist",productdaoImpl.SelectAllProduct());
    m.addAttribute("Product",product);
    m.addAttribute("edit", false);
   }
      
     }
  return "index";
 }
 @RequestMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("pid") int pid) {
	 if(productdaoImpl.DeleteProduct(productdaoImpl.SelectProduct(pid)))
		{
			String path="E:\\NIIT Project\\levanafrontend\\src\\main\\webapp\\resources\\pimages\\";
			path=path+String.valueOf(pid)+".jpg";
			File x=new File(path);
			if(x.exists())
			{
					x.delete();
					
		     }
			
		}return "redirect:/Product";
 }
 
 @RequestMapping("/editproduct")
 public String editproduct(@RequestParam("pid") int pid, Model m) {
  m.addAttribute("productpage", true);
  m.addAttribute("title", "levana-Product");
  m.addAttribute("Product", productdaoImpl.SelectProduct(pid));
  m.addAttribute("catlist",catagorydaoImpl.ViewAllCategory());
  m.addAttribute("prodlist", productdaoImpl.SelectAllProduct());
  m.addAttribute("edit", true);
  return "index";
 }
 
 
 @RequestMapping("/updateproduct")
 public String editproduct(@Valid @ModelAttribute("Product") Product product, BindingResult BR, Model m) {
  if (BR.hasErrors()) {
   System.out.println("1");
   m.addAttribute("productpage", true);
   m.addAttribute("title", "levana-Product");
   m.addAttribute("Product", product);
   m.addAttribute("prodlist", productdaoImpl.SelectAllProduct());
   m.addAttribute("edit", true);
  }
  else {
   if (productdaoImpl.UpdateProduct(product)) {
    System.out.println("2");
    m.addAttribute("productpage", true);
    m.addAttribute("title", "levana-Product");
    m.addAttribute("Product", new Product());
    m.addAttribute("catlist",catagorydaoImpl.ViewAllCategory());
    m.addAttribute("prodlist", productdaoImpl.SelectAllProduct());    
    m.addAttribute("edit", false);
   } else {
    System.out.println("3");
    m.addAttribute("productpage", true);
    m.addAttribute("title", "levana-Product");
    m.addAttribute("Product", product);
    m.addAttribute("catlist",catagorydaoImpl.ViewAllCategory());
    m.addAttribute("prodlist", productdaoImpl.SelectAllProduct());
    m.addAttribute("edit", true);
   }
  }
  return "index";
 }
 @RequestMapping(value = "/AllProduct")
 public String allproducts(Model m) {
  m.addAttribute("viewallproductpage", true);
  m.addAttribute("catlist",catagorydaoImpl.ViewAllCategory());
  m.addAttribute("title", "GiftGalore-Products");
  m.addAttribute("prodlist", productdaoImpl.SelectAllProduct());
  return "index";
 }

 @RequestMapping(value = "/OneProduct")
 public String oneproductpage(Model m,@RequestParam("pid")int pid) {
  m.addAttribute("viewoneproductpage", true);
  m.addAttribute("title", "GiftGalore-Products");
  m.addAttribute("l", productdaoImpl.SelectProduct(pid));
  return "index";
 }
 
 @RequestMapping(value = "/products")
 public String catproducts(Model m,@RequestParam("catname") String name) {
	 m.addAttribute("viewallproductpage", true);
	  m.addAttribute("catlist",catagorydaoImpl.ViewAllCategory());
	  m.addAttribute("title", "GiftGalore-Products");
	  m.addAttribute("prodlist", productdaoImpl.SelectCatproduct(name));
	  return "index";
	 }
 
 
 
}
