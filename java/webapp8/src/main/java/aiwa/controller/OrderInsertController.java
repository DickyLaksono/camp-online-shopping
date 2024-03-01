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
import aiwa.entity.account;
import aiwa.entity.order;
import aiwa.model.OrderModel;

@WebServlet("/OrderInsertController")
public class OrderInsertController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		account user = (account) session.getAttribute("a");

		if (user == null) {
			response.sendRedirect("Login.jsp");
			return;
		}

		List<Item> cart = (List<Item>) session.getAttribute("cart");
		if (cart == null) {
			cart = new ArrayList<>();
		}

		// Parameter

		// Model
		OrderModel om = new OrderModel(getServletContext());

		for (Item i : cart) {
			order o = new order();
			o.setQuantity(i.getQuantity());
			o.setItem(i);
			o.setUser(user);

			om.insert(o);
		}

		cart.clear();
		session.setAttribute("cart", cart);

		// View
		response.sendRedirect("OrderListController");
	}

}
