package enums;

public enum BookQuery {
	INSERT, UPDATE, DELETE, SELECT_RENT, SELECT_TITLE, SELECT_AUTHOR, LIST, COUNT;
	@Override
	public String toString() {
		String sql = "";
		switch (this) {
		case INSERT:
			sql = "";
			break;
		case DELETE:
			sql = "";
			break;
		case UPDATE:
			sql = "";
			break;
		case SELECT_RENT:
			sql = "";
			break;
		case SELECT_TITLE:
			sql = "";
			break;
		case SELECT_AUTHOR:
			sql = "";
			break;
		case LIST:
			sql = "";
			break;
		case COUNT:
			sql = "";
			break;
		}
		return sql;
	}
}
