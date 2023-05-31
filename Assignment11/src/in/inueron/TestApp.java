package in.inueron;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.inueron.util.JdbcUtil;

public class TestApp {
	
	public static void main(String[] args) {
	
	Connection connection=null;
	Statement statement =null;
	ResultSet resultSet;
	try {
		connection = JdbcUtil.getJdbcConnection();

		statement = connection.createStatement();

		System.out.println("STATEMENT object created...");

		// Step4. Execute the Query and Process the resultSet
		String sqlSelectQuery = "select * from newstudents";
		resultSet = statement.executeQuery(sqlSelectQuery);
		System.out.println("RESULTSET object created...");

		while (resultSet.next()) {
			Integer id = resultSet.getInt(1);
			String firstname = resultSet.getString(2);
			String middlename = resultSet.getString(3);
			String lastname = resultSet.getString(4);
			Integer age = resultSet.getInt(5);

			System.out.println(id + " " + firstname + " " + middlename + " " + lastname + " " + age);
		}
		// Step6. Close the resources
		JdbcUtil.cleanUp(connection, resultSet);
	} catch (SQLException | IOException e) {
		e.printStackTrace();
	}

}
}
