package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Item;
import aiwa.model.ItemModel;

@WebServlet("/ItemListController")
public class ItemListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//1. parameter
		String word = request.getParameter("keyword");
		if (word == null) {
			word = "";
		}

		//2. model
		ItemModel im = new ItemModel();
		List<Item> items = im.findByKeyword(getServletContext(), word);

		//3. view
		request.setAttribute("items", items);
		request.setAttribute("word", word);
		request.getRequestDispatcher("/itemListView3.jsp").forward(request, response);

	}

}
