package in.ineuron.controller;
//14. Create a Java servlet that reads the name of the user from a form and displays a
//welcome message on the web page. The servlet should use the GET method to read
//the input data from the user.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome")
public class WelcomeApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uName");
		out.println("<h1 style='color:green;'><center>Welcome "+name+"<center></h1>");
		
	}
}
