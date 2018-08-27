package com.bookstore.bookstoreservice.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstoreservice.entities.Book;

@Repository
public interface BookRepo extends PagingAndSortingRepository<Book, Long> {
}
