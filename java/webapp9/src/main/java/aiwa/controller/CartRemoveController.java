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
import aiwa.entity.user;

@WebServlet("/CartRemoveController")
public class CartRemoveController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Sssion
		HttpSession session = request.getSession();
		user u = (user) session.getAttribute("loginuser");
		if (u == null) {
			response.sendRedirect("Login.jsp");
			return;
		}

		//Parameter
		String itemId = request.getParameter("itemid");

		//Model

		List<Item> cart = (List<Item>) session.getAttribute("cart");
		if (cart == null) {
			cart = new ArrayList<>();
		}
		for (Item i : cart) {
			if (i.getItemId() == Integer.parseInt(itemId)) {
				i.setAmount(i.getAmount() - 1);
				if (i.getAmount() == 0) {
					cart.remove(i);
					break;
				}
			}
		}

		session.setAttribute("cart", cart);

		//View
		response.sendRedirect("CartListController");

	}

}
