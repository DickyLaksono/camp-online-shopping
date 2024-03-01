package aiwa.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;

import aiwa.entity.account;

public class AccountModel extends BaseModel {

	public AccountModel(ServletContext context) {
		super(context);

	}

	public account logIn(String username, String password) {
		try {
			Connection conn = super.connect();

			String sql = "select * from account where username = ? AND password = ? ";

			PreparedStatement stmt = conn.prepareStatement(sql);
			int index = 1;

			stmt.setString(index++, username);
			stmt.setString(index++, password);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				account a = new account(rs.getInt("id"), rs.getString("username"), rs.getString("email"),
						rs.getString("password"), rs.getInt("isAdmin"), rs.getString("zipcode"),
						rs.getString("address"));
				conn.close();
				return a;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public void update(account a) {
		try (Connection conn = super.connect()) {

			String sql = "update account set username = ?, password = ?, email = ?, isAdmin = ?, zipcode = ?, address = ? where id = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);

			stmt.setString(1, a.getUser());
			stmt.setString(2, a.getPassword());
			stmt.setString(3, a.getEmail());
			stmt.setInt(4, a.getIsAdmin());
			stmt.setString(5, a.getZipcode());
			stmt.setString(6, a.getAddress());

			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
