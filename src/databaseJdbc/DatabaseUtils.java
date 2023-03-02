package databaseJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DatabaseUtils {
	static Connection getConnection() {
		Connection conn = null;
		try {
			// Load driver
			Class.forName("com.mysql.jdbc.Driver");
			// create connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb2023", "root", "rootroot");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("connection is....." + conn);
		return conn;
	}
	static void insertData(int id, String name, int salary, String email, String pass) {
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.setString(4, email);
			ps.setString(5, pass);
			int modifiedRows = ps.executeUpdate();
			if (modifiedRows == 1) {
				System.out.println("insertion was successfull");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void update(String pass, String email, int id) {
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn
					.prepareStatement("update employee set password=? , email=? where idemployee=?");
			ps.setString(1, pass);
			ps.setString(2, email);
			ps.setInt(3, id);
			int modifiedRows = ps.executeUpdate();
			if (modifiedRows == 1) {
				System.out.println("updation was successfull");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete(int id) {
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("delete from employee where idemployee=?");
			ps.setInt(1, id);
			int modifiedRows = ps.executeUpdate();
			if (modifiedRows == 1) {
				System.out.println("deletion was successfull");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
