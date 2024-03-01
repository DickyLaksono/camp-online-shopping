package aiwa.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Category;
import aiwa.entity.Item;
import aiwa.entity.account;
import aiwa.entity.order;

public class OrderModel extends BaseModel {

	public OrderModel(ServletContext context) {
		super(context);
	}

	public List<order> findByUserId(account user) {
		List<order> result = new ArrayList<>();
		try (Connection conn = super.connect()) {

			String sql = "select * "
					+ " from orders o "
					+ " inner join items i on o.itemid = i.itemid "
					+ " inner join category c on i.categoryid = c.categoryid "
					+ " inner join account a on o.userid = a.id  ";

			if (user.getIsAdmin() == 0) {
				sql += "where o.userid = ? ";
			}

			sql += "  order by orderdate, orderid  ";

			PreparedStatement stmt = conn.prepareStatement(sql);
			if (user.getIsAdmin() == 0) {
				stmt.setInt(1, user.getId());
			}

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				order o = new order();
				o.setOrderId(rs.getInt("orderid"));
				o.setOrderDate(rs.getString("orderdate"));
				o.setQuantity(rs.getInt("quantity"));

				Item i = new Item();

				i.setItemId(rs.getInt("itemid"));
				i.setItemName(rs.getString("itemname"));
				i.setPrice(rs.getInt("price"));
				i.setDiscount(rs.getInt("discount"));
				i.setRating(rs.getInt("rating"));
				i.setDetail(rs.getString("detail"));
				i.setImage1(rs.getString("image1"));
				i.setImage2(rs.getString("image2"));
				i.setImage3(rs.getString("image3"));
				i.setImage4(rs.getString("image4"));
				i.setReviews(rs.getInt("reviews"));
				i.setRecommendation(rs.getInt("recommendation"));

				Category c = new Category();

				c.setCategoryId(rs.getInt("categoryid"));
				c.setCategoryName(rs.getString("categoryname"));

				i.setCategory(c);

				account a = new account(rs.getInt("id"), rs.getString("username"), rs.getString("email"),
						rs.getString("password"), rs.getInt("isAdmin"), rs.getString("zipcode"),
						rs.getString("address"));

				o.setItem(i);

				o.setUser(a);

				result.add(o);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void insert(order o) {

		try (Connection conn = super.connect()) {
			String sql = "insert into orders(orderdate, quantity, itemid, userid) values(date('now'),?,?,?)";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, o.getQuantity());
			stmt.setInt(2, o.getItem().getItemId());
			stmt.setLong(3, o.getUser().getId());

			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
