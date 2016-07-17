package com.longyun.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	@RequestMapping("/")
	public String index()
	{
		return "redirect:login";
	}
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/main")
	public String  mainEntrance()
	{
		return "main/mainBoard";
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
