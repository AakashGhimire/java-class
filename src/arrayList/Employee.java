package arrayList;

import java.util.stream.Collectors;

//COmparable interface provides default sorting behavior of class
public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	private String location;
	
//	public Employee() {
//		super();
//	}
//	
	public Employee (String name, int salary, String location) {
		super();
		this.name = name;
		this.salary = salary;
		this.location = location;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}
	@Override
	public int compareTo(Employee s1) {
		// TODO Auto-generated method stub
		return this.salary - s1.salary; //ascending order
	}
	
//	public String compareTo(Employee n1) {
//		// TODO Auto-generated method stub
//		return n1.stream().sorted().collect(Collectors.toList());; //ascending order
//	}
	
	
}
