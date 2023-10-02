package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test2 {

	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");

			String sql = "select * from customers order by customerid";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {//next akan memanggil data sampai akhir,jika sudah sampai akhir akan false
				System.out.print(rs.getString("customername"));

			}
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
