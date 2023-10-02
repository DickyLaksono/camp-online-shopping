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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");//ini diperlukan untuk bisa menggunakan html

		String[] names = { "みうら", "まるやま", "いちみや", "ありた" };

		PrintWriter pw = response.getWriter();
		pw.println("<ul>");
		for (String n : names) {
			pw.println("<li>" + n + "</li>");
		}

		pw.println("</ul>");

	}

}
