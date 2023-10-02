package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Customor;
import aiwa.model.CustomerModel;

@WebServlet("/CustomerListController")
public class CustomerListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CustomerModel cm = new CustomerModel();
		List<Customor> customers = cm.findALL(getServletContext());

		request.setAttribute("customers", customers);

		request.getRequestDispatcher("/customerListView.jsp").forward(request, response);
	}

}
