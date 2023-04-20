package SpringMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	EmployeeService empser;
	@RequestMapping("/login")
	public ModelAndView processGreet()
	{
			ModelAndView mv=new ModelAndView("login");
			return mv;
	}
	
	@RequestMapping("/authenticate")
	public ModelAndView processAuthenticate(@RequestParam("user") String un,@RequestParam("pwd") String p)
	{
		ModelAndView mv=new ModelAndView();
		if(un.equals("Nandini") && p.equals("12345"))
			mv.setViewName("success");
		else
			mv.setViewName("failure");
		
			return mv;
	}
	@RequestMapping("/add")
	public ModelAndView processAdd()
	{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("Add");
		return mv;
	}
	@RequestMapping("/addEmp")
	public ModelAndView processAdding(@RequestParam("addId") int id,@RequestParam("addEmp") String name,@RequestParam("addSalary") double salary)
	{
		ModelAndView mv=new ModelAndView();
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
	    
		String str=empser.AddEmployee(emp);
		mv.setViewName("Added");
		return mv;
	}
	@RequestMapping("/retrieve")
	public ModelAndView processRetrieve()
	{
		ModelAndView mandv=new ModelAndView();
		
		String str=empser.retrieveAll();
		ModelAndView mandv1=new ModelAndView("fetchedData");
		mandv1.addObject("fetchedData", str);
		
		return mandv1;
	}
	@RequestMapping("/delete")
	public ModelAndView processDelete()
	{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("delete");
		return mv;
	}
	@RequestMapping("/deleteEmp")
	public ModelAndView processdelete(@RequestParam("deleteId") int id,@RequestParam("deleteName") String name)
	{
		ModelAndView mandv1=new ModelAndView();
		
		String str=empser.deleteEmployee(id);
		if(str.equals("deleted"))
		{
			mandv1.setViewName("deleted");	
		}
		else
			mandv1.setViewName("noUser");	
		
		return mandv1;
	}
	@RequestMapping("/modify")
	public ModelAndView processModify(@RequestParam("addId") int id,@RequestParam("addEmp") String name,@RequestParam("addSalary") double salary)
	{
		ModelAndView mv=new ModelAndView();
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
	    
		String str=empser.ModifyEmployee(emp);
		if(str.equals("Modified"))
		{
			mv.setViewName("modified");	
		}
		else
			mv.setViewName("noUser");	
		
		return mv;
	}

}
