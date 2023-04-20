package SpringMvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empser")
public class EmployeeService {
	@Autowired
	EmployeeDuo ed;
	

	public EmployeeDuo getEd() {
		return ed;
	}
	public void setEd(EmployeeDuo ed) {
		this.ed = ed;
	}
//	public String getEmp(int id) {
//		if(this.ed.getDetails(id) == null)
//			return "Invalid Id";
//		else
//			return this.ed.getDetails(id).toString();
//	}
	//Create method to add employee
	
    public String AddEmployee(Employee e ) {
    	String str=ed.AddEmployee(e);
		return str;
    	
    }
    public String retrieveAll(){
    	String str=ed.retrieveEmployees();
    	return str;
    }
    public String deleteEmployee(int id) {
    	String str=ed.deleteEmployees(id);
		return str;
    	
    }
	public String ModifyEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String str=ed.ModifyEmployees(emp);
		return str;
	}
}
