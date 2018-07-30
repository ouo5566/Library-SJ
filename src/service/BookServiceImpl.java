package service;

import java.util.List;
import domain.BookBean;

public class BookServiceImpl implements BookService{
	private static BookService instance = new BookServiceImpl();
	public static BookService getInstance() {return instance;}
	public BookServiceImpl() {}

	@Override
	public void createBook(BookBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyBook(BookBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBook(BookBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookBean> searchBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookBean> searchByRent(String rent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookBean> searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookBean> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countByBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
