package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class WishController {
	@GetMapping("/wish")
	public String getWishMsg(Model moldel)
	{
		
		moldel.addAttribute("msg","good noon ");
		return "index";
	}
	//we can have methods in 2 controller with same url pattern provided that class level url pattern will be different
	@GetMapping("/greet")
	public String getGreetMsg(Model moldel)
	{
		
		moldel.addAttribute("msg","good noon ");
		return "index";
	}

}
