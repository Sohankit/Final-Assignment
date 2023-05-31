package persistence;
import java.io.IOException;
import java.sql.*;
import jdbcutil.JdbcUtil;

public class Dao {
	private static Connection connection;
	private static PreparedStatement pstmt;

	public static ResultSet viewStudent() {

		String sqlQuery = "select sid,sname,sage,saddress from student";
		try {
			connection = JdbcUtil.getJdbcConnection();
			if (connection != null) {
				pstmt = connection.prepareStatement(sqlQuery);

			}
			if (pstmt != null) {
				ResultSet rs = pstmt.executeQuery();
				return rs;
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		return null;

	}
}
