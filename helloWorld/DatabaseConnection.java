package helloWorld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/student"; 
		try {
			// Establish Connection Object
			Connection conn = DriverManager.getConnection(url, "root", "student");
			
			//Create a statement Object 
			Statement st = conn.createStatement();
			
			//Execute Statement 
			ResultSet rs = st.executeQuery("select * from student");
			
			// Process the result
			while(rs.next())
			{
				System.out.println(rs.getString(2)+" "+rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
