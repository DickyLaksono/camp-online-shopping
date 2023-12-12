package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import aiwa.entity.Category;
import aiwa.entity.Item;
import aiwa.entity.account;
import aiwa.model.AccountModel;
import aiwa.model.CategoryModel;
import aiwa.model.ItemModel;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println(name);
		System.out.println(pass);
		//parameter
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String word = request.getParameter("keyword");
		if (word == null) {
			word = "";
		}

		String categoryid = request.getParameter("categoryid");
		if (categoryid == null) {
			categoryid = "0";
		}

		//model
		AccountModel am = new AccountModel(getServletContext());
		account a = am.logIn(username, password);

		ItemModel im = new ItemModel(getServletContext());
		List<Item> items = im.findCondition(word, Integer.parseInt(categoryid));
		//List<Item> items = im.findAll();
		List<Item> featured = im.featured();
		List<Item> recent = im.recent();

		CategoryModel cm = new CategoryModel(getServletContext());
		List<Category> category = cm.findAll();

		//view

		if (a == null) {
			request.setAttribute("mess", "Wrong Password or Email");
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		} else {

			request.setAttribute("word", word);
			request.setAttribute("categoryid", categoryid);

			request.setAttribute("category", category);
			request.setAttribute("items", items);
			request.setAttribute("featured", featured);
			request.setAttribute("recent", recent);

			HttpSession session = request.getSession();
			session.setAttribute("username", username);

			request.getRequestDispatcher("/ItemListView.jsp").forward(request, response);

		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/Login.jsp").forward(request, response);

	}

}
