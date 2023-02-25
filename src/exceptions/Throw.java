package exceptions;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Entery any name: ");
		Scanner scan = new Scanner(System.in);
		String enteredName = scan.next();
		try {
		if("Soojan".equals(enteredName)) {
			Exception exception = new Exception("Soojan is not allowed");
			throw exception;//this is customized exception
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Welcome "+enteredName);
	}
}
