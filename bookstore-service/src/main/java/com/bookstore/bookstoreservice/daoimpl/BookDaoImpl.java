package com.bookstore.bookstoreservice.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bookstore.bookstoreservice.dao.BookDao;
import com.bookstore.bookstoreservice.entities.Book;

@Transactional
@Repository
public class BookDaoImpl implements BookDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Book> getListOfBooks() {
		List<Book> listOfBooks = (ArrayList<Book>) entityManager.createQuery("from Book b").getResultList();
		return listOfBooks;
	}

	@Override
	public Book getBookWithId(long bookId) {		
		return entityManager.find(Book.class, bookId);
	}

	@Override
	public Book addBookToTheStore(Book bookToBeAdded) {
		entityManager.persist(bookToBeAdded);
		return bookToBeAdded;
	}

	@Override
	public Book updateExistingBook(long bookId, Book updatedBook) {
		Book bookToBeUpdated = getBookWithId(bookId);
		if(bookToBeUpdated!=null) {
			bookToBeUpdated.setTitle(updatedBook.getTitle());
			bookToBeUpdated.setPublisher(updatedBook.getPublisher());
			bookToBeUpdated.setPrice(updatedBook.getPrice());
			
			entityManager.persist(bookToBeUpdated);
		}
		return bookToBeUpdated;
	}

	@Override
	public Book deleteAnExistingBook(long bookId) {
		Book bookToBeDeleted = getBookWithId(bookId);
		if(bookToBeDeleted!=null) {
			entityManager.remove(bookToBeDeleted);
		}
		return bookToBeDeleted;
	}
}
