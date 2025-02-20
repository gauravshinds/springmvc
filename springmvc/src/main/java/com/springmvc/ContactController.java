package com.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm(Model model) {
		
//		model.addAttribute("Header", "LearnWithGaurav  Full Stack");
//		model.addAttribute("Dese", "Programming......");
		System.out.println("Creating form");
		return "contact";
		
		
	}
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "LearnWithGaurav  Full Stack");
		model.addAttribute("Dese", "Programming......");
		System.out.println("adding common data for model");
	}
	
	
	//usernate way using model attribute
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model) {
        try {
            // Calling the service to save the user
            int userId = this.userService.createUserDao(user);
            System.out.println("User created with ID: " + userId);

            // Optionally, add user details or confirmation message to the model
            model.addAttribute("message", "User created successfully with ID: " + userId);
            return "success";  // Success page or confirmation view
        } catch (Exception e) {
            // Handling potential errors and providing feedback
            model.addAttribute("message", "An error occurred while creating the user.");
            return "error";  // Error page or view
        }
		
	}
	
/*	
	@RequestMapping(path = "/processform", method = RequestMethod.POST )
	public String handledForm(
			@RequestParam(name = "email", required = true) String userEmail,
			@RequestParam("userName") String username, 
			@RequestParam("userPassword") String password,
			Model model
			) {
		
		System.out.println(userEmail);
		System.out.println(username);
		System.out.println(password);
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(username);
		user.setUserPassword(password);
		
		System.out.println(user);
		
		model.addAttribute("us", user);
		
//		model.addAttribute("email", userEmail);
//		model.addAttribute("user", username);
//		model.addAttribute("pass", password);
		
		return "success";
		
	}
	*/
	
	

}
