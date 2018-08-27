package com.bookstore.bookstoreservice.controller;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstoreservice.entities.Book;
import com.bookstore.bookstoreservice.service.BookService;

@RestController
@RequestMapping("/bookstore")
public class BookController {
	
	private BookService bookService;
	
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@GetMapping("/books")
	public HttpEntity<List<Book>> getListofBooks(){
		return new HttpEntity<List<Book>>(bookService.getListOfBooks());
	}
	
	@PostMapping("/books")
	public HttpEntity<Book> addNewBook(@RequestBody Book bookToBeAdded) {
		System.out.println("In Post ..!!");
		return new HttpEntity<Book>(bookService.addBookToTheStore(bookToBeAdded));
	}
	
	@GetMapping("/books/{id}")
	public HttpEntity<Book> getExistingBookWithId(@PathVariable("id") Long bookId) {
		System.out.println("In Get ..!!");
		return new HttpEntity<Book>(bookService.getBookWithId(bookId));
	}
	
	@PutMapping("/books/{id}")
	public HttpEntity<Book> updateExistingBook(@PathVariable("id") Long bookId, @RequestBody Book updatedBook) {
		System.out.println("In Put ..!!");
		return new HttpEntity<Book>(bookService.updateExistingBook(bookId, updatedBook));
	}
	
	@DeleteMapping("/books/{id}")
	public HttpEntity<Book> deleteExistingBook(@PathVariable("id") Long bookId) {
		System.out.println("In Delete  ..!!");
		return new HttpEntity<Book>(bookService.deleteAnExistingBook(bookId));
	}
}
