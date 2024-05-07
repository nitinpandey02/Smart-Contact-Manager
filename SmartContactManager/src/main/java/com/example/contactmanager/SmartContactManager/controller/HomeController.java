package com.example.contactmanager.SmartContactManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.contactmanager.SmartContactManager.dao.UserRepository;
import com.example.contactmanager.SmartContactManager.entities.Contact;
import com.example.contactmanager.SmartContactManager.entities.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		
		  User user=new User();
		  user.setName("Nitin");
		  user.setEmail("nitin.pandey@inc.com");
		  
		  Contact contact=new Contact();
		  user.getContacts().add(contact);
		  
		  userRepository.save(user);
		return "working";
	}

}
