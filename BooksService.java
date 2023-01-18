package com.heartcore.BookStore.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.heartcore.BookStore.dao.BooksDao;
import com.heartcore.BookStore.model.Books;

@Service
public class BooksService {
	@Autowired
	private BooksDao booksDao;
	
	boolean flag;
	
	public boolean addBooks(Books b) {
		Books books = booksDao.save(b);
		if(books!=null) {
			flag=true;
		}
		else {
			flag=false;
		}
		return flag;
	}
	
	private List<Books> booksList;
	public List<Books> getBooksList(){
		if(booksList==null) {
			booksList= new ArrayList<>();
		}
		return booksList;
}
	public void setBooksList( List<Books> booksList)
	{
		this.booksList= booksList;
	}

}
