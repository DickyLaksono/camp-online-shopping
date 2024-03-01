package aiwa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import aiwa.entity.account;
import aiwa.model.AccountModel;
import aiwa.model.SignModel;

@WebServlet("/SignUpController")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/SignUp.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//parameter
		request.setCharacterEncoding("UTF-8");

		String mode = request.getParameter("mode");

		String id = request.getParameter("id");
		if (id == null) {
			id = "0";
		}

		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String isAdmin = request.getParameter("isAdmin");
		if (isAdmin == null) {
			isAdmin = "0";
		}
		String zipcode = request.getParameter("zipcode");
		if (zipcode == null) {
			zipcode = "";
		}
		String address = request.getParameter("address");
		if (address == null) {
			address = "";
		}
		String repeat = request.getParameter("repeat");

		System.out.println(id);

		//model
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);

		AccountModel am = new AccountModel(getServletContext());
		account user = new account(Integer.parseInt(id), username, email, password,
				Integer.parseInt(isAdmin),
				zipcode, address);

		if (mode.equals("insert")) {
			if (password.equals(repeat)) {
				SignModel sm = new SignModel(getServletContext());
				account a = sm.checkAccountExist(username);
				if (a == null) {

					sm.signUp(user);

					request.getRequestDispatcher("Login.jsp").forward(request, response);
				} else {
					request.setAttribute("mess2", "Email and Phone is already in use");
					request.setAttribute("account", a);
					request.getRequestDispatcher("SignUp.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("mess1", "password and repeat password are not the same. ");
				request.getRequestDispatcher("SignUp.jsp").forward(request, response);
			}
		} else {
			am.update(user);
			session.setAttribute("a", user);
			response.sendRedirect("ItemListController");
		}
	}

}
