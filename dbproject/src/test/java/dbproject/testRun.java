package dbproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class testRun {
	
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/sakila";
		String username = "Alba1020";
		String password = "Alba1020!";
		String query1 = "SELECT city \r\n"
				+ "FROM sakila.city\r\n"
				+ "ORDER BY city DESC\r\n"
				+ "LIMIT 10;";
		{
		try {
			Connection db = DriverManager.getConnection(url, username, password);
			Statement statement = db.createStatement();
			ResultSet result = statement.executeQuery(query1);
			
			while(result.next()) {
				String sakila = "";
				for(int i=1;i<=1;i++) {
					sakila += result.getString(i) + ",";
				}
				System.out.println(sakila);
			}
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}

		}
	}
}
	