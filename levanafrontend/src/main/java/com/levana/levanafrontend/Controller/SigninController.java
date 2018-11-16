package com.levana.levanafrontend.Controller;

import java.util.Collection;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.levana.levanabackend.DAL.CartDAO;
import com.levana.levanabackend.DAL.ProductDAO;
import com.levana.levanabackend.DAL.UserDAO;
import com.levana.levanabackend.Model.UserDetails;

@Controller
public class SigninController
{
 @Autowired
 UserDAO userdao;
 
 @Autowired
 CartDAO cartdao;
 
 @Autowired
 ProductDAO productdao;
 
 @RequestMapping(value= {"/Signin"})
	public String Signinpage(Model m){
	m.addAttribute("error",false);	
	m.addAttribute("Signinpage", true);
	m.addAttribute("title","levana-Signin");
	return "index";
	}
 
 @RequestMapping(value= {"/fSignin"})
	public String ErrorSigninpage(Model m){
	m.addAttribute("error",true);	
	m.addAttribute("Signinpage", true);
	m.addAttribute("title","levana-Signin");
	return "index";
	}
 
 
 @RequestMapping("/Signinsuccess")
 public String isLoggedin(HttpSession session) 
 {
  String email = SecurityContextHolder.getContext().getAuthentication().getName();
  @SuppressWarnings("unchecked")
  Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
    .getAuthentication().getAuthorities();
  for (GrantedAuthority authority : authorities) 
  {
   if (authority.getAuthority().equals("ROLE_USER")) 
   {
    UserDetails customer = userdao.SelectUser(email);
    session.setAttribute("useremail", customer.getEmailid());
    session.setAttribute("usercartid", customer.getCart_id());
    session.setAttribute("username",customer.getUser_name());
    session.setAttribute("userlogin", true);
    
    //session.setAttribute("cartsize", cartdao.ViewCart(customer.getCart_id()).size());
   
   if(session.getAttribute("proid")!=null)
   {
    return "redirect:/addToCart?pid="+Integer.parseInt(session.getAttribute("proid").toString());
   }
   else
   {
    return "redirect:/";
   }
   }
   else 
   {
    session.setAttribute("username","Administrator");
    session.setAttribute("userlogin", false);
    return "redirect:/";
   }
  }
  return "redirect:/";
 }
}