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

	public Item findById(ServletContext context, int id) {

		try {

			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/webapp7.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select "
					+ "* "
					+ "from "
					+ "items i "
					+ "inner join "
					+ "categories c "
					+ "on "
					+ "i.categoryid = c.categoryid "
					+ "where "
					+ "itemid =  ? ";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Item i = new Item();

				i.setItemid(rs.getInt("itemid"));
				i.setItemname(rs.getString("itemname"));
				i.setDetail(rs.getString("detail"));
				i.setPrice(rs.getInt("price"));
				i.setRating(rs.getDouble("rating"));
				i.setImage(rs.getString("image"));
				i.setModel(rs.getString("model"));

				Category c = new Category();

				c.setCategoryid(rs.getInt("categoryid"));
				c.setCategoryname(rs.getString("categoryname"));

				i.setCategory(c);
				conn.close();
				return i;

			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public List<Item> findByCondition(ServletContext context, String word, int categoryId, String min, String max) {

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
					+ "categories c "
					+ "on "
					+ "i.categoryid = c.categoryid "
					+ "where "
					+ "(itemname like ? or detail like ?)  ";

			if (categoryId > 0) {
				sql += "and i.categoryid = ? ";

			}

			if (!min.equals("")) {
				sql += "and i.price >= ? ";
			}

			if (!max.equals("")) {
				sql += "and i.price <= ? ";
			}

			sql += "order by itemid ";

			PreparedStatement stmt = conn.prepareStatement(sql);

			int index = 1;

			stmt.setString(index++, "%" + word + "%");
			stmt.setString(index++, "%" + word + "%");
			if (categoryId > 0) {
				stmt.setInt(index++, categoryId);

			}

			if (!min.equals("")) {
				stmt.setInt(index++, Integer.parseInt(min));

			}

			if (!max.equals("")) {
				stmt.setInt(index++, Integer.parseInt(max));
			}

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item i = new Item();

				i.setItemid(rs.getInt("itemid"));
				i.setItemname(rs.getString("itemname"));
				i.setDetail(rs.getString("detail"));
				i.setPrice(rs.getInt("price"));
				i.setRating(rs.getDouble("rating"));
				i.setImage(rs.getString("image"));
				i.setModel(rs.getString("model"));

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

	public List<Item> findByKeyword(ServletContext context, String word, int categoryId) {

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
					+ "categories c "
					+ "on "
					+ "i.categoryid = c.categoryid "
					+ "where "
					+ "(itemname like ? or detail like ?)  ";

			if (categoryId > 0) {
				sql += "and i.categoryid = ? ";

			}
			sql += "order by itemid ";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + word + "%");
			stmt.setString(2, "%" + word + "%");
			if (categoryId > 0) {
				stmt.setInt(3, categoryId);

			}
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item i = new Item();

				i.setItemid(rs.getInt("itemid"));
				i.setItemname(rs.getString("itemname"));
				i.setDetail(rs.getString("detail"));
				i.setPrice(rs.getInt("price"));
				i.setRating(rs.getDouble("rating"));
				i.setImage(rs.getString("image"));
				i.setModel(rs.getString("model"));

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
					+ "categories c "
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
				i.setPrice(rs.getInt("price"));
				i.setRating(rs.getDouble("rating"));
				i.setImage(rs.getString("image"));
				i.setModel(rs.getString("model"));

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
