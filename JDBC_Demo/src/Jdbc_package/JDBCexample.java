package Jdbc_package;
import java.sql.*;

public class JDBCexample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/student_db";
		String userName = "root";
		String password = "";
		String query = "SELECT * FROM student_detail";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url,userName,password);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		System.out.println("Id" + " "+ " Name" + "   " + " Contact");
		while(rs.next()) {
		System.out.println(rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getString(3));
		}
		st.close();
		conn.close();
	}

}


/*
 * Output : 
			 Id  Name    Contact
			 2   Mayur   8000878897
			 3   Hanny   9705923307
 */
