package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Category;
import aiwa.entity.Item;
import aiwa.model.CategoryModel;
import aiwa.model.ItemModel;

@WebServlet("/ItemInsertController")
public class ItemInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//parameter

		//model
		CategoryModel cm = new CategoryModel(getServletContext());
		List<Category> category = cm.findAll();

		//view

		request.setAttribute("category", category);
		request.getRequestDispatcher("/ItemInsertView.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//ini untuk penanganan agar saat dimasukkan selain b.inggris
		request.setCharacterEncoding("UTF-8");

		String itemname = (String) request.getParameter("itemname");
		String price = (String) request.getParameter("price");
		String detail = (String) request.getParameter("detail");
		String rating = (String) request.getParameter("rating");
		String image1 = (String) request.getParameter("image1");
		String image2 = (String) request.getParameter("image2");
		String image3 = (String) request.getParameter("image3");
		String image4 = (String) request.getParameter("image4");
		String categoryId = (String) request.getParameter("categoryid");

		//model
		ItemModel im = new ItemModel(getServletContext());
		Item item = new Item();
		item.setItemName(itemname);
		item.setPrice(Integer.parseInt(price));
		item.setDetail(detail);
		item.setRating(Integer.parseInt(rating));
		item.setImage1(image1);
		item.setImage2(image2);
		item.setImage3(image3);
		item.setImage4(image4);
		Category category = new Category();
		category.setCategoryId(Integer.parseInt(categoryId));
		item.setCategory(category);

		im.insert(item);

		//view
		response.sendRedirect("ItemAllController");

	}

}
