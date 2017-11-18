package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.mum.util.Util;

@Controller
public class HomeController {

	@RequestMapping({ "/", "/welcome" })
	public String welcome(Model model) {

		model.addAttribute("greeting", "Welcome to our community, Kimosabe!!");
		model.addAttribute("tagline", "The one and only place to live, work and play!!");
		return "welcome";
	}
	
	@RequestMapping(value = "/dba", method = RequestMethod.GET)
	public String dbaPage(ModelMap model) {
		model.addAttribute("user", Util.getPrincipal());
		return "dba";
	}
	
	

}
