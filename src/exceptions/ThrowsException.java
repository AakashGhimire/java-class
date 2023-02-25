package exceptions;
import java.util.Scanner;
public class ThrowsException {
	static String takeInput() throws Exception{ //throws is used in method to declare the calling method that it throws exception
		System.out.println("Enter any name: ");
		Scanner scan = new Scanner (System.in);
		String enteredName = scan.next();
		if("Soojan".equals(enteredName)){
			Exception exception = new Exception("Soojan is not allowed");
			throw exception;
		}
		return enteredName;
	}
	public static void main(String[] args) {
		String enteredName = null;
		System.out.println(enteredName);
		try {
			enteredName = takeInput();
		} catch (Exception e){
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Welcome "+enteredName);
	}
}
