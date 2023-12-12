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

@WebServlet("/ItemDetailController")
public class ItemDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//parameter
		String id = request.getParameter("itemid");

		//model
		ItemModel im = new ItemModel(getServletContext());
		Item item = im.findById(getServletContext(), Integer.parseInt(id));

		List<Item> items = im.findAll();
		List<Item> featured = im.featured();
		List<Item> recent = im.recent();
		List<Item> recommendation = im.recommendation();

		CategoryModel cm = new CategoryModel(getServletContext());
		List<Category> category = cm.findAll();

		//view
		request.setAttribute("item", item);

		request.setAttribute("category", category);
		request.setAttribute("items", items);
		request.setAttribute("featured", featured);
		request.setAttribute("recent", recent);
		request.setAttribute("recommendation", recommendation);
		request.getRequestDispatcher("/ItemDetailView.jsp").forward(request, response);
	}

}
