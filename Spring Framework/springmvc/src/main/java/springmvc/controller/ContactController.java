package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService ;
	
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "learn with me");
		m.addAttribute("Desc", "Home for many");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
//		m.addAttribute("Header", "learn with me");
//		m.addAttribute("Desc", "Home for many");
		return "contact";
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleFrom(@ModelAttribute User user,Model model)
	{
//		model.addAttribute("Header", "learn with me");
//		model.addAttribute("Desc", "Home for many");
		
		System.out.println(user);
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
			
		}
		
		int createUser = this.userService.createUser(user);
		
		model.addAttribute("msg", "user created with" + createUser);
		
		return "success";
	}

}






//@RequestMapping(path="/processform",method=RequestMethod.POST)
//public String handleFrom(@RequestParam(name="email",required = false) String userEmail,
//		@RequestParam("userName") String userName,
//		@RequestParam("password")String userPassword,Model model)
//
//
//{
//	User user=new User();
//	user.setEmail(userEmail);
//	user.setUserName(userName);
//	user.setPassword(userPassword);
//	
//	System.out.println(user);
//	
////	
////	model.addAttribute("email",userEmail);
////	model.addAttribute("name", userName);
////	model.addAttribute("password", userPassword);
////	
//	model.addAttribute("user", user);
//	return "success";
//}