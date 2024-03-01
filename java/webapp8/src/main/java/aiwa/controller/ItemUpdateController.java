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

@WebServlet("/ItemUpdateController")
public class ItemUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//parameter
		String itemid = request.getParameter("itemid");

		//model
		ItemModel im = new ItemModel(getServletContext());
		Item item = im.findById(Integer.parseInt(itemid));

		CategoryModel cm = new CategoryModel(getServletContext());
		List<Category> c = cm.findAll();

		//view
		request.setAttribute("item", item);
		request.setAttribute("category", c);
		request.getRequestDispatcher("/ItemUpdateView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//ini untuk penanganan agar saat dimasukkan selain b.inggris
		request.setCharacterEncoding("UTF-8");

		//parameter
		String itemid = (String) request.getParameter("itemid");
		if (itemid == null) {
			itemid = "0";

		}
		String itemname = (String) request.getParameter("itemname");
		String price = (String) request.getParameter("price");
		String detail = (String) request.getParameter("detail");
		String rating = (String) request.getParameter("rating");
		String image1 = (String) request.getParameter("image1");
		String image2 = (String) request.getParameter("image2");
		String image3 = (String) request.getParameter("image3");
		String image4 = (String) request.getParameter("image4");
		String categoryId = (String) request.getParameter("categoryid");
		if (categoryId == null) {
			categoryId = "0";
		}

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
		item.setItemId(Integer.parseInt(itemid));
		Category category = new Category();
		category.setCategoryId(Integer.parseInt(categoryId));
		item.setCategory(category);

		im.update(item);

		//view
		response.sendRedirect("ItemListController");

	}

}
