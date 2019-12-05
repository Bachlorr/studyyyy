package com.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/test")
	public String test(String name)
	{
		System.out.println(name);
		return "a";
	}
}
