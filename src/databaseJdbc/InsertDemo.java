package databaseJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertDemo {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			//Load driver
			Class.forName("com.mysql.jdbc.Driver");
			//create connection
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb2023","root","rootroot");
			if(conn !=null){
				System.out.println("connected with database");
			}
			//create statement(PreparedStatement)
			PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, 17);
			ps.setString(2, "mohan");
			ps.setInt(3, 600);
			ps.setString(4, "mohan@gmail.com");
			ps.setString(5, "test123");
			//run query
			int modifiedRows=ps.executeUpdate(); //returns integer value
			if(modifiedRows==1){ //1 means success
				System.out.println("insertion was successfull");
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		//close connection
		finally{
			try {
				conn.close(); //closes connection 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}