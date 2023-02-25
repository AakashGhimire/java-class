package exceptions;
public class ExceptionDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=10;
		int c=0;		
		try{
			System.out.println(a/b);//10
			System.out.println(a/c);//10/0 run time error(ArithmeticException)/program terminates abnormally
			System.exit(0);
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException handled here");
		}
		finally{ //this block will run always unless System.exit(0)
			System.out.println("i am finally block and i will always execute");
		}
		System.out.println("the result of subtraction is "+""+ (a-b));
	}
}
