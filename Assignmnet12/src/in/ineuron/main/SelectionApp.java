package in.ineuron.main;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import in.inueron.util.*;

public class SelectionApp {
	public void view() {
		
		Connection con=null;
		PreparedStatement preStm=null;
		ResultSet resultSet=null;
		Scanner sc= null;
		
		try {
			
			con=JdbcUtil.getJdbcConnection();
			String sqlSelectQuary="select id,firstname,middlename,lastname,age from newstudents where id=?";
			
			if(con!=null) {
				preStm=con.prepareStatement(sqlSelectQuary);
						
			}
			if(preStm != null) {
				sc= new Scanner(System.in);
				System.out.println("Enter sid of record...");
				int id=sc.nextInt();
				preStm.setInt(1, id);
				
				resultSet=preStm.executeQuery();
				
				if(resultSet != null) {
					if (resultSet.next()) {
						System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
								+ "\t" + resultSet.getString(4) + "\t" + resultSet.getInt(5));
					} else {
						System.out.println("Record not available for the give id :: " + id);
					}
				}
				
			}
			JdbcUtil.cleanUp(con, preStm, resultSet);
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

	}
}
