package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Employee;

public class EmployeeModel {

	public List<Employee> findALL(ServletContext context) {
		List<Employee> result = new ArrayList<>();

		try {
			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/sample.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select * from employees order by employeeid";

			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Employee e = new Employee();
				e.setEmployeId(rs.getInt("employeeId"));
				e.setEmployeeName(rs.getString("employeeName"));
				e.setEmail(rs.getString("email"));
				result.add(e);
			}

			conn.close();
		} catch (Exception e) {

		}
		return result;
	}
}
