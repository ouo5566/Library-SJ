package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import domain.UserBean;
import enums.DBMS;
import enums.UserQuery;
import factory.DatabaseFactory;

public class UserDAOImpl implements UserDAO{
	private static UserDAO instance = new UserDAOImpl();
	public static UserDAO getInstance() {return instance;}
	public UserDAOImpl() {}
	@Override
	public void insertUser(UserBean bean) {
		try {
			DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeUpdate(
					UserQuery.INSERT.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(UserBean bean) {
		try {
			DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeUpdate(
					UserQuery.UPDATE.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUser(UserBean bean) {
		try {
			DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeUpdate(
					UserQuery.DELETE.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UserBean> selectUserList() {
		List<UserBean> list = null;
		try {
			ResultSet rs = DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeQuery(
					UserQuery.LIST.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<UserBean> selectByName(String name) {
		List<UserBean> list = null;
		try {
			ResultSet rs = DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeQuery(
					UserQuery.SELECT_NAME.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public UserBean selectById(String id) {
		UserBean user = null;
		try {
			ResultSet rs = DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeQuery(
					UserQuery.SELECT_ID.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public String countByUser() {
		String res = "";
		try {
			ResultSet rs = DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeQuery(
					UserQuery.COUNT.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public void login(UserBean user) {
		try {
			DatabaseFactory.createDatabase(DBMS.ORACLE).getConnection().createStatement().executeUpdate(
					UserQuery.LOGIN.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
