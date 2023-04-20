package springmvc.beans;

public class Student {
	
	private Integer id;
	
	private String name;
	
	private String gender;
	
	private String studentPhone;
	
	private String location;
	
	public Student() {}

	public Student(Integer id, String name, String gender, String studentPhone, String location) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.studentPhone = studentPhone;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", studentPhone=" + studentPhone
				+ ", location=" + location + "]";
	}
	
}

