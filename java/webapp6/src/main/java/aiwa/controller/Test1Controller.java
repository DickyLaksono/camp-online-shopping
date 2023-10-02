package aiwa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test1Controller")
public class Test1Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String d1 = request.getParameter("data1");//ini harus sama dengan text pada html "nama"
		String d2 = request.getParameter("data2");//ini harus sama dengan text pada html "nama"

		if (d1 == null) {
			d1 = "";
		}
		if (d2 == null) {
			d2 = "";

		}

		String answer = "";

		if (!d1.equals("") && !d2.equals("")) {
			answer = String.valueOf(Integer.parseInt(d1) + Integer.parseInt(d2));

		}

		request.setAttribute("d1", d1);
		request.setAttribute("d2", d2);
		request.setAttribute("answer", answer);

		request.getRequestDispatcher("/test1.jsp").forward(request, response);

	}

}
