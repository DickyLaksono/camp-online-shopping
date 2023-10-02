package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import aiwa.entity.Employee;

public class EmployeeModel {

	public List<Employee> findAll() {
		List<Employee> result = new LinkedList<>();

		try {
			String url = "jdbc:sqlite:sample.db";
			Connection conn = DriverManager.getConnection("");
			String sql = "SELECT * from employees order by employeeid ";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Employee e = new Employee();
				e.setEmployeeid(rs.getInt("Employeeid"));
				e.setEmployname(rs.getString("Employeename"));
				e.setEmail(rs.getString("Email"));
				result.add(e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
