package aiwa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Movie;

@WebServlet("/MovieListController")
public class MovieListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter pw = response.getWriter();
		pw.println("<h1>映画リスト</h1>");

		List<Movie> list = getData();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<ittle></ittle>");
		pw.println("<style>");
		pw.println("th{background-color: yellow; color:red; }");
		pw.println("</style>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<table border='1' align='center' cellpadding='100'>");
		pw.println("<tr><th>Id</th><th>Tittle</th><th>Image</th><th>Category</th></tr>");
		for (Movie m : list) {
			pw.println("<tr>");
			pw.println("<td>" + m.getId() + "</td>");
			pw.println("<td>" + m.getTitle() + "</td>");
			pw.println("<td>" + m.getCategory() + "</td>");
			pw.println("<td><img src='" + m.getImage() + "' height='300px'></td>");
			pw.println("</tr>");

		}
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");

	}

	private List<Movie> getData() {
		List<Movie> movies = new ArrayList<>();

		Movie m1 = new Movie();
		m1.setId(1);
		m1.setTitle("The Raid");
		m1.setImage("https://m.media-amazon.com/images/I/91qoSXP7CGL._AC_UL600_FMwebp_QL65_.jpg");
		m1.setCategory("action");
		movies.add(m1);

		Movie m2 = new Movie();
		m2.setId(2);
		m2.setTitle("The Walking Dead");
		m2.setImage("https://m.media-amazon.com/images/I/61mPfURAkgL._AC_UL600_FMwebp_QL65_.jpg");
		m2.setCategory("action");
		movies.add(m2);

		Movie m3 = new Movie();
		m3.setId(3);
		m3.setTitle("Harry Potter");
		m3.setImage("https://m.media-amazon.com/images/I/81HcS1NB4PL._AC_UL600_FMwebp_QL65_.jpg");
		m3.setCategory("Mistery");
		movies.add(m3);

		Movie m4 = new Movie();
		m4.setId(4);
		m4.setTitle("Lord of The Rings");
		m4.setImage("https://m.media-amazon.com/images/I/81BcLvcxcrL._AC_UL600_FMwebp_QL65_.jpg");
		m4.setCategory("Mistery");
		movies.add(m4);

		Movie m5 = new Movie();
		m5.setId(5);
		m5.setTitle("The Avengers");
		m5.setImage("https://m.media-amazon.com/images/I/91Q0cUYL2-L._AC_UL600_FMwebp_QL65_.jpg");
		m5.setCategory("action");
		movies.add(m5);

		return movies;

	}

}
