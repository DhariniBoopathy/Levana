package com.levana.levanafrontend.Controller;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.levana.levanabackend.DAL.CartDAO;
import com.levana.levanabackend.DAL.ProductDAO;
import com.levana.levanabackend.Model.Cart;
import com.levana.levanabackend.Model.Product;

@Controller
public class CartController {
	@Autowired
	CartDAO cartdao;
	@Autowired
	ProductDAO productdao;

	@RequestMapping("addToCart")
	String addToCart(@RequestParam("pid") int pid, HttpSession session) {
		if (session.getAttribute("usercartid") != null) {
			Product p = productdao.SelectProduct(pid);
			ArrayList<Cart> cartlist = (ArrayList<Cart>) cartdao
					.SelectCart(Integer.parseInt(session.getAttribute("usercartid").toString()));
			Iterator<Cart> cartiterator = cartlist.listIterator();
			while (cartiterator.hasNext()) {
				Cart cart2 = (Cart) cartiterator.next();
				if (cart2.getPid() == pid) {
					int qty=cart2.getQuantity()+1;
					if(qty>6)
					{
					 return "redirect:/AllProduct";	
					}
					
					cart2.setQuantity(qty);
					cart2.setTotal(qty*p.getPrice());
					cartdao.UpdateCart(cart2);
					return "redirect:/AllProduct";
				}
			}
			Cart c = new Cart();
			c.setCartid(Integer.parseInt(session.getAttribute("usercartid").toString()));
			c.setPid(pid);
			c.setQuantity(1);
			c.setProduct_Name(p.getProduct_Name());
			c.setPrice(p.getPrice());
			c.setTotal(p.getPrice());
			cartdao.CreateCart(c);
			return "redirect:/AllProduct";
		} 
		else {
			session.setAttribute("proid", pid);
			return "redirect:/Signin";
		}
	}

	@RequestMapping("/user/SelectCart")
 String viewCart(Model m,HttpSession session) 
 {
  int cartid=Integer.parseInt(session.getAttribute("usercartid").toString());
  m.addAttribute("cartpage", true);
  m.addAttribute("title", "levana-MyCart");
  m.addAttribute("cartlist", cartdao.SelectCart(cartid));
  return "index"; 
  
 }

	@RequestMapping("/user/deleteitem")
 public String DeleteCart(@RequestParam("itemid") int id)
 {
	cartdao.DeleteCart(id);
	return "redirect:/user/SelectCart";
}
	
	@RequestMapping("/user/incqty")
	public String incqty(@RequestParam("itemid") int id)
	{
		Cart c=cartdao.showitem(id);
		int qty=c.getQuantity()+1;
		if(qty>6)
		{
			return "redirect:/user/SelectCart";
		}
		else
		{
		c.setQuantity(qty);
		c.setTotal(c.getPrice()*qty);
		cartdao.UpdateCart(c);
		return "redirect:/user/SelectCart";
		}
	}
	@RequestMapping("/user/decqty")
	public String decqty(@RequestParam("itemid") int id)
	{
		Cart c=cartdao.showitem(id);
		int qty=c.getQuantity()-1;
		if(qty==0)
		{
			return "redirect:/user/SelectCart";
		}
		else
		{
			c.setQuantity(qty);
			c.setTotal(c.getPrice()*qty);
			cartdao.UpdateCart(c);
			return "redirect:/user/SelectCart";
			}
		
	}
}