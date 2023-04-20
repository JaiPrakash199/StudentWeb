package springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springmvc.beans.Student;

@Component("ed")
public class StudentDao {
	@Autowired
	StudentCollection sc;
	
	public StudentCollection getSc() {
		return sc;
	}

	public void setSc(StudentCollection sc) {
		this.sc = sc;
	}

	public Student getDetails(int id) {
		List<Student> s=sc.getList();
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getId() == id) {
			 return s.get(i);
			}
		}
		return null;
	}
	// Create method add student with parameter of stu type.
//	public Student receiveDetails(int id) {
//		List<Student> e=ec.getList();
//		for(int i=0;i<e.size();i++) {
//			if(e.get(i).getId() == id) {
//			 return e.get(i);
//			}
//		}
//		return null;
//	}
	public String AddStudent(Student e) {
		 List<Student> list=sc.getList();
		 list.add(e);
		 return "Added";
		 
	}
	public String retrieveStudents(){
	    String str=sc.getList().toString();	
	    return str;
	}
	public String deleteStudents(int id){
	    List<Student> listt=sc.getList();	
	    for(Student s: listt) {
	    	if(s.getId() == id)
	    	{
	    		listt.remove(s);
	    		return "Deleted";
	    	}
	    }
	    return "Cannot delete";
	}

	public String ModifyStudents(Student stu) {
		// TODO Auto-generated method stub
		List<Student> listt=sc.getList();	
	    for(Student s: listt) {
	    	if(s.getId() == stu.getId())
	    	{
	    		listt.remove(s);
	    		listt.add(stu);
	    		return "Modified Successfully";
	    	}
	    }
	    return "Cannot Modify";
		
	}
}
