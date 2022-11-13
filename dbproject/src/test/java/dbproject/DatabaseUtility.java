package dbproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtility implements DatabaseAccessor {
	private Connection con;
	private String userName = "Alba1020";
	private String password = "Alba1020!";
	
	public DatabaseUtility(String url) {
		try {
			this.con = DriverManager.getConnection(url, userName, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return this.con;
	}
	
	@Override
	public String[] ExecuteSingleColumn(String sql) {

		return null;
	}

	@Override
	public String ExecuteSingleCell(String sql) {

		return null;
	}

	@Override
	public DataRow[] Execute(String sql) {

		return null;
	}

}
