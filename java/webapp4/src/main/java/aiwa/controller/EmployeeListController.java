package aiwa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Employee;
import aiwa.model.EmployeeModel;

@WebServlet("/EmployeeListController")
public class EmployeeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmployeeModel em = new EmployeeModel();
		List<Employee> employees = em.findALL(getServletContext());

		request.setAttribute("employees", employees);

		request.getRequestDispatcher("/employeeListView.jsp").forward(request, response);
	}

}
