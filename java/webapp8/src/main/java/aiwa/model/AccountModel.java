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

			String sql = "select * from account where username = ? AND password = ?";

			PreparedStatement stmt = conn.prepareStatement(sql);
			int index = 1;

			stmt.setString(index++, username);
			stmt.setString(index++, password);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				account a = new account(rs.getInt("id"), rs.getString("username"), rs.getString("emial"),
						rs.getString("password"));
				return a;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
