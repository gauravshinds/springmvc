package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Gaurav SHINDE");
		System.out.println("This is the home.......");
		return "index";
	}
	
	@RequestMapping("/friend")
	public String friendList(Model model){
		List<String> friends = new ArrayList<String>();
		friends.add("Nikhil");
		friends.add("SAGAR");
		friends.add("Rahul");
		model.addAttribute("f", friends);
		
		
		return "index";
	}
	
	/*
	 * This is modeland view method
	 * 
	 */
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help...");
		ModelAndView mdv = new ModelAndView();
		mdv.addObject("name","Uttam");
		
		LocalDateTime now = LocalDateTime.now();
		mdv.addObject("time", now);
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(45);
		marks.add(90);
		marks.add(80);
		marks.add(60);
		
		mdv.addObject("mk", marks);
		
		mdv.setViewName("help");
		
		
		return mdv;
		
	}
	
}
