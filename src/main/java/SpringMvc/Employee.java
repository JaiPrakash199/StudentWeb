package SpringMvc;

public class Employee {
	int id;
	String name;
	double Salary;
	public Employee() {}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public void greet() {
		System.out.println("Hello Nandini");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	

}
