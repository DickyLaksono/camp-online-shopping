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

	private String url;

	public ItemModel(ServletContext context) {

		try {
			Class.forName("org.sqlite.JDBC");
			url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/webapp9.db");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public List<Item> findfKeyword(String keyword) {
		List<Item> result = new ArrayList<>();

		try (Connection conn = DriverManager.getConnection(url)) {

			String sql = "select * from items where itemname like ? or detail like ? order by itemid";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + keyword + "%");
			stmt.setString(2, "%" + keyword + "%");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemname(rs.getString("itemname"));
				item.setDetail(rs.getString("Detail"));
				item.setImage(rs.getString("image"));
				item.setPrice(rs.getInt("price"));
				result.add(item);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public Item findById(int itemid) {

		try (Connection conn = DriverManager.getConnection(url)) {

			String sql = "select * from items where itemid = ? ";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, itemid);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemname(rs.getString("itemname"));
				item.setDetail(rs.getString("Detail"));
				item.setImage(rs.getString("image"));
				item.setPrice(rs.getInt("price"));
				return item;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public void insert(Item item) {

		try (Connection conn = DriverManager.getConnection(url)) {

			String url = "insert into items(itemname, detail, image, price) values(?,?,?,?)";

			PreparedStatement stmt = conn.prepareStatement(url);
			stmt.setString(1, item.getItemname());
			stmt.setString(2, item.getDetail());
			stmt.setString(3, item.getImage());
			stmt.setInt(4, item.getPrice());

			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(Item item) {

		try (Connection conn = DriverManager.getConnection(url)) {

			String url = "update items set itemname=?, detail=?, image=?, price=? where itemid=?";

			PreparedStatement stmt = conn.prepareStatement(url);
			stmt.setString(1, item.getItemname());
			stmt.setString(2, item.getDetail());
			stmt.setString(3, item.getImage());
			stmt.setInt(4, item.getPrice());
			stmt.setInt(5, item.getItemId());

			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {

		try (Connection conn = DriverManager.getConnection(url)) {

			String sql = "delete from items where itemid = ?";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			stmt.executeUpdate();

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
