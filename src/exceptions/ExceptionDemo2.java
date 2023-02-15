package exceptions;
//using multiple catch block
//specific exceptions must come first  while generic exception should be in the last catch
public class ExceptionDemo2 {
	public static void main(String[] args) {
		int a=100;
		int b=10;
		int c=0;		

		try{

			System.out.println(a/b);//10
			System.out.println(a/c);//run time error(ArithmeticException)/program terminates abnormally
		}
		catch(ArithmeticException e){	
			System.out.println("Arithmetic exception handled here");
		}
		catch(Exception e){
			System.out.println("exception handled here");
		}
		System.out.println("the result of subtraction is "+""+ (a-b));
	}
}