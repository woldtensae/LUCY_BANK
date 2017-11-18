package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.mum.util.Util;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@RequestMapping
	public String displayMembers(Model model) {
		model.addAttribute("user", Util.getPrincipal());
		return "members";
	}

}
