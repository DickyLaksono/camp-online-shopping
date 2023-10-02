package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test1 {

	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");

			String sql = "select * from products order by productid";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {//next akan memanggil data sampai akhir,jika sudah sampai akhir akan false
				System.out.print(rs.getString("productname"));
				System.out.print(rs.getInt("price") + "円");
				System.out.println("\n");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
