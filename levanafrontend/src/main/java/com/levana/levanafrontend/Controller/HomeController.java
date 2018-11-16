package com.levana.levanafrontend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	
		@RequestMapping(value= {"/","/home"})
		public String homepage(Model m)
		{
			m.addAttribute("sliderpage",true);
			m.addAttribute("title","levana-Home");
			return "index";
		}
	


		@RequestMapping(value= {"/aboutus"})
		public String aboutuspage(Model m){
			
		m.addAttribute("aboutuspage", true);
		m.addAttribute("title","levana-Aboutus");
		return "index";
		}
		
		@RequestMapping(value= {"/terms"})
		public String terms(Model m){
			
		m.addAttribute("termspage", true);
		m.addAttribute("title","levana-terms");
		return "index";
		}
		

		@RequestMapping(value= {"/privacy"})
		public String privacy(Model m){
			
		m.addAttribute("privacypage", true);
		m.addAttribute("title","levana-privacy");
		return "index";
		}
		
		
	
		@RequestMapping(value= {"/contactus"})
		public String contactuspage(Model m){
			
		m.addAttribute("contactuspage", true);
		m.addAttribute("title","levana-contactus");
		return "index";
		}
		
		
	
		
}
