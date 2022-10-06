package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {
@RequestMapping("/price/{carName}")
@ResponseBody
/*	public String getCarPrice(String carName)
	or*/
	public String getCarPrice(@PathVariable("carName")String CARName)
	{
	String msg=CARName +" price is 8.2 lakhs";
	return msg;
		
	}
//more than 1 pathVariable

@GetMapping("/check/{carName}/{location}/{branch}")
@ResponseBody
public String checkDetails(@PathVariable String carName,@PathVariable String location,@PathVariable String branch)
{String responseMsg="In  " + location + "  "+ branch +" Branch " + carName + " cars are Availabe";
return responseMsg;
	
}

/*(I/p) :http://localhost:7090/check/benz/banglore/Jpnagar
	(o/p):In banglore JP nagar Branch benz cars are Availabe*/

}
