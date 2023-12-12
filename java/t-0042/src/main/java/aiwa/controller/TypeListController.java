package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Category;
import aiwa.entity.Type;
import aiwa.model.CategoryModel;
import aiwa.model.TypeModel;

@WebServlet("/TypeListController")
public class TypeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//parameter
		String word = request.getParameter("keyword");
		if (word == null) {
			word = "";
		}

		String categoryId = request.getParameter("categoryid");
		if (categoryId == null) {
			categoryId = "0";
		}

		//model
		TypeModel tm = new TypeModel();
		List<Type> type = tm.findByKeyword(getServletContext(), word, Integer.parseInt(categoryId));

		CategoryModel cm = new CategoryModel();
		List<Category> categories = cm.findAll(getServletContext());

		//view
		request.setAttribute("type", type);
		request.setAttribute("word", word);
		request.setAttribute("categories", categories);

		request.getRequestDispatcher("/ItemTypeView.jsp").forward(request, response);

	}

}
