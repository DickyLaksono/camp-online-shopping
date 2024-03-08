package aiwa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Item;
import aiwa.model.ItemModel;

@WebServlet("/ItemInsertController")
public class ItemInsertController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String itemname = request.getParameter("itemname");
		String detail = request.getParameter("detail");
		String image = request.getParameter("image");
		String price = request.getParameter("price");

		Item item = new Item();
		item.setItemname(itemname);
		item.setDetail(detail);
		item.setImage(image);
		item.setPrice(Integer.parseInt(price));

		ItemModel im = new ItemModel(getServletContext());
		im.insert(item);

		response.sendRedirect("ItemListController");
	}

}
