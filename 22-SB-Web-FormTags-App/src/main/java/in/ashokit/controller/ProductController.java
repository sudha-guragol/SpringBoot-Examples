package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.bindings.Product;
import in.ashokit.service.ProductService;

@Controller
public class ProductController {
	
	private ProductService productService;
	//constructor injection
	@Autowired
	public ProductController(ProductService productService) 
	{
	this.productService=productService;
	}
	@GetMapping("/loadForm")
	public String loadForm(Model model)
	{
		Product pobj=new Product();
		model.addAttribute("key", pobj);
		return "index";
	}

	
	@PostMapping("/saveProduct")
	public String handleSaveBtnClick(Product key,Model model)
	{
		/*System.out.println(key);
		model.addAttribute("msg", "Product Saved Successfully");
		return "dashboard";*/
		Boolean isSaved = productService.saveProduct(key);
		if(isSaved)
		{
			model.addAttribute("msg", "Product data Saved Successfully");
		}
		else
		{
			model.addAttribute("msg", "Failed to save the procuct" );
		}
		return "dashboard";
	}
	
	
}
