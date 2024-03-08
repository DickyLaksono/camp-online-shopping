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
import aiwa.entity.Order;
import aiwa.entity.user;
import aiwa.model.OrderModel;

@WebServlet("/OrderInsertController")
public class OrderInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		user u = (user) session.getAttribute("loginuser");
		if (u == null) {
			response.sendRedirect("Login.jsp");
			return;
		}

		OrderModel om = new OrderModel(getServletContext());

		List<Item> cart = (List<Item>) session.getAttribute("cart");
		if (cart == null) {
			cart = new ArrayList<>();
		}

		for (Item i : cart) {
			Order o = new Order();
			o.setAmount(i.getAmount());
			o.setItem(i);
			o.setUser(u);

			om.insert(o);
		}

		cart.clear();
		session.setAttribute("cart", cart);

		response.sendRedirect("OrderListController");
	}

}
