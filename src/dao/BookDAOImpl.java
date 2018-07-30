package dao;

import java.sql.ResultSet;
import java.util.List;
import domain.BookBean;
import enums.BookQuery;
import enums.DBMS;
import factory.DatabaseFactory;

public class BookDAOImpl implements BookDAO{
	private static BookDAO instance = new BookDAOImpl();
	public static BookDAO getInstance() {return instance;}
	public BookDAOImpl() {}
	@Override
	public void insertBook(BookBean bean) {
		try {
			DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeUpdate(
					BookQuery.INSERT.toString());
		} catch (Exception e) {e.printStackTrace();}
	}

	@Override
	public void updateBook(BookBean bean) {
		try {
			DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeUpdate(
					BookQuery.UPDATE.toString());
		} catch (Exception e) {e.printStackTrace();}
	}

	@Override
	public void deleteBook(BookBean bean) {
		try {
			DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeUpdate(
					BookQuery.DELETE.toString());
		} catch (Exception e) {e.printStackTrace();}
	}

	@Override
	public List<BookBean> selectBookList() {
		try {
			ResultSet rs = DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeQuery(
					BookQuery.LIST.toString());
			while(rs.next()) {
				
			}
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public List<BookBean> selectByRent(String rent) {
		try {
			ResultSet rs = DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeQuery(
					BookQuery.SELECT_RENT.toString());
			while(rs.next()) {
				
			}
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public List<BookBean> selectByTitle(String title) {
		try {
			ResultSet rs = DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeQuery(
					BookQuery.SELECT_TITLE.toString());
			while(rs.next()) {
				
			}
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public List<BookBean> selectByAuthor(String author) {
		try {
			ResultSet rs = DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeQuery(
					BookQuery.SELECT_AUTHOR.toString());
			while(rs.next()) {
				
			}
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public String countByBook() {
		try {
			ResultSet rs = DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeQuery(
					BookQuery.COUNT.toString());
			while(rs.next()) {
				
			}
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}
}
