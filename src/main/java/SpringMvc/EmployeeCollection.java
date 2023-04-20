package SpringMvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("ec")
public class EmployeeCollection {
  List<Employee> list=new ArrayList<>();

public List<Employee> getList() {
	//create arraylist as list and add three employee objects in it
    list.add(new Employee(1,"yssg",56000));
    list.add(new Employee(2,"hguj",46000));
	return list;
}

public void setList(List<Employee> list) {
	this.list = list;
}

@Override
public String toString() {
	return "EmployeeCollection [list=" + list + "]";
   }
  
}
