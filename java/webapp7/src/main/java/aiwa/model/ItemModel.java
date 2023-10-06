package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Category;
import aiwa.entity.Item;

public class ItemModel {

	public List<Item> FindAll(ServletContext context) {

		List<Item> result = new ArrayList<>();

		try {

			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/webapp7.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select "
					+ "* "
					+ "from "
					+ "items i "
					+ "inner join "
					+ "cagories c "
					+ "on "
					+ "i.categoryid = c.categoryid "
					+ "order by itemid ";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item i = new Item();

				i.setItemid(rs.getInt("itemid"));
				i.setItemname(rs.getString("itemname"));
				i.setDetail(rs.getString("detail"));
				i.setRating(rs.getDouble("rating"));
				i.setImage(rs.getString("image"));

				Category c = new Category();

				c.setCategoryid(rs.getInt("categoryid"));
				c.setCategoryname(rs.getString("categoryname"));

				i.setCategory(c);

				result.add(i);
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}
}
