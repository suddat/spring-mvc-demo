package com.dev.suddat.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// new controller method to read form data
	// add data to the model

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,
			Model model) {
		// get name from form of http request of HTML form

		String name = request.getParameter("studentName");

		// convert data to upper case;
		name = name.toUpperCase();

		String result = "Yo!! " + name;

		model.addAttribute("message", result);

		return "helloworld";
	}

	@RequestMapping("/processFormVersionThree")
	public String processFormThree(@RequestParam("studentName") String name,
			Model model) {

		// convert data to upper case;
		name = name.toUpperCase();

		String result = "Version Third called:!! " + name;

		model.addAttribute("message", result);

		return "helloworld";
	}
}
