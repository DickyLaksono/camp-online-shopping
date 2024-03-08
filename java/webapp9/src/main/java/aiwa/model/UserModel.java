package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;

import aiwa.entity.user;

public class UserModel {

	private String url;

	public UserModel(ServletContext context) {

		try {
			Class.forName("org.sqlite.JDBC");
			url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/webapp9.db");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public user findByIdAndPassword(String userId, String password) {

		try (Connection conn = DriverManager.getConnection(url)) {

			String sql = "select * from users where userid like ? or password like ? ";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, userId);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				user u = new user();
				u.setUserId(rs.getString("userid"));
				u.setUserName(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				return u;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public user findById(String userId) {

		try (Connection conn = DriverManager.getConnection(url)) {

			String sql = "select * from users where userid like ? or password like ? ";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, userId);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				user u = new user();
				u.setUserId(rs.getString("userid"));
				u.setUserName(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				return u;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public void insert(user u) {

		try (Connection conn = DriverManager.getConnection(url)) {

			String url = "insert into  users values(?,?,?)";

			PreparedStatement stmt = conn.prepareStatement(url);
			stmt.setString(1, u.getUserId());
			stmt.setString(2, u.getUserName());
			stmt.setString(3, u.getPassword());
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
