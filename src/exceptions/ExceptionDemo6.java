package exceptions;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
