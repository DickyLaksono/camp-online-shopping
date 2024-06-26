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
import aiwa.model.CategoryModel;
import aiwa.model.ItemModel;

@WebServlet("/ItemListController")
public class ItemListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//		HttpSession session = request.getSession();
		//		if (session.getAttribute("username") == null) {
		//			response.sendRedirect("/login.jsp");
		//			return;
		//
		//		}
		HttpSession session = request.getSession();

		//parameter
		String word = request.getParameter("keyword");
		if (word == null) {
			word = "";
		}
		String categoryid = request.getParameter("categoryid");
		if (categoryid == null) {
			categoryid = "0";
		}

		String page = request.getParameter("page");
		if (page == null) {
			page = "0";
		}

		//model
		ItemModel im = new ItemModel(getServletContext());
		List<Item> items = im.findCondition(word, Integer.parseInt(categoryid), Integer.parseInt(page));
		//int count = im.Page(word, Integer.parseInt(categoryid));
		//List<Item> items = im.findAll();
		List<Item> featured = im.featured();
		List<Item> recent = im.recent();

		CategoryModel cm = new CategoryModel(getServletContext());
		List<Category> category = cm.findAll();

		List<Item> cart = (List<Item>) session.getAttribute("cart");

		request.setAttribute("word", word);
		request.setAttribute("categoryid", categoryid);
		request.setAttribute("page", Integer.parseInt(page));
		//request.setAttribute("count", count);

		request.setAttribute("category", category);
		request.setAttribute("items", items);
		request.setAttribute("featured", featured);
		request.setAttribute("recent", recent);

		session.setAttribute("cart", cart);

		request.getRequestDispatcher("/ItemListView.jsp").forward(request, response);
	}

}
