package teestNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Database {
	
	@Test
	public void jdbcconnection() throws SQLException
	{
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qadb", "root", "Root");
		 Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery("Select * from employeinf where location= 'gwalior'");
		 
		 rs.next();	 
		  String name = rs.getString("name");
            System.out.println(name);		 

		
	}

}
