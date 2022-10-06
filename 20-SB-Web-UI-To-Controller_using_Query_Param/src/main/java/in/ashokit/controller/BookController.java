package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {
	
	/*@GetMapping("/price")
	@ResponseBody */
	//if v pass this key as isbn in url we get output http://localhost:7090/book/price?isbn=isbn002(o/p)The Book Price Of isbn002 Is :450.00 INR
	//if v pass method parameter as str then v get null value(http://localhost:7090/book/price?str=isbn002)o/p(The Book Price Of null Is :450.00 INR)
	//if method parameter and quey param is same no neew to write @reqParam annotation else need to mention @reqparam
	
	
	/*public String getBookPrice(String isbn)
	{
		String msg="The Book Price Of   " +  isbn +"  Is :450.00 INR";
		return msg;
	}*/
	
	
	@GetMapping("/price")
	@ResponseBody 
	//http://localhost:7090/book/price?isbn=isbn002 (o/p) The Book Price Of isbn002 Is :450.00 INR
	/*public String getBookPrice(@RequestParam("isbn") String str)*/
	//url may be(http://localhost:7090/book/price?isbn=001isbn  or http://localhost:7090/book/price(takesdefault mentioned value
	public String getBookPrice(@RequestParam(name="isbn",required=false,defaultValue="ISBN009") String str)
	{
		String msg="The Book Price Of  "  +   str  +  "  Is :450.00 INR";
		return msg;
	}


} 
