package com.levana.levanafrontend.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.levana.levanabackend.DAL.UserDAO;
import com.levana.levanabackend.Model.User;


@Controller
public class UserController 
{
	@Autowired
	UserDAO UserDAOImpl;
	
	@RequestMapping(value= {"/Signup"})
	public String register(Model m){

	m.addAttribute("Signuppage", true);
	m.addAttribute("tittle", "levana.Signup");
	m.addAttribute("User", new User());
	return "index";
	}
	
	@RequestMapping("/addUser")
	public String addUser(@Valid @ModelAttribute("User") User user,BindingResult BR,Model m)
	{
		if(BR.hasErrors())
		{
		System.out.println("1");	
			m.addAttribute("Signuppage", true);
			m.addAttribute("tittle", "levana.Signup");
			m.addAttribute("User",user);
		}
		else			
		{

			
			if(UserDAOImpl.CreateUserDetails(user))
			{
				System.out.println("2");
				m.addAttribute("Signin", true);
				m.addAttribute("tittle", "Levana.Signin");
			}
			else
			{
				System.out.println("3");
				m.addAttribute("Signuppage", true);
				m.addAttribute("tittle", "levana.Signup");
				m.addAttribute("User",user);
			}
		}
		return "index";
	}

	
}
