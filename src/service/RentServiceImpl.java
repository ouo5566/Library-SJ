package service;

import java.util.List;

import domain.*;

public class RentServiceImpl implements RentService{
	private static RentService instance = new RentServiceImpl();
	public static RentService getInstance() {return instance;}
	public RentServiceImpl() {}
	@Override
	public void createRent(RentBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOverdueMoney(String money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RentBean> searchRentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentBean> searchById(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentBean> searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchOverdue(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void returnBook(String bookNum) {
		// TODO Auto-generated method stub
		
	}

}
