package aiwa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test2Controller")
public class Test2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//parameter
		String n = request.getParameter("name");

		if (n == null) {
			n = "";
		}

		//model

		//view

		request.setAttribute("name", n);
		request.getRequestDispatcher("/test2.jsp").forward(request, response);
	}

}
