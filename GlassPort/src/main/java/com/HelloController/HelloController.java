package com.HelloController;
 
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloController {
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping(value={"/","/hello"})
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("Mainpage");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView showLogin(){
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}

}