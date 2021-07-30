package com.example.Books.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Books.Entity.Books;

@Repository
public interface BooksRepository {
	
	 int insertBooks(Books books);
	
	 List<Books> getAllBooks();
	
	
}
