package stringDemo;

public class StringDemoClass {
	public static void main(String[] args) {
		String s1  = "John"; //uses String pool 
		String s2 = new String("Doe"); //uses heap memory
		String s3  = "John";
		String s4 = new String("Doe");

//		System.out.println(2 + 3 + s1);
//		System.out.println(2 + 3 + s1 + 2);
//		System.out.println(2 + 3 + s1 + 2 + 3);
//		
//		System.out.println(s1.substring(1)); //ohn
//		System.out.println(s1.substring(0,3)); //Joh
//		
//		System.out.println(s1.charAt(0));
//		System.out.println(s1.charAt(s1.length() - 1));
		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println(s2.equals(s4));
		
		//comparesTo gives positive integer if string is greater
		//returns negative is string is less
		//returns 0 if they are equal
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s4));
	}

}
