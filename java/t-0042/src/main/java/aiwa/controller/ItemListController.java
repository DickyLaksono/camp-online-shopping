package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Category;
import aiwa.entity.Item;
import aiwa.model.CategoryModel;
import aiwa.model.ItemModel;

@WebServlet("/ItemListController")
public class ItemListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//parameter
		String word = request.getParameter("keyword");
		if (word == null) {
			word = "";
		}

		String categoryId = request.getParameter("categoryid");
		if (categoryId == null) {
			categoryId = "0";
		}

		//model
		ItemModel im = new ItemModel();
		List<Item> items = im.findByKeyword(getServletContext(), word, Integer.parseInt(categoryId));

		CategoryModel cm = new CategoryModel();
		List<Category> categories = cm.findAll(getServletContext());

		//view
		request.setAttribute("items", items);
		request.setAttribute("word", word);
		request.setAttribute("categories", categories);

		request.getRequestDispatcher("/ItemListView.jsp").forward(request, response);
	}

}
