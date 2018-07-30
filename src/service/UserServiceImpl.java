package service;

import java.util.List;
import domain.UserBean;

public class UserServiceImpl implements UserService{
	private static UserService instance = new UserServiceImpl();
	public static UserService getInstance() {return instance;}
	public UserServiceImpl() {}
	@Override
	public void createUser(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyUser(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserBean> searchUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserBean> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBean searchById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countByUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(UserBean user) {
		// TODO Auto-generated method stub
		
	}

}
