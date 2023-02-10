package encapsulation;

public class Main extends Student{

	public static void main(String[] args) {
		// Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit.
		// In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.

		Student s = new Student();
		
		s.setName("Aakash");
		s.setAge(99);
		
		System.out.println("Name of student is "+s.getName());
	}

}
