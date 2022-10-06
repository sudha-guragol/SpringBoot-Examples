package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  

public class CourseController {
	@GetMapping("/course")
	@ResponseBody
	public String getCourseDetail(String cname,String trainer)
	{
		
		if(cname.equals("SBMS"))
				{
		String msg=cname + " By " + trainer + "  starting from 01-jun-2021 11.30Am IST";
		return msg;
	}
		else if(cname.equals("JRTP"))
		{
			String msg=cname + " By " + trainer + "  starting from 31-jun-2021 7.30Am IST";
		return msg;
		}
return "Contact Admin Team ::+91 9844351515 ";
}
}
/*I/p
http://localhost:7090/course?cname=SBMS&trainer=Ashok
	o/p
	SBMS By Ashok starting from 01-jun-2021 11.30Am IST
	
	I/p :http://localhost:7090/course?cname=JRTP&trainer=Ashok
		o/p:JRTP By Ashok starting from 31-jun-2021 7.30Am IST*/