package aiwa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import aiwa.entity.Category;
import aiwa.entity.Item;
import aiwa.entity.account;
import aiwa.model.CategoryModel;
import aiwa.model.ItemModel;

@WebServlet("/ItemCartController")
public class ItemCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Login Check
		HttpSession session = request.getSession();
		account user = (account) session.getAttribute("a");
		if (user == null || user.getIsAdmin() == 1) {
			response.sendRedirect("Login.jsp");
			return;
		}

		//parameter
		String itemId = request.getParameter("itemid");

		String word = request.getParameter("keyword");
		if (word == null) {
			word = "";
		}
		String categoryid = request.getParameter("categoryid");
		if (categoryid == null) {
			categoryid = "0";
		}

		String page = request.getParameter("page");
		if (page == null) {
			page = "0";
		}

		//model
		ItemModel im = new ItemModel(getServletContext());
		Item item = im.findById(Integer.parseInt(itemId));

		//*** jika ada getAttribute harus ada getAttribute, makannya jika dahulukan get maka didalamnya "null" .
		// ** pada get yang pertama ini berisi "null", karena pada awal dijalankan tidak di set
		//** tapi jika yang kedua dan setelahnya sudah ter set di bawah, jadi isi dari cart nya tidak null
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		if (cart == null) {
			cart = new ArrayList<>(); // **  dengan menggunakan new artinya seperti mereset mulai dari nol
		}
		boolean hit = false;

		for (Item i : cart) {
			if (i.getItemId() == Integer.parseInt(itemId)) {
				i.setQuantity(i.getQuantity() + 1);
				hit = true;

			}
		}
		if (!hit) {
			cart.add(item);
		}
		session.setAttribute("cart", cart);

		CategoryModel cm = new CategoryModel(getServletContext());
		List<Category> category = cm.findAll();

		//view
		request.setAttribute("category", category);
		response.sendRedirect("CartListController");

	}

}
