package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ashokit.pojo.Plan;
@Controller
public class InsurancePlanCOntroller {
	//this controller method returns object
	@GetMapping("/plandata")
	/*(@Controller+@ResponseBody=RestController) restcontroller deal with JSOn data
	
	below method display {"planId":101,"planName":"Jeevan Aanand","planStatus":"Approved"} 
	  when we use @ResponseBody,
	disdispatcher servlet convert java obj to json data by using jackson api (is called postProcessing)*/
	//(@ResponseBody gives response data)
	@ResponseBody
	
	public Plan getPlanData()
	{
	
	Plan p=new Plan();
	p.setPlanId(101);;
	p.setPlanName("Jeevan Aanand");
	p.setPlanStatus("Approved");
	//returning obj with json data
	return p;
	}

}
