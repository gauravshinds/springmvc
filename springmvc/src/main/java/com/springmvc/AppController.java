package com.springmvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@RequestMapping("/home")
	public String getName(Model model) {
		System.out.println("Gaurav.....................");
		
		List<String> students = new ArrayList<String>();
		students.add("Madan");
		students.add("Sudan");
		students.add("Bharat");
		students.add("Parat");
		students.add("Surat");
		
		model.addAttribute("list", students);
		
		model.addAttribute("name", "Gaurav Shinde");
		return "index";
		
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("This is help controller");
		
		ModelAndView modelaAndView = new ModelAndView();
		modelaAndView.addObject("name", "Uttam");
		
		LocalDateTime date = LocalDateTime.now();
		modelaAndView.addObject("time", date);
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(34);
		marks.add(54);
		marks.add(54);
		marks.add(94);
		marks.add(39);
		
		modelaAndView.addObject("mkr", marks);
		
		//modelaAndView.addObject("mk", marks);
		
		modelaAndView.setViewName("help");
		return modelaAndView;
		
		
	}

}
