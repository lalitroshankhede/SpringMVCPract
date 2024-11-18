package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService = new UserService();

	@RequestMapping("/contact")
	public String showForm() {

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model, BindingResult result)

	{

		System.out.println(user);

		if (result.hasErrors()) {
			return "contact";
		}

		else if (user.getEmail().isBlank()) {

			return "redirect:/contact";
		}

		int createdUser = this.userService.createUser(user);
		model.addAttribute("message", createdUser);

		return "success";

	}

}

// If you dont user @ModelAttribute you need to write this complete code 

/*
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam("email") String userEmail,
 * 
 * @RequestParam("password") String userPassword, Model model) {
 * 
 * User user=new User(); user.setEmail(userEmail);
 * user.setPassword(userPassword);
 * 
 * 
 * // System.out.println(user);
 * 
 * System.out.println("user email"+userEmail);
 * System.out.println("user password"+userPassword);
 * 
 * //process
 * 
 * model.addAttribute("user",user); return "success";
 * 
 * }
 */