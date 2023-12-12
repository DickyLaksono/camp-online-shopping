
package aiwa.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import aiwa.entity.Category;

public class CategoryModel extends BaseModel {

	public CategoryModel(ServletContext context) {
		super(context);

	}

	public List<Category> findAll() {
		List<Category> result = new ArrayList<>();

		try {

			Connection conn = super.connect();

			String sql = "select * from category order by categoryid";

			PreparedStatement stmt = conn.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Category category = new Category();
				category.setCategoryId(rs.getInt("categoryid"));
				category.setCategoryName(rs.getString("categoryname"));
				category.setCategoryImage(rs.getString("categoryimage"));

				result.add(category);
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public Category findCategory(int categoryid) {

		try {

			Connection conn = super.connect();

			String sql = "select * from category where categoryid = ? ";

			PreparedStatement stmt = conn.prepareStatement(sql);

			int index = 1;
			stmt.setInt(index++, categoryid);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Category category = new Category();
				category.setCategoryId(rs.getInt("categoryid"));
				category.setCategoryName(rs.getString("categoryname"));
				category.setCategoryImage(rs.getString("categoryimage"));

				conn.close();
				return category;
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
