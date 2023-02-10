package staticc;

public class Student {
	String batch;
	static String country = "Nepal";
	int age;
	
	public Student(String batch, int age) {
		super();
		this.batch = batch;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Jan2023", 22);
		Student student2 = new Student("Jan2021", 29);
		
		System.out.println(student1.batch +" "+ student1.country);
		System.out.println(student2.batch +" "+ student2.country);

	}

}
