package aiwa.controller;

import java.io.IOException;
import java.io.PrintWriter;

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

		String t = request.getParameter("type");
		int num = Integer.parseInt(t);

		//"PrintWriter"dengan response bisa mengembalikan text
		PrintWriter pw = response.getWriter();

		if (num == 1) {
			pw.println("I am Miura");
		} else if (num == 2) {
			pw.println("I am Ichimiya");
		} else if (num == 3) {
			pw.println("I am Maruyama");
		}
	}

}
