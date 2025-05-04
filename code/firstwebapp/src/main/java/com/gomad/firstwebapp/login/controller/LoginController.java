package com.gomad.firstwebapp.login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("login")
	public String login() {
		return "Login";
	}
	
	
	@RequestMapping("home")
	public String authenticate(@RequestParam String user, ModelMap model) {
		logger.info("Info log @RequestParam is {}", user);
		logger.debug("Debug log @RequestParam is {}", user);
		model.put("user", user);
		return "HomePage";
	}

}
