package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("hello this home url");

		model.addAttribute("name", "kishlay chandan");
		model.addAttribute("id", 1421);

		List<String> friends = new ArrayList<String>();
		friends.add("krish");
		friends.add("chandan");
		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("hello this about url");
		return "about";
	}
	
	

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is Help URL ...");

//		creating model and view obj

		ModelAndView model = new ModelAndView();
//		setting the data
		model.addObject("name", "utkarsh");
		model.addObject("RollNo", 1212);
//		setting view name
		model.setViewName("help");
		LocalDateTime now = LocalDateTime.now();
		model.addObject("date", now);
		
//		Marks
		List<Integer> list=new ArrayList<Integer>();
	list.add(25);
	list.add(54);
	model.addObject("marks", list);
	

		return model;
	}

}
