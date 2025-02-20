package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println(userId);
		System.out.println(userName);
//		Integer.parseInt(userName);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("This is home controller................. ");
		return "home";
	}
	
	@RequestMapping("/search") //by default it is get
	public RedirectView search(@RequestParam("queryBox") String query) {
		
		String url="https://www.google.com/search?q="+query;
		RedirectView redirectView =  new RedirectView();
		
		redirectView.setUrl(url);
		
		return redirectView;
	}
	
	
	//
	////Handling exception in our spring mvc
	//
	//@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	//@ExceptionHandler(value = NullPointerException.class)
	//public String exceptionHanderNull(Model m) {
	//	m.addAttribute("msg", "Null Pointer exception has occured");
	//	return "null_page";
	//}
	//
	//@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	//@ExceptionHandler(value = NumberFormatException.class)
	//public String exceptionHanderNumberFormat(Model m) {
	//	m.addAttribute("msg", "Number format  exception has occured");
	//	return "null_page";
	//}
	//
	//@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	//@ExceptionHandler(value = Exception.class)
	//public String exceptionHanderGeneric(Model m) {
	//	m.addAttribute("msg", "Exception has occured");
	//	return "null_page";
	//}
	
	

}
