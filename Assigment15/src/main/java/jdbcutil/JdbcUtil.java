package jdbcutil;

import java.io.IOException;
import java.sql.*;

public class JdbcUtil {
	
	private JdbcUtil() {
		
	}
	static {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
	
	public static Connection getJdbcConnection() throws SQLException,IOException{
		
		String url = "jdbc:mysql:///ineuron";

		String userName = "root";
		String passWord = "Root@123";
		
		
		Connection connection =DriverManager.getConnection(url,userName,passWord);
		System.out.println("Connection Object is created");
		return connection;
				
	}
	
	public static void cleanUp(Connection con,Statement stm,ResultSet resultSet) throws SQLException {
		if(con!=null) {
			con.close();
		}
		
		if(stm != null) {
			stm.close();
		}
		
		if(resultSet !=null) {
			resultSet.close();
		}
		System.out.println("Connection object destroyed");
}
}
