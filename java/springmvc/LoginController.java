package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.beans.Student;

@Controller
public class LoginController {
	@Autowired
	StudentService stuser;
	@RequestMapping("/login")
	public ModelAndView processGreet()
	{
			ModelAndView mv=new ModelAndView("login");
			return mv;
	}
//	@RequestMapping("/registration")
//	public ModelAndView processRegistration()
//	{
//			ModelAndView mv=new ModelAndView("registration");
//			return mv;
//	}
	
	@RequestMapping("/authenticate")
	public ModelAndView processAuthenticate(@RequestParam("user") String un,@RequestParam("pwd") String p)
	{
		ModelAndView mv=new ModelAndView();
		if(un.equals("Jai") && p.equals("12345"))
			mv.setViewName("success");
		else
			mv.setViewName("failure");
		
			return mv;
	}
//	@RequestMapping("/register")
//	public ModelAndView registration(@ModelAttribute Student st)
//	{
//		ModelAndView mv=new ModelAndView("RegistrationSuccess");
//		mv.addObject("stuObj",st);
//		return mv;
//	}
	
	@RequestMapping("/add")
	public ModelAndView processAdd()
	{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("Add");
		return mv;
	}
	@RequestMapping("/addStu")
	public ModelAndView processAdding(@RequestParam("addId") int id,@RequestParam("addStu") String name,
			@RequestParam("addGender") String gender, @RequestParam("addPhone") String studentPhone, @RequestParam("addLocation") String location)
	{
		ModelAndView mv=new ModelAndView();
		Student stu=new Student();
		stu.setId(id);
		stu.setName(name);
		stu.setGender(gender);
		stu.setStudentPhone(studentPhone);
		stu.setLocation(location);
	    
		String str=stuser.AddStudent(stu);
		mv.setViewName("Added");
		return mv;
	}
	@RequestMapping("/retrieve")
	public ModelAndView processRetrieve()
	{
		ModelAndView mandv=new ModelAndView();
		
		String str=stuser.retrieveAll();
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
	@RequestMapping("/deleteStu")
	public ModelAndView processdelete(@RequestParam("deleteId") int id,@RequestParam("deleteName") String name)
	{
		ModelAndView mandv1=new ModelAndView();
		
		String str=stuser.deleteStudents(id);
		if(str.equals("deleted"))
		{
			mandv1.setViewName("deleted");	
		}
		else
			mandv1.setViewName("noUser");	
		
		return mandv1;
	}
	@RequestMapping("/modify")
	public ModelAndView processModify(@RequestParam("addId") int id,@RequestParam("addStu") String name,@RequestParam("addGender") String gender,
			@RequestParam("addPhone") String studentPhone, @RequestParam("addLocation") String location)
	{
		ModelAndView mv=new ModelAndView();
		Student stu=new Student();
		stu.setId(id);
		stu.setName(name);
		stu.setGender(gender);
		stu.setStudentPhone(studentPhone);
		stu.setLocation(location);
	    
		String str=stuser.ModifyStudent(stu);
		if(str.equals("Modified"))
		{
			mv.setViewName("modified");	
		}
		else
			mv.setViewName("noUser");	
		
		return mv;
	}
}
