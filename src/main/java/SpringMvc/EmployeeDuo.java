package SpringMvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("ed")
public class EmployeeDuo {
	@Autowired
	EmployeeCollection ec;
	
	public EmployeeCollection getEc() {
		return ec;
	}

	public void setEc(EmployeeCollection ec) {
		this.ec = ec;
	}

	public Employee getDetails(int id) {
		List<Employee> e=ec.getList();
		for(int i=0;i<e.size();i++) {
			if(e.get(i).getId() == id) {
			 return e.get(i);
			}
		}
		return null;
	}
	// Create method add employee with parameter of emp type.
//	public Employee receiveDetails(int id) {
//		List<Employee> e=ec.getList();
//		for(int i=0;i<e.size();i++) {
//			if(e.get(i).getId() == id) {
//			 return e.get(i);
//			}
//		}
//		return null;
//	}
	public String AddEmployee(Employee e) {
		 List<Employee> list=ec.getList();
		 list.add(e);
		 return "Added";
		 
	}
	public String retrieveEmployees(){
	    String str=ec.getList().toString();	
	    return str;
	}
	public String deleteEmployees(int id){
	    List<Employee> listt=ec.getList();	
	    for(Employee e: listt) {
	    	if(e.getId() == id)
	    	{
	    		listt.remove(e);
	    		return "Deleted";
	    	}
	    }
	    return "Cannot delete";
	}

	public String ModifyEmployees(Employee emp) {
		// TODO Auto-generated method stub
		List<Employee> listt=ec.getList();	
	    for(Employee e: listt) {
	    	if(e.getId() == emp.getId())
	    	{
	    		listt.remove(e);
	    		listt.add(emp);
	    		return "Modified Successfully";
	    	}
	    }
	    return "Cannot Modify";
		
	}

	

	

}
