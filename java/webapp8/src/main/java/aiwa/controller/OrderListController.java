package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import aiwa.entity.Category;
import aiwa.entity.account;
import aiwa.entity.order;
import aiwa.model.CategoryModel;
import aiwa.model.OrderModel;

@WebServlet("/OrderListController")
public class OrderListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Session
		HttpSession session = request.getSession();
		account user = (account) session.getAttribute("a");
		if (user == null) {
			response.sendRedirect("Login.jsp");
			return;
		}

		// Parameter

		// Model
		OrderModel om = new OrderModel(getServletContext());
		List<order> orders = om.findByUserId(user);

		//** ini jika pada jsp nya pada tag java nya null maka harus di set seperti ini, pada controller yang sedang di tuju
		CategoryModel cm = new CategoryModel(getServletContext());
		List<Category> category = cm.findAll();

		// View
		request.setAttribute("category", category);
		request.setAttribute("orders", orders);
		request.getRequestDispatcher("/orderListView.jsp").forward(request, response);
	}

}
