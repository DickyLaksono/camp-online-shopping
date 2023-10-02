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

import aiwa.entity.Student;

@WebServlet("/Test3Controller")
public class Test3Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");//ini diperlukan untuk bisa menggunakan html

		PrintWriter pw = response.getWriter();

		pw.println("<style>");
		pw.println("th{background-color: yellow; color:white }");
		pw.println("</style>");
		pw.println("<h1>学生リスト</h1>");

		List<Student> list = getData();

		pw.println("<table border=1;>");
		pw.println("<tr><th>ID</th><th>name</th><th>birthday</th><th>country</th></tr>");
		for (Student s : list) {
			pw.print("<tr>");
			pw.print("<td>" + s.getId() + "</td>");
			pw.print("<td>" + s.getName() + "</td>");
			pw.print("<td>" + s.getBirthday() + "</td>");
			pw.print("<td>" + s.getCountry() + "</td>");
			pw.print("</tr>");

		}
		pw.print("</teble>");
	}

	private List<Student> getData() {
		List<Student> students = new ArrayList<>();
		int[] ids = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] names = { "ユッセフ", "ディッキー", "ダット", "トゥイ", "ハウ", "ウー", "ヤリン", "てッと", "ハン", "リン" };
		String[] countries = { "エジプト", "インドネシア", "ベトナム", "ベトナム", "ベトナム", "ミャンマー", "中国", "ミャンマー", "ベトナム", "ミャンマー" };

		for (int i = 0; i < 10; i++) {
			Student s = new Student();
			s.setId(ids[i]);
			s.setName(names[i]);
			s.setBirthday("2000/11/28");
			s.setCountry(countries[i]);
			students.add(s);
		}
		return students;
	}

}
