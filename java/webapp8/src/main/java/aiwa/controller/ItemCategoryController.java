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

@WebServlet("/ItemCategoryController")
public class ItemCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//parameter
		String categoryid = request.getParameter("categoryid");
		//String cn = request.getParameter("categoryname");

		String page = request.getParameter("page");
		if (page == null) {
			page = "0";
		}

		//model
		ItemModel im = new ItemModel(getServletContext());
		List<Item> type = im.findCondition("", Integer.parseInt(categoryid), Integer.parseInt(page));
		//int count = im.Page("", Integer.parseInt(categoryid));

		List<Item> items = im.findAll();
		List<Item> featured = im.featured();
		List<Item> recent = im.recent();

		CategoryModel cm = new CategoryModel(getServletContext());
		List<Category> category = cm.findAll();
		Category categoryname = cm.findCategory(Integer.parseInt(categoryid));

		//view

		request.setAttribute("category", category);
		request.setAttribute("type", type);
		request.setAttribute("categoryname", categoryname);
		request.setAttribute("page", Integer.parseInt(page));
		//request.setAttribute("count", count);

		request.setAttribute("items", items);
		request.setAttribute("featured", featured);
		request.setAttribute("recent", recent);
		request.getRequestDispatcher("/Category.jsp").forward(request, response);
	}

}
