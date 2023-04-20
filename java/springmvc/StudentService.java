package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springmvc.beans.Student;

@Component("empser")
public class StudentService {
	@Autowired
	StudentDao sd;
	

	public StudentDao getSd() {
		return sd;
	}
	public void setEd(StudentDao sd) {
		this.sd = sd;
	}
//	public String getStu(int id) {
//		if(this.sd.getDetails(id) == null)
//			return "Invalid Id";
//		else
//			return this.s.getDetails(id).toString();
//	}
	//Create method to add student
	
    public String AddStudent(Student s ) {
    	String str=sd.AddStudent(s);
		return str;
    	
    }
    public String retrieveAll(){
    	String str=sd.retrieveStudents();
    	return str;
    }
    public String deleteStudents(int id) {
    	String str=sd.deleteStudents(id);
		return str;
    	
    }
	public String ModifyStudent(Student stu) {
		// TODO Auto-generated method stub
		String str=sd.ModifyStudents(stu);
		return str;
	}
}
