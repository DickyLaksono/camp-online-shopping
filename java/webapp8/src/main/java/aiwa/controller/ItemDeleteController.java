package aiwa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.model.ItemModel;

@WebServlet("/ItemDeleteController")
public class ItemDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//parameter
		String itemid = request.getParameter("itemid");

		//model
		ItemModel im = new ItemModel(getServletContext());
		im.delete(Integer.parseInt(itemid));

		//view
		response.sendRedirect("/ItemListController");
	}

}
