package com.example.Books.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Books.Entity.Books;



@Repository
public class FakeBooksRep implements BooksRepository {
	
	private static List<Books> DATABASE = new ArrayList<>();


  @Override
    public int insertBooks(Books books) {
        DATABASE.add(new Books(books.getName(), books.getAuthor()));
        return 1;
    }
    
    @Override
    public List<Books> getAllBooks() {
        return DATABASE;
    }


}
