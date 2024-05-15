package com.example.contactmanager.SmartContactManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.contactmanager.SmartContactManager.dao.UserRepository;
import com.example.contactmanager.SmartContactManager.entities.Contact;
import com.example.contactmanager.SmartContactManager.entities.User;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title","Home-Smart Contact MAnager");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title","About-Smart Contact MAnager");
		return "about";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title","Register-Smart Contact MAnager");
		return "signup";
	}
	

}
