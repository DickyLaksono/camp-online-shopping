package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Customor;

public class CustomerModel {

	public List<Customor> findALL(ServletContext context) {
		List<Customor> result = new ArrayList<>();

		try {
			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/sample.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select * from customers order by customerid";

			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Customor c = new Customor();
				c.setCustomerId(rs.getInt("customerId"));
				c.setCustomerName(rs.getString("customername"));
				c.setAddress(rs.getString("address"));
				result.add(c);
			}

			conn.close();
		} catch (Exception e) {

		}
		return result;
	}
}
