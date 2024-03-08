package aiwa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Item;
import aiwa.model.ItemModel;

@WebServlet("/ItemUpdateController")
public class ItemUpdateController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String itemId = request.getParameter("itemid");

		ItemModel im = new ItemModel(getServletContext());
		Item item = im.findById(Integer.parseInt(itemId));

		request.setAttribute("item", item);
		request.getRequestDispatcher("/ItemUpdateView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String itemId = request.getParameter("itemid");
		if (itemId == null) {
			itemId = "";
		}
		String itemname = request.getParameter("itemname");
		String detail = request.getParameter("detail");
		String image = request.getParameter("image");
		String price = request.getParameter("price");

		Item item = new Item();
		item.setItemname(itemname);
		item.setDetail(detail);
		item.setImage(image);
		item.setPrice(Integer.parseInt(price));
		item.setItemId(Integer.parseInt(itemId));

		ItemModel im = new ItemModel(getServletContext());
		im.update(item);

		response.sendRedirect("ItemListController");
	}

}
