package SpringMvc;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Java.SpringMvc.beans.Employee;

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
	@RequestMapping("/fetchEmployee")
	public ModelAndView processFetching()
	{
		Employee  emp1=new Employee();
		emp1.setEmployeeId(101);
		emp1.setEmployeeName("Nandini");
		emp1.setEmployeeSalary(45000);
		
		ModelAndView mv=new ModelAndView("view3");
		mv.addObject("employee1",emp1);
		return mv;
	
	}
}