package exceptions;
//ExceptionHandling = to avoid the program to terminate abnormally and continue further
//5 keywords = try, catch, finally, throw and throws

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 10;
		int c = 0;
//		System.out.println(a/b);
		try {
			System.out.println("aakash");
			System.out.println(a/c); //run time error (Exception) program terminal abnormally
			System.out.println("ghimire");
		}
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("exception handled here"); 
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("exception handled here"); 
		}
		
		System.out.println("end");

	}

}

