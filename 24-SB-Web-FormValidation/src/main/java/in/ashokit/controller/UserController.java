package in.ashokit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ashokit.bindings.User;

@Controller
public class UserController {
	@RequestMapping("/")
	public String loadForm(Model model)
	{
		User userObj=new User();
		model.addAttribute("user",userObj);
		
		return "index";
	}

	@PostMapping("/saveUser")
	public String handleSaveBtnClick(@Valid User user, BindingResult result,Model model)
	{
		
		if(result.hasErrors())
		{
			return "index";
		}
		System.out.println(user);
		model.addAttribute("msg", "User Registered Successfully");
	return "success";
		
	}
}
