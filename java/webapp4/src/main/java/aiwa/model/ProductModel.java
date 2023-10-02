package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Product;

public class ProductModel {

	public List<Product> findAll(ServletContext context) {
		List<Product> result = new ArrayList<>();

		try {

			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/sample.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select * from products order by productid";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Product p = new Product();
				p.setProductId(rs.getInt("productId"));
				p.setProductName(rs.getString("productName"));
				p.setPrice(rs.getInt("price"));
				result.add(p);
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
