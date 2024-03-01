
package aiwa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import aiwa.entity.Item;

@WebServlet("/CartRemoveController")
public class CartRemoveController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 0 session
		HttpSession session = request.getSession();

		// Parameter
		String itemId = request.getParameter("itemid");
		String all = request.getParameter("all");

		// Model
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		if (cart == null) {
			cart = new ArrayList<>();
		}

		for (Item c : cart) {
			if (c.getItemId() == Integer.parseInt(itemId)) {

				if (all == null) {
					cart.remove(c);
					break;
				} else {

					c.setQuantity(c.getQuantity() - 1);
					if (c.getQuantity() == 0) {
						cart.remove(c);
						break;
					}
				}
			}
		}

		// View
		response.sendRedirect("CartListController");

	}

}
