package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Category;
import aiwa.entity.Type;

public class TypeModel {

	public List<Type> FindAll(ServletContext context) {

		List<Type> result = new ArrayList<>();

		try {

			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/Grup_Work.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select "
					+ "* "
					+ "from "
					+ "animal i "
					+ "inner join "
					+ "categories c "
					+ "on "
					+ "i.categoryid = c.categoryid "
					+ "order by itemid ";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Type i = new Type();

				i.setItemid(rs.getInt("itemid"));
				i.setName(rs.getString("name"));
				i.setDetail(rs.getString("detail"));
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

	public List<Type> findByKeyword(ServletContext context, String word, int categoryId) {

		List<Type> result = new ArrayList<>();

		try {

			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/Grup_Work.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select "
					+ "* "
					+ "from "
					+ "animal i "
					+ "inner join "
					+ "categories c "
					+ "on "
					+ "i.categoryid = c.categoryid "
					+ "where "
					+ "(name like ? or detail like ?)  ";

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
				Type i = new Type();

				i.setItemid(rs.getInt("itemid"));
				i.setName(rs.getString("name"));
				i.setDetail(rs.getString("detail"));
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

	public Type findById(ServletContext context, int id) {

		try {

			Class.forName("org.sqlite.JDBC");

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/Grup_Work.db");
			Connection conn = DriverManager.getConnection(url);

			String sql = "select "
					+ "* "
					+ "from "
					+ "animal i "
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
				Type i = new Type();

				i.setItemid(rs.getInt("itemid"));
				i.setName(rs.getString("name"));
				i.setDetail(rs.getString("detail"));
				i.setImage(rs.getString("image"));

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

}
