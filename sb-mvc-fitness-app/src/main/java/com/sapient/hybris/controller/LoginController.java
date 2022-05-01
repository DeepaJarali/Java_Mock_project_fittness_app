package com.sapient.hybris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.hybris.model.User;
import com.sapient.hybris.service.CredentialException;
import com.sapient.hybris.service.UserService;

@Controller
@RequestMapping("/lo")
public class LoginController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public ModelAndView login() {		
		return new ModelAndView("login","user",new User());
	}
	

	@PostMapping(value= "/post-login" )
	public ModelAndView verify(@ModelAttribute User user, Model model) {
		System.out.println("Processing credentials....");
		ModelAndView mav= new ModelAndView();
		try {
			Boolean result= userService.isValidCredentials(user.getUsername(), user.getPassword());
			if(result==true) {				
				return new ModelAndView("redirect:/ac/menu");
			}else {
				mav.addObject("message", "Invalid Credentials");
			}
			
		}catch(CredentialException e) {
			e.printStackTrace();
			mav.addObject("message", e.getMessage());
		}
		mav.setViewName("status");
		return mav;
	}

}
