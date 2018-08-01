package enums;

public enum BookQuery {
	INSERT, UPDATE, DELETE, SELECT_RENT, SELECT_TITLE, SELECT_AUTHOR, LIST, COUNT;
	@Override
	public String toString() {
		String sql = "";
		switch (this) {
		case INSERT:
			sql = " INSERT INTO BOOK "
					+ " (BOOK_SEQ, TITLE, AUTHOR, COMPANY, RENTABLE) "
					+ " VALUES"
					+ " (BOOK_SEQ.NEXTVAL, '%s', '%s', '%s', '%s') ";
			break;
		case DELETE:
			sql = " DELETE FROM BOOK "
					+ " WHERE BOOK_SEQ LIKE '%s' ";
			break;
		case UPDATE:
			sql = " UPDATE BOOK SET "
					+ " TITLE = '%s', "
					+ " AUTHOR = '%s', "
					+ " COMPANY = '%s',"
					+ " RENTABLE = '%s' "
					+ " WHERE BOOK_SEQ LIKE '%s' ";
			break;
		case SELECT_RENT: // 대여된 책 목록
			sql = " SELECT " + 
					" B.BOOK_SEQ BOOKSEQ, " + 
					" B.TITLE, " + 
					" B.AUTHOR, " + 
					" B.COMPANY, " + 
					" R.USER_ID, " + 
					" R.RENT_DATE "  + 
					" FROM BOOK B " + 
					" JOIN RENT R " + 
					" ON B.BOOK_SEQ LIKE R.BOOK_SEQ " + 
					" WHERE B.RENTABLE LIKE 'UNABLE' ";
			break;
		case SELECT_TITLE:
			sql = " SELECT "
					+ " BOOK_SEQ BOOKSEQ, "
					+ " TITLE, "
					+ " AUTHOR, "
					+ " COMPANY, "
					+ " RENTABLE "
					+ " FROM BOOK "
					+ " WHERE TITLE LIKE '%%s%'";
			break;
		case SELECT_AUTHOR:
			sql = " SELECT "
					+ " BOOK_SEQ BOOKSEQ, "
					+ " TITLE, "
					+ " AUTHOR, "
					+ " COMPANY, "
					+ " RENTABLE "
					+ " FROM BOOK "
					+ " WHERE AUTHOR LIKE '%%s%'";
			break;
		case LIST:
			sql = " SELECT "
					+ " BOOK_SEQ BOOKSEQ, "
					+ " TITLE, "
					+ " AUTHOR, "
					+ " COMPANY, "
					+ " RENTABLE "
					+ " FROM BOOK ";
			break;
		case COUNT:
			sql = " SELECT COUNT(*) FROM BOOK ";
			break;
		}
		return sql;
	}
}
