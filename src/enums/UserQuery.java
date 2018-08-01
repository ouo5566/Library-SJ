package enums;

public enum UserQuery {
	INSERT, UPDATE, DELETE, SELECT_NAME, SELECT_ID, COUNT, LIST, LOGIN;
	@Override
	public String toString() {
		String sql = "";
		switch (this) {
		case INSERT:
			sql = " INSERT INTO USERLIST "
					+ " (USER_ID, USER_PW, USER_NAME, BIRTH, R_LEVEL, DISCOUNT_RATE, RENTBAN ) "
					+ " VALUES "
					+ " ('%s', '%s', '%s', '%s', '6', '0', 'NONE') ";
			break;
		case UPDATE:
			sql = " UPDATE USERLIST SET "
					+ " USER_PW = '%s', "
					+ " R_LEVEL = '%s', "
					+ " DISCOUNT_RAGE = '%s' "
					+ " RENTBAN = '%s' "
					+ " WHERE USER_ID LIKE '%s' ";
			break;
		case DELETE:
			sql = " DELETE FROM USERLIST "
					+ " WHERE USER_ID LIKE '%s' ";
			break;
		case SELECT_NAME:
			sql = " SELECT "
					+ " USER_ID "
					+ " FROM USERLIST "
					+ " WHERE USER_NAME LIKE '%s' ";
			break;
		case SELECT_ID:
			sql = "";
			break;
		case COUNT:
			sql = "";
			break;
		case LIST:
			sql = "";
			break;
		case LOGIN:
			sql = "";
			break;
		}
		return sql;
	}
}
