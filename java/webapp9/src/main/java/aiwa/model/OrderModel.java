package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Item;
import aiwa.entity.Order;
import aiwa.entity.user;

public class OrderModel {

	private String url;

	public OrderModel(ServletContext context) {

		try {
			Class.forName("org.sqlite.JDBC");
			url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/webapp9.db");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public List<Order> findByUser(user userId) {

		List<Order> result = new ArrayList<>();

		try (Connection conn = DriverManager.getConnection(url)) {
			String sql = "select * from orders o INNER join items i on o.itemid = i.itemid inner join users u on o.userid = u.userid "
					+ "where u.userid = ? "
					+ " order by orderid";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, userId.getUserId());
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Order order = new Order();
				order.setOrderId(rs.getInt("itemid"));
				order.setOrderDate(rs.getString("orderdate"));
				order.setAmount(rs.getInt("amount"));

				Item item = new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemname(rs.getString("itemname"));
				item.setDetail(rs.getString("detail"));
				item.setImage(rs.getString("image"));
				item.setPrice(rs.getInt("price"));

				order.setItem(item);

				user u = new user();
				u.setUserId(rs.getString("userid"));
				u.setUserName(rs.getString("username"));
				u.setPassword(rs.getString("password"));

				order.setUser(u);

				result.add(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public void insert(Order order) {

		try (Connection conn = DriverManager.getConnection(url)) {

			String sql = "INSERT INTO orders (orderdate, itemid, userid, amount) VALUES (date('now'),?,?,? );";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, order.getItem().getItemId());
			stmt.setString(2, order.getUser().getUserId());
			stmt.setInt(3, order.getAmount());

			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
