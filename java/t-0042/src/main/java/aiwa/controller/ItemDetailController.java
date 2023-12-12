package aiwa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Item;
import aiwa.model.ItemModel;

@WebServlet("/ItemDetailController")
public class ItemDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("itemid");

		ItemModel im = new ItemModel();
		Item item = im.findById(getServletContext(), Integer.parseInt(id));

		request.setAttribute("item", item);
		request.getRequestDispatcher("/ItemDetailView.jsp").forward(request, response);
	}

}
