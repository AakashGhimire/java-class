package hashSet;

import java.util.HashSet;
import java.util.Set;

import hashSet.Employee;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("soojan", 500, "nepal");
		Employee emp2 = new Employee("mohan", 400, "fremont");
		Employee emp3 = new Employee("donald", 800, "india");
		Employee emp4 = new Employee("donald", 800, "india");
		
		Set<Employee> hset1 = new HashSet<>();
	
		hset1.add(emp1);
		hset1.add(emp2);
		hset1.add(emp3);
		hset1.add(emp4);
		
		System.out.println(hset1);
		

	}

}
