package com.example.Books.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Books.Entity.Books;
import com.example.Books.Repository.BooksRepository;


@Service
public class BooksService {
	
	 @Autowired
	    BooksRepository booksRepository;

	    public BooksService(BooksRepository booksRepository) {
	        this.booksRepository = booksRepository;
	    }

	    public int addBooks(Books books){
	        return booksRepository.insertBooks(books);
	    }
	   

	    public List<Books> findAllBooks(){
	        return booksRepository.getAllBooks();
	    }
}
