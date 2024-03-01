package aiwa.model;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;

public class BaseModel {

	protected ServletContext context;

	protected BaseModel(ServletContext context) {
		this.context = context;
	}

	protected Connection connect() {

		try {

			Class.forName(("org.sqlite.JDBC"));

			String url = "jdbc:sqlite:" + context.getRealPath("WEB-INF/webapp8.db");
			//System.out.println(context.getRealPath("WEB-INF/webapp8.db"));
			Connection conn = DriverManager.getConnection(url);

			return conn;
		} catch (Exception e) {

		}
		return null;
	}
}
