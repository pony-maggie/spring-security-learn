package org.spring.security.learn.chapter1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping({"/anon1","/anon2"})
	public String anon() {
		return "anon";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "user";
	}

}
