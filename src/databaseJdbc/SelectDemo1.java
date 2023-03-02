package databaseJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SelectDemo1 {
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
			PreparedStatement ps=conn.prepareStatement("select * from employee");
			//run query
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
				/*System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));*/
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//close connection
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}	
		}
	}
}