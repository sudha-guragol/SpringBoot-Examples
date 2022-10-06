package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class Welcome {
	@GetMapping("/welcome")
	public ModelAndView dispalyWelcomeMsg() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "welcome to spring MVC !!!!");
		//model represents data in the key value pair...view represents logical file name
		mav.setViewName("index");
		return mav;
		
	}
	
	
	
	//4.x version onwords @request mapping comes
	//@GetMapping("/greet")
	@RequestMapping(value="/greet",method=RequestMethod.GET)
	public ModelAndView displayGreetMsg()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Good Morning");
		mav.setViewName("index");
		return mav;
	}
	
	//method without url pattern
	@GetMapping
	public ModelAndView methodWithoutUrlPattern() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "method without url pattern !!!!");
		//model represents data in the key value pair...view represents logical file name
		mav.setViewName("index");
		return mav;
		
	}
	

}
