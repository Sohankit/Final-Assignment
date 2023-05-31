package in.inueron.util;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public static void cleanUp(Connection con,PreparedStatement pstmt,ResultSet resultSet) throws SQLException {
		if(con!=null) {
			con.close();
		}
		
		if(pstmt !=null) {
			pstmt.close();
		}
		
		if(resultSet !=null) {
			resultSet.close();
		}
	}
}
