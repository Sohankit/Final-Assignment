package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IBlogService;
import servicefactory.ServiceFactory;
import dto.BlogData;


@WebServlet("/insertion")
public class InsertionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IBlogService service;
	private RequestDispatcher rd;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		Integer blogId = null;
		String title = null;
		String description = null;
		String content = null;
		String message = null;
		String targetPage = null;

		try {
			title = request.getParameter("title");
			description = request.getParameter("description");
			content = request.getParameter("content");

			service = ServiceFactory.getServiceObject();

			if (service != null) {
				BlogData data = new BlogData();

				data.setBlogTitle(title);
				data.setBlogDescription(description);
				data.setContent(content);
				String status = service.insertBlogData(data);
				if (status.equalsIgnoreCase("success")) {
					blogId = service.findIdOfLatestInsertedRow();
					message = "DATA IS INSERTED WITH ID " + blogId;
					request.setAttribute("message", message);
					targetPage = "./viewpage.jsp";
				} else {
					message = "DATA INSERTION FAILED PLEASE TRY AFTER SOME TIME";
					request.setAttribute("message", message);
					targetPage = "./index.jsp";
				}
			} else {
				message = "SOME INTERNAL ISSUE HAS OCCURED PLEASE TRY AFTER SOME TIME";
				request.setAttribute("message", message);
				targetPage = "./index.jsp";
			}

			rd = request.getRequestDispatcher(targetPage);
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
