package in.ineuron;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.inueron.util.*;

public class TestApp {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		BufferedReader br = null;
		FileReader fr = null;

		try {
				connection=JdbcUtil.getJdbcConnection();
			String insertQuery = "insert into student (sname,sage,saddress) values(?,?,?)";
			if (connection != null) {
				pstmt = connection.prepareStatement(insertQuery);
			}

			if (pstmt != null) {
				fr = new FileReader(
						"C:\\Users\\Sohankit\\Servlet-workspace\\Assignment13\\src\\data.txt");
				br = new BufferedReader(fr);
				String line = br.readLine();
				while (line != null) {
					String[] splitData = line.split(" ");

					pstmt.setString(1, splitData[0]);
					pstmt.setInt(2, Integer.parseInt(splitData[1]));
					pstmt.setString(3, splitData[2]);

					pstmt.addBatch();
					line = br.readLine();
				}
			}

			int[] rowsAffected = pstmt.executeBatch();
			System.out.println(" No of Rows Inserted " + rowsAffected.length);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			{
				try {
					br.close();
					pstmt.close();
					connection.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
}
