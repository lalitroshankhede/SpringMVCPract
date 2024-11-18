package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// Home Page

	@RequestMapping("/hello")
	public String hello(Model model) {
		System.out.println("Home Page");

		model.addAttribute("name", "Lalit Roshan");

		List<String> list = new ArrayList<String>();

		list.add("apple");
		list.add("banana");
		list.add("chiku");
		list.add("papaya");

		model.addAttribute("fruits", list);

		return "hello";
	}

	// About Page

	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("About Page");
		model.addAttribute("address", "plot no. N/66 surya nagar kalamna market road, Nagpur, MH 440035");

		String str = null;
		System.out.println(str.length());

		return "about";

	}

	// Help Page

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Help Page");
		// Creating ModelAndView Object
		ModelAndView modelAndView = new ModelAndView();

		// setting data
		modelAndView.addObject("name", "LalitR");

		// setting view page
		modelAndView.setViewName("help");

		return modelAndView;
	}

	// for common data use for all controller and views

	@ModelAttribute
	public void commonDataForModel(Model m) {

		m.addAttribute("Header", "Learn Code with Lalit");
		m.addAttribute("Desc", "Hello I'm Lalit Roshankhede a Full Stack Java Developer");

	}

	/*
	 * 
	 * // *********** EXCEPTION HANDLING IN SPRING *******
	 * 
	 * // Show Null Pointer Exception
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value=NullPointerException.class) public String
	 * exceptionHandlerNull(Model m) {
	 * m.addAttribute("msg","Null Pointer Exception Ouccured"); return "null_page";
	 * 
	 * }
	 * 
	 * // Show Number Format Exception
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value=NumberFormatException.class) public String
	 * exceptionHandlerNumberFormat(Model m) {
	 * m.addAttribute("msg","Number Format Exception Ouccured"); return "null_page";
	 * 
	 * }
	 * 
	 * // Show Generic/ Any Specific type Exception
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value = Exception.class) public String
	 * exceptionHandler(Model m) { m.addAttribute("msg","Exception Ouccured");
	 * return "null_page";
	 * 
	 * }
	 * 
	 */

}
