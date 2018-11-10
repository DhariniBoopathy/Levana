package com.levana.levanafrontend.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.levana.levanabackend.DAL.CategoryDAO;
import com.levana.levanabackend.DAL.UserDAO;
import com.levana.levanabackend.Model.Category;
import com.levana.levanabackend.Model.User;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categorydaoImpl;

	@RequestMapping("/categorypage")
	public String categorypage(Model m) {
		System.out.println("hi");
		m.addAttribute("categorypage", true);
		m.addAttribute("title", "levana-Category");
		m.addAttribute("catlist", categorydaoImpl.ViewAllCategory());
		m.addAttribute("category", new Category());
		m.addAttribute("edit", false);

		return "index";

	}

	@RequestMapping("/addCategory")
	public String addCategory(@Valid @ModelAttribute("category") Category Category, BindingResult BR, Model m) {
		if (BR.hasErrors()) {
			System.out.println("err");
			m.addAttribute("categorypage", true);
			m.addAttribute("title", "levana-Category");
			m.addAttribute("catlist", categorydaoImpl.ViewAllCategory());
			m.addAttribute("category", Category);
			m.addAttribute("edit", false);


		} else {
			if (categorydaoImpl.CreateCategory(Category)) {
				System.out.println("err1");
				m.addAttribute("categorypage", true);
				m.addAttribute("title", "levana-Category");
				m.addAttribute("catlist", categorydaoImpl.ViewAllCategory());
				m.addAttribute("category", new Category());
				m.addAttribute("edit", false);


			} else {
				System.out.println("err2");
				m.addAttribute("categorypage", true);
				m.addAttribute("title", "levana-Category");
				m.addAttribute("catlist", categorydaoImpl.ViewAllCategory());
				m.addAttribute("category", Category);
				m.addAttribute("edit", false);


			}
		}
		return "index";
	}

	@RequestMapping("/deleteCategory")
	public String deletecategoryt(@RequestParam("catname") String catname) {
		categorydaoImpl.DeleteCategory(catname);
		return "redirect:/categorypage";
	}

	@RequestMapping("/editcategory")
	public String editcategoryt(@RequestParam("catname") String catname, Model m) {
		m.addAttribute("categorypage", true);
		m.addAttribute("title", "levana-Category");
		m.addAttribute("category", categorydaoImpl.ViewOneCategory(catname));
		m.addAttribute("catlist", categorydaoImpl.ViewAllCategory());
		m.addAttribute("edit", true);
		return "index";
	}
	

	@RequestMapping("/updateCategory")
	public String updateCategory(@Valid @ModelAttribute("category") Category Category, BindingResult BR, Model m) {
		if (BR.hasErrors()) {
			System.out.println("err");
			m.addAttribute("categorypage", true);
			m.addAttribute("title", "levana-Category");
			m.addAttribute("catlist", categorydaoImpl.ViewAllCategory());
			m.addAttribute("category", Category);
			m.addAttribute("edit", false);


		} else {
			if (categorydaoImpl.UpdateCategory(Category)) {
				System.out.println("err1");
				m.addAttribute("categorypage", true);
				m.addAttribute("title", "levana-Category");
				m.addAttribute("catlist", categorydaoImpl.ViewAllCategory());
				m.addAttribute("category", new Category());
				m.addAttribute("edit", true);


			} else {
				System.out.println("err2");
				m.addAttribute("categorypage", true);
				m.addAttribute("title", "levana-Category");
				m.addAttribute("catlist", categorydaoImpl.ViewAllCategory());
				m.addAttribute("category", Category);
				m.addAttribute("edit", false);


			}
		}
		return "index";
	}

}
