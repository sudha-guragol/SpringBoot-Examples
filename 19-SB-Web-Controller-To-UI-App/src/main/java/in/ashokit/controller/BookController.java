package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	@GetMapping("/bookdata")
	public String getBookData(Model model)
	{model.addAttribute("name", "SpringBoot");
	model.addAttribute("author", "Rod johnson");
	model.addAttribute("price", 1300.0);
	//logical view file name
	return "book-data";
		
	}

}
