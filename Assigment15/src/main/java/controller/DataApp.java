package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dto.Student;
import persistence.Dao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class DataApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Student> list = new ArrayList<Student>();

		ResultSet rs = Dao.viewStudent();
		if (rs != null) {
			try {
				if (rs.next()) {
					Student std = new Student();
					std.setSid(rs.getInt(1));
					std.setSname(rs.getString(2));
					std.setSage(rs.getInt(3));
					std.setSaddress(rs.getString(4));
					list.add(std);
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("/display.jsp");
					request.setAttribute("student", list);
					requestDispatcher.forward(request, response);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			PrintWriter out = response.getWriter();
			out.println("<h1><center>No Data available</center></h1>");
		}
	}

}
