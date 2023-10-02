package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Product;
import aiwa.model.ProductModel;

@WebServlet("/ProductListController")
public class ProductListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductModel pm = new ProductModel();
		List<Product> products = pm.findAll(getServletContext());

		request.setAttribute("products", products);

		request.getRequestDispatcher("/productListView.jsp").forward(request, response);
	}
}
