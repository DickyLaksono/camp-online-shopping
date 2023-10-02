package aiwa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Item;

@WebServlet("/ItemListController")
public class ItemListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = "m";
		int age = 44;

		request.setAttribute("n", name);
		request.setAttribute("a", age);

		RequestDispatcher rd = request.getRequestDispatcher("/itemListView.jsp");
		rd.forward(request, response);
	}

	private List<Item> getData() {
		List<Item> items = new ArrayList<>();
		Item item1 = new Item();
		item1.setId(1);
		item1.setName("r");
		item1.setPrice(110);
		items.add(item1);

		return items;
	}

}
