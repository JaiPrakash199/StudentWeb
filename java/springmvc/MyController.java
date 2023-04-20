package springmvc;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc.beans.Student;

@Controller
public class MyController {
	
	@RequestMapping("/greet")
	public ModelAndView processGreet()
	{
		String model="Hello Everyone, Welcome to the Company!!!";
		String viewName="view1";
		
		ModelAndView mv=new ModelAndView(viewName);
		mv.addObject("modelData", model);
		
		return mv;
	}
	@RequestMapping("/bye")
	public ModelAndView processBye()
	{
		String model="Byeeee!!!!!";
		ModelAndView mv=new ModelAndView("view2");
		mv.addObject("md", model);
		return mv;
	}
	@RequestMapping("/fetchStudent")
	public ModelAndView processFetching()
	{
		Student st1=new Student();
		st1.setId(101);
		st1.setName("Jai");
		st1.setGender("Male");
		st1.setStudentPhone("9999999999");
		st1.setLocation("pune");
		
		ModelAndView mv=new ModelAndView("view3");
		mv.addObject("student1",st1);
		return mv;
	
	}
}
