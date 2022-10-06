package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.pojo.Product;

@Controller
public class ProductController {
	@GetMapping("/productdata")
	public ModelAndView getProductData() {
		ModelAndView mav=new ModelAndView();
		Product pobj=new Product();
		pobj.setProductId(101);
		pobj.setProductName("keyboard");
		pobj.setProductPrice(500.50);
		//adding pobj to model in key v	alue pair format
		mav.addObject("product", pobj);
		//setting logical view name which is to be rendered
		mav.setViewName("product-data");
	
		return mav;
	}

}
