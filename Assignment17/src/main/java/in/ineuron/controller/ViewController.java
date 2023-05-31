package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BlogData;
import service.IBlogService;
import servicefactory.ServiceFactory;


@WebServlet("/view")
public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IBlogService service;
	private RequestDispatcher rd;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String blogId = null;
		String message = null;
		String targetPage = null;
		BlogData blogData = null;
		try {
			blogId = request.getParameter("blogid");

			service = ServiceFactory.getServiceObject();

			if (service != null) {

				blogData = service.getheBlogDataById(Integer.parseInt(blogId));
				if (blogData.getContent() != null) {
					request.setAttribute("blogData", blogData);
					targetPage = "./viewblog.jsp";
				} else {
					message = "PLEASE ENTER VALID ID";
					request.setAttribute("message", message);
					targetPage = "./viewpage.jsp";
				}

			} else {
				message = "SOME INTERNAL ISSUE HAS OCCURED PLEASE TRY AFTER SOME TIME";
				request.setAttribute("message", message);
				targetPage = "./viewpage.jsp";
			}

			rd = request.getRequestDispatcher(targetPage);
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
