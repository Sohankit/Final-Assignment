package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessiondata")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("age", "55");
		session.setAttribute("address", "csk");


		RequestDispatcher rd = request.getRequestDispatcher("./data.jsp");
		rd.forward(request, response);
	}

}
