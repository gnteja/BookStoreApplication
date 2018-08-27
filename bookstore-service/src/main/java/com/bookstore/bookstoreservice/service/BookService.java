package com.bookstore.bookstoreservice.service;

import java.util.List;

import com.bookstore.bookstoreservice.entities.Book;

public interface BookService {
	
	public Book addBookToTheStore(Book bookToBeAdded);
	
	public Book getBookWithId(long bookId);
	
	public Book updateExistingBook(long bookId, Book updatedBook);
	
	public Book deleteAnExistingBook(long bookId);

	public List<Book> getListOfBooks();

}
