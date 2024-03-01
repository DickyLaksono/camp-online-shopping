package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import aiwa.entity.Item;

@WebServlet("/AllRemoveController")
public class AllRemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 0 session
		HttpSession session = request.getSession();

		// Parameter
		String itemId = request.getParameter("itemid");

		// Model
		List<Item> cart = (List<Item>) session.getAttribute("cart");

		for (Item c : cart) {
			if (c.getItemId() == Integer.parseInt(itemId)) {
				cart.remove(c);
				break;
			}
		}

		// View
		response.sendRedirect("CartListController");
	}

}
