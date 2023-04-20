package springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import springmvc.beans.Student;

@Component("ec")
public class StudentCollection {
  List<Student > list=new ArrayList<>();

public List<Student> getList() {
	//create arraylist as list and add three student objects in it
    list.add(new Student(1,"yssg","male","20","pune"));
    list.add(new Student(2,"hguj","male","23","chennai"));
	return list;
}

public void setList(List<Student> list) {
	this.list = list;
}

@Override
public String toString() {
	return "StudentCollection [list=" + list + "]";
   }
  
}

