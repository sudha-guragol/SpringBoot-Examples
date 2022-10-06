package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.net.SyslogOutputStream;
import in.ashokit.model.Book;
import lombok.Getter;

@Controller
public class WelcomeController {
	@GetMapping(value= {"/","/addBook"})
	public String welcomeMsg(Model model)
	{ 
		Book b=new Book();
		
model.addAttribute("book", b);
return "addBook";
}
	@PostMapping(value="/addBook")
	public String handleSubmitBtnClk(Model model,Book book)
	{
		System.out.println(book);
		return "bookDetails";
	}
}