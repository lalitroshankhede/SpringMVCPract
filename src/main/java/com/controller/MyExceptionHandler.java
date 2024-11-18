package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

//  *********** EXCEPTION HANDLING IN SPRING *******

	// Show Null Pointer Exception
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg", "Null Pointer Exception Ouccured");
		return "null_page";

	}

	// Show Number Format Exception
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m) {
		m.addAttribute("msg", "Number Format Exception Ouccured");
		return "null_page";

	}

	// Show Generic/ Any Specific type Exception
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(Model m) {
		m.addAttribute("msg", "Exception Ouccured");
		return "null_page";

	}

}
