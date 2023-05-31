package in.ineuron.main;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import in.inueron.util.*;

public class InsertApp {

	public static void insert() {
		Connection con = null;
		Scanner sc = null;
		PreparedStatement pstm = null;

		try {
			con = JdbcUtil.getJdbcConnection();
			String sqlInsertQuery = "insert into newstudents(firstname,middlename,lastname,age)values(?,?,?,?)";

			if (con != null) {
				pstm = con.prepareStatement(sqlInsertQuery);
			}

			if (pstm != null) {

				sc = new Scanner(System.in);
				System.out.println("Enter first name");
				String firstName = sc.nextLine();
				System.out.println("Enter middle name");
				String middleName = sc.nextLine();
				System.out.println("Enter last name");
				String lastName = sc.nextLine();
				System.out.println("Enter age");
				int age = sc.nextInt();

				pstm.setString(1, firstName);
				pstm.setString(2, middleName);
				pstm.setString(3, lastName);
				pstm.setInt(4, age);
				int rowCount = pstm.executeUpdate();
				System.out.println("No of rows updated is :: " + rowCount);
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

	}
}