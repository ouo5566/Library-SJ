package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import enums.DBConstants;

public class Oracle implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBConstants.ORACLE_DRIVER.toString());
			conn = DriverManager.getConnection(DBConstants.CONNECTION_URL.toString(),
					DBConstants.USERNAME.toString(), DBConstants.PASSWORD.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
