package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Item;

public class ItemModel {

	public List<Item> findByKeyword(ServletContext context, String word) {
		List<Item> result = new ArrayList<>();

		try {
			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/item.db");

			Connection conn = DriverManager.getConnection(url);

			String sql = "select * from items where itemname like ? order by itemid";

			PreparedStatement stmt = conn.prepareStatement(sql);

			stmt.setString(1, "%" + word + "%");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();

				item.setItemId(rs.getInt("itemid"));
				item.setItemName(rs.getString("itemname"));
				item.setPrice(rs.getInt("price"));
				item.setImage(rs.getString("image"));

				result.add(item);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	public List<Item> findALL(ServletContext context) {
		List<Item> result = new ArrayList<>();

		try {
			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/item.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select * from items order by itemid";

			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();

				item.setItemId(rs.getInt("itemid"));
				item.setItemName(rs.getString("itemname"));
				item.setPrice(rs.getInt("price"));
				item.setImage(rs.getString("image"));

				result.add(item);
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

}
