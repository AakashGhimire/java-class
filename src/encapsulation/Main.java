package encapsulation;

public class Main extends Student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		
		s.setName("Aakash");
		s.setAge(99);
		
		System.out.println("Name of student is "+s.getName());
	}

}
