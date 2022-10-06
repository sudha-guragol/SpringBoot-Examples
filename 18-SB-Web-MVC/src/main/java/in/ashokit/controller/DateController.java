package in.ashokit.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/report")
public class DateController {

	@GetMapping("/date")
	public ModelAndView getTodyasDate() {
		ModelAndView mav=new ModelAndView();
		
		//java.util.date class gives date and time together
		//Date d=new Date();
		
		
		//LocalDtae  class is available  in java.time.LocalDate .it gives local date only
		LocalDate ld= LocalDate.now();
		
		mav.addObject("msg", "Todays date is:" +ld);
		
		/*LocalTime lt=LocalTime.now();
		mav.addObject("msg", "Todays time is:" +lt);
*/		mav.setViewName("index");
		return mav;
	}
}
