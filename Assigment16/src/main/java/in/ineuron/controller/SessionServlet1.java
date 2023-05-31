package in.ineuron.controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		
		session.setAttribute("CollegeName", "YCCE");

		request.setAttribute("branch", "Etc");
		request.setAttribute("favoriteSport", "CRICKET");

		RequestDispatcher rd = request.getRequestDispatcher("data1.jsp");
		rd.forward(request, response);
	}

}
