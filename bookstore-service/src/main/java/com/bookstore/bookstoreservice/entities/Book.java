package com.bookstore.bookstoreservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private String price;
	private String publisher;
	
	public Book() {
		super();
	}

	public Book(String title, String price, String publisher) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public String getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", publisher=" + publisher + "]";
	}	
}
