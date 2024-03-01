package aiwa.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;

import aiwa.entity.account;

public class SignModel extends BaseModel {

	public SignModel(ServletContext context) {
		super(context);

	}

	public account checkAccountExist(String user) {

		try (Connection cnn = super.connect();) {

			String sql = "select * from account where username = ? ";
			PreparedStatement stmt = cnn.prepareStatement(sql);
			stmt.setString(1, user);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				account a = new account(rs.getInt("id"), rs.getString("username"), rs.getString("email"),
						rs.getString("password"), rs.getInt("isAdmin"), rs.getString("zipcode"),
						rs.getString("address"));
				cnn.close();
				return a;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void signUp(account a) {

		Connection cnn = null;
		try {

			cnn = super.connect();

			PreparedStatement stmt = cnn
					.prepareStatement(
							"insert into account (username, password, email,zipcode, address) values (?,?,?,?,?)");
			int index = 1;
			stmt.setString(index++, a.getUser());
			stmt.setString(index++, a.getPassword());
			stmt.setString(index++, a.getEmail());
			stmt.setString(index++, a.getZipcode());
			stmt.setString(index++, a.getAddress());

			stmt.executeUpdate();
			cnn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
