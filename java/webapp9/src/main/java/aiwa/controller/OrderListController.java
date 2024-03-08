package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import aiwa.entity.Order;
import aiwa.entity.user;
import aiwa.model.OrderModel;

@WebServlet("/OrderListController")
public class OrderListController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		user u = (user) session.getAttribute("loginuser");
		if (u == null) {
			response.sendRedirect("Login.jsp");
		}

		OrderModel om = new OrderModel(getServletContext());
		List<Order> orders = om.findByUser(u);

		request.setAttribute("orders", orders);
		request.getRequestDispatcher("/OrderListView.jsp").forward(request, response);
	}

}
