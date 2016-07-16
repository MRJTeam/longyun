package com.longyun.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	@RequestMapping("/")
	public String main()
	{
		return "login";
	}
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/index")
	public String  index()
	{
		return "index";
	}
	@RequestMapping("*.html")
	public String clientError()
	{
		return "404";
	}
	
	@RequestMapping("*.jsp")
	public String error()
	{
		return "404";
	}
}
