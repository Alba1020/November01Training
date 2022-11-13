package dbproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jdbcTests {
	private static DatabaseUtility accesor;
	
	@BeforeMethod
	public void Setup(){
		String url = "jdbc:mysql://localhost:3306/sakila";
		this.accesor = new DatabaseUtility(url);
		
	}
	@Test
	public void firstQuery() throws SQLException
	{
		Connection con = accesor.getConnection();
		Statement stat = con.createStatement();
		String query1 = "SELECT city \r\n"
				+ "FROM sakila.city\r\n"
				+ "ORDER BY city DESC\r\n"
				+ "LIMIT 10;";
		

			ResultSet result = stat.executeQuery(query1);
			
			while(result.next()) {
				String sakila = "";
				for(int i=1;i<=1;i++) {
					sakila += result.getString(i) + ",";
				}
				System.out.println(sakila);
			}
	}
	@Test
	public void secondQuery() throws SQLException
	{
		Connection con = accesor.getConnection();
		Statement stat = con.createStatement();
		String query2 = "SELECT max(amount) \n"
				+ "FROM sakila.payment;";
		ResultSet result2 = stat.executeQuery(query2);
		
		while(result2.next()) {
			String sakila = "";
			for(int i=1;i<=1;i++) {
				sakila += result2.getString(i) + ",";
			}
			System.out.println(sakila);
		}
	}
	@Test
	public void selectColumns() throws SQLException {
		Connection con = accesor.getConnection();
		PreparedStatement stat = con.prepareStatement("SELECT * FROM actor");
		
		ResultSet result = stat.executeQuery();
		
		while(result.next()) {
			System.out.println(result.getString(1) + " " + result.getString(2));
		}
	}
}