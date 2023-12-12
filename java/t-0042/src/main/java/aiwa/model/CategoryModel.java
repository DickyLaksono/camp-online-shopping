package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Category;

public class CategoryModel {

	public List<Category> findAll(ServletContext context) {

		List<Category> result = new ArrayList<>();

		try {

			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/Grup_Work.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select * from categories order by categoryid";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Category c = new Category();
				c.setCategoryid(rs.getInt("categoryid"));
				c.setCategoryname(rs.getString("categoryname"));
				result.add(c);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

}
