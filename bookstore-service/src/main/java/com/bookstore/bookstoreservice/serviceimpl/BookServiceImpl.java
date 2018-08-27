package com.bookstore.bookstoreservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstoreservice.dao.BookDao;
import com.bookstore.bookstoreservice.entities.Book;
import com.bookstore.bookstoreservice.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDao bookDaoImpl;

	@Override
	public Book addBookToTheStore(Book bookToBeAdded) {
		return bookDaoImpl.addBookToTheStore(bookToBeAdded);
	}
	
	@Override
	public Book getBookWithId(long bookId) {
		return bookDaoImpl.getBookWithId(bookId);
	}
	
	@Override
	public Book updateExistingBook(long bookId, Book updatedBook) {
		return bookDaoImpl.updateExistingBook(bookId, updatedBook);
	}

	@Override
	public Book deleteAnExistingBook(long bookId) {
		return bookDaoImpl.deleteAnExistingBook(bookId);
	}

	@Override
	public List<Book> getListOfBooks() {
		return bookDaoImpl.getListOfBooks();
	}

}
