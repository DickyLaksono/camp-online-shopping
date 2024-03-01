package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Category;
import aiwa.model.CategoryModel;

@WebServlet("/CartListController")
public class CartListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CategoryModel cm = new CategoryModel(getServletContext());
		List<Category> category = cm.findAll();

		//view

		request.setAttribute("category", category);

		request.getRequestDispatcher("/cart.jsp").forward(request, response);
	}

}
