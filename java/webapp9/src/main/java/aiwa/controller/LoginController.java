package aiwa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import aiwa.entity.user;
import aiwa.model.UserModel;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userid");
		String password = request.getParameter("password");

		UserModel um = new UserModel(getServletContext());
		user u = um.findByIdAndPassword(userId, password);

		if (u != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginuser", u);
			response.sendRedirect("ItemListController");
		} else {
			request.setAttribute("msg", "ウーザーIDまたはパスワードが違います!!");
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		}
	}

}
