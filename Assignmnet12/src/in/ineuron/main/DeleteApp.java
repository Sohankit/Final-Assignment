package in.ineuron.main;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import in.inueron.util.*;
public class DeleteApp {
	
	public void delete() {
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner sc=null;
		
		try {
			con=JdbcUtil.getJdbcConnection();
			
			String sqlDeleteQuery="delete from newstudents where id=?";
			 if(con != null) {
				 pstmt=con.prepareStatement(sqlDeleteQuery);
			 }
			 
			 if(pstmt !=null) {
				 sc=new Scanner(System.in);
				  System.out.println("Enter sid of the student ::");
				  
				  int sid=sc.nextInt();
				  
				  pstmt.setInt(1, sid);
				  int rowCount=pstmt.executeUpdate();
				  
				  if(rowCount>0) {
					  System.out.println("Record deleted succesfully...!");
				  }
			 }
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
