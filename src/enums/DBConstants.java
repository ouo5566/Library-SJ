package enums;

public enum DBConstants {
	ORACLE_DRIVER,CONNECTION_URL,USERNAME,PASSWORD;
	@Override
	public String toString() {
		String s = "";
		switch (this) {
		case ORACLE_DRIVER:
			s = "oracle.jdbc.driver.OracleDriver";
			break;
		case CONNECTION_URL:
			s = "jdbc:oracle:thin:@localhost:1521:xe";
			break;
		case USERNAME:
			s = "ssoso";
			break;
		case PASSWORD:
			s = "sweet93";
			break;
		}
		return s;
	}
}
