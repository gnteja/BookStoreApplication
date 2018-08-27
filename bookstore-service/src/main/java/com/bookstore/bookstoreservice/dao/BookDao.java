package com.bookstore.bookstoreservice.dao;

import java.util.List;

import com.bookstore.bookstoreservice.entities.Book;

public interface BookDao {
	
	public Book getBookWithId(long id);

	public Book addBookToTheStore(Book bookToBeAdded);

	public Book updateExistingBook(long bookId, Book bookResourceExisting);
	
	public Book deleteAnExistingBook(long bookId);

	public List<Book> getListOfBooks();
}
