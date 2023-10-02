package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import aiwa.entity.Product;

public class ProductModel {

	public ArrayList<Product> findAll() {
		ArrayList<Product> result = new ArrayList<>();

		try {

			Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
			String sql = "select * from products order by productid";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Product p = new Product();
				p.setProductId(rs.getInt("productId"));
				p.setProductName(rs.getString("productName"));
				p.setPrice(rs.getInt("price"));
				result.add(p);

			}
			conn.close();//untuk memberikan limit akses ke database

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public ArrayList<Product> findByName(String keyword) {
		ArrayList<Product> result = new ArrayList<>();

		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
			String sql = "select * from products where productname like ?";
			PreparedStatement stmt = conn.prepareStatement(sql);

			stmt.setString(1, "%" + keyword + "%");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Product p = new Product();
				p.setProductId(rs.getInt("productId"));
				p.setProductName(rs.getString("productName"));
				p.setPrice(rs.getInt("price"));
				result.add(p);

			}
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return result;
	}

	public Product findByiD(int id) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
			String sql = "select * from products where productid = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);

			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {

				Product p = new Product();
				p.setProductId(rs.getInt("productId"));
				p.setProductName(rs.getString("productName"));
				p.setPrice(rs.getInt("price"));
				return p;

			}
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}
}
