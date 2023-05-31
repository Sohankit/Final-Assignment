package in.ineuron.main;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import in.inueron.util.*;

public class Update {

	public void update() {

		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = null;

		try {
			con = JdbcUtil.getJdbcConnection();

			String sqlUpdateQuery = "update newstudents set firstname=?,middlename=?,lastname=?,age=? where id=?";

			if (con != null) {
				pstmt = con.prepareStatement(sqlUpdateQuery);

			}

			if (pstmt != null) {
				sc = new Scanner(System.in);
				System.out.println("Enter id ::");
				int id = sc.nextInt();

				System.out.println("Enter first name");
				String firstName = sc.next();

				System.out.println();

				System.out.println("Enter middle name");
				String middleName = sc.next();

				System.out.println("Enter last name");
				String lastName = sc.next();

				System.out.println("Enter age");
				int age = sc.nextInt();

				pstmt.setString(1, firstName);
				pstmt.setString(2, middleName);
				pstmt.setString(3, lastName);
				pstmt.setInt(4, age);
				pstmt.setInt(5, id);

				int rowCount = pstmt.executeUpdate();
				if (rowCount > 0) {
					System.out.println("Record Updated....!!!");
				} else {
					System.out.println("Fail to update record");
				}
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
