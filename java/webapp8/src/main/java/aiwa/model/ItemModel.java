package aiwa.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Category;
import aiwa.entity.Item;

public class ItemModel extends BaseModel {

	public ItemModel(ServletContext context) {
		super(context);

	}

	public void insert(Item item) {

		try {

			Connection conn = super.connect();
			String sql = "insert into "
					+ " items "
					+ " (itemname, price, detail, rating, image1, image2, image3, image4, categoryid) "
					+ " values (?,?,?,?,?,?,?,?,?)";

			PreparedStatement stmt = conn.prepareStatement(sql);
			int index = 1;
			stmt.setString(index++, item.getItemName());
			stmt.setInt(index++, item.getPrice());
			stmt.setString(index++, item.getDetail());
			stmt.setInt(index++, item.getRating());
			stmt.setString(index++, item.getImage1());
			stmt.setString(index++, item.getImage2());
			stmt.setString(index++, item.getImage3());
			stmt.setString(index++, item.getImage4());
			stmt.setInt(index++, item.getCategory().getCategoryId());

			stmt.executeUpdate();

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Item findById(int itemId) {

		try {

			Connection conn = super.connect();

			String sql = "select * from items i inner join category c on i.categoryid = c.categoryid where itemid = ? ";

			PreparedStatement stmt = conn.prepareStatement(sql);
			int index = 1;
			stmt.setInt(index++, itemId);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemName(rs.getString("itemname"));
				item.setPrice(rs.getInt("price"));
				item.setRating(rs.getInt("rating"));
				item.setImage1(rs.getString("image1"));
				item.setImage2(rs.getString("image2"));
				item.setImage3(rs.getString("image3"));
				item.setImage4(rs.getString("image4"));
				item.setFeatured(rs.getInt("featured"));
				item.setRecent(rs.getInt("recent"));
				item.setRecommendation(rs.getInt("recommendation"));
				item.setReviews(rs.getInt("reviews"));

				Category category = new Category();
				category.setCategoryId(rs.getInt("categoryid"));
				category.setCategoryName(rs.getString("categoryname"));

				conn.close();
				return item;

			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Item> findCondition(String word, int categoryId) {
		List<Item> result = new ArrayList<>();

		try {

			Connection conn = super.connect();

			String sql = "select * from items i inner join category c on i.categoryid = c.categoryid where (itemname like ? or detail like ?) ";
			if (categoryId > 0) {
				sql += "and i.categoryid = ? ";
			}
			sql += " order by itemid";

			PreparedStatement stmt = conn.prepareStatement(sql);
			int index = 1;
			stmt.setString(index++, "%" + word + "%");
			stmt.setString(index++, "%" + word + "%");
			if (categoryId > 0) {
				stmt.setInt(index++, categoryId);
			}

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemName(rs.getString("itemname"));
				item.setPrice(rs.getInt("price"));
				item.setRating(rs.getInt("rating"));
				item.setImage1(rs.getString("image1"));
				item.setImage2(rs.getString("image2"));
				item.setImage3(rs.getString("image3"));
				item.setImage4(rs.getString("image4"));
				item.setFeatured(rs.getInt("featured"));
				item.setRecent(rs.getInt("recent"));
				item.setRecommendation(rs.getInt("recommendation"));
				item.setReviews(rs.getInt("reviews"));

				Category category = new Category();
				category.setCategoryId(rs.getInt("categoryid"));
				category.setCategoryName(rs.getString("categoryname"));

				result.add(item);

			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<Item> findAll() {
		List<Item> result = new ArrayList<>();

		try {

			Connection conn = super.connect();

			String sql = "select * from items i inner join category c on i.categoryid = c.categoryid order by itemid";

			PreparedStatement stmt = conn.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemName(rs.getString("itemname"));
				item.setPrice(rs.getInt("price"));
				item.setRating(rs.getInt("rating"));
				item.setImage1(rs.getString("image1"));
				item.setImage2(rs.getString("image2"));
				item.setImage3(rs.getString("image3"));
				item.setImage4(rs.getString("image4"));
				item.setFeatured(rs.getInt("featured"));
				item.setRecent(rs.getInt("recent"));
				item.setRecommendation(rs.getInt("recommendation"));
				item.setReviews(rs.getInt("reviews"));

				Category category = new Category();
				category.setCategoryId(rs.getInt("categoryid"));
				category.setCategoryName(rs.getString("categoryname"));

				result.add(item);

			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<Item> featured() {
		List<Item> result = new ArrayList<>();

		try {

			Connection conn = super.connect();

			String sql = "select * from items where featured = 1";

			PreparedStatement stmt = conn.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemName(rs.getString("itemname"));
				item.setPrice(rs.getInt("price"));
				item.setRating(rs.getInt("rating"));
				item.setImage1(rs.getString("image1"));
				item.setImage2(rs.getString("image2"));
				item.setImage3(rs.getString("image3"));
				item.setImage4(rs.getString("image4"));
				item.setFeatured(rs.getInt("featured"));
				item.setRecent(rs.getInt("recent"));
				item.setRecommendation(rs.getInt("recommendation"));
				item.setReviews(rs.getInt("reviews"));

				//				Category category = new Category();
				//				category.setCategoryId(rs.getInt("categoryid"));
				//				category.setCategoryName(rs.getString("categoryname"));

				result.add(item);

			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<Item> recent() {
		List<Item> result = new ArrayList<>();

		try {

			Connection conn = super.connect();

			String sql = "select * from items where recent = 1";

			PreparedStatement stmt = conn.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemName(rs.getString("itemname"));
				item.setPrice(rs.getInt("price"));
				item.setRating(rs.getInt("rating"));
				item.setImage1(rs.getString("image1"));
				item.setImage2(rs.getString("image2"));
				item.setImage3(rs.getString("image3"));
				item.setImage4(rs.getString("image4"));
				item.setFeatured(rs.getInt("featured"));
				item.setRecent(rs.getInt("recent"));
				item.setRecommendation(rs.getInt("recommendation"));
				item.setReviews(rs.getInt("reviews"));

				//				Category category = new Category();
				//				category.setCategoryId(rs.getInt("categoryid"));
				//				category.setCategoryName(rs.getString("categoryname"));

				result.add(item);

			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<Item> recommendation() {
		List<Item> result = new ArrayList<>();

		try {

			Connection conn = super.connect();

			String sql = "select * from items where recommendation = 1";

			PreparedStatement stmt = conn.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Item item = new Item();
				item.setItemId(rs.getInt("itemid"));
				item.setItemName(rs.getString("itemname"));
				item.setPrice(rs.getInt("price"));
				item.setRating(rs.getInt("rating"));
				item.setImage1(rs.getString("image1"));
				item.setImage2(rs.getString("image2"));
				item.setImage3(rs.getString("image3"));
				item.setImage4(rs.getString("image4"));
				item.setFeatured(rs.getInt("featured"));
				item.setRecent(rs.getInt("recent"));
				item.setRecommendation(rs.getInt("recommendation"));
				item.setReviews(rs.getInt("reviews"));

				//				Category category = new Category();
				//				category.setCategoryId(rs.getInt("categoryid"));
				//				category.setCategoryName(rs.getString("categoryname"));

				result.add(item);

			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public Item findById(ServletContext context, int id) {

		try {

			Connection conn = super.connect();

			String sql = "select "
					+ "* "
					+ "from "
					+ "items i "
					+ "inner join "
					+ "category c "
					+ "on "
					+ "i.categoryid = c.categoryid "
					+ "where "
					+ "itemid =  ? ";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {

				Item i = new Item();

				i.setItemId(rs.getInt("itemid"));
				i.setItemName(rs.getString("itemname"));
				i.setPrice(rs.getInt("price"));
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

				return i;

			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

}
