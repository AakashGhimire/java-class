package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("soojan", 500, "nepal");
		Employee emp2 = new Employee("mohan", 400, "fremont");
		Employee emp3 = new Employee("donald", 800, "india");
		
//		System.out.println(emp1);
//		emp1.setName("aakash");
//		System.out.println(emp1.getName());
		
		
		//System.out.println(emp1);
		List<Employee> listOfEmployees= new ArrayList<>();
	
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		
		System.out.println(listOfEmployees);
		Employee newEmp = new Employee ("soojan", 500, "nepal");
		System.out.println(listOfEmployees.contains(emp1)); //checks if emp1 is in listOfEmployees

		//sort by integer
		Collections.sort(listOfEmployees);
		System.out.println(listOfEmployees);
		
		//sort by string
		Collections.sort(listOfEmployees, new SortByNameComparator());
		System.out.println(listOfEmployees);
		
		
	}

}
