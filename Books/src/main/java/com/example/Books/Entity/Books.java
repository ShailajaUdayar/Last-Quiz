package com.example.Books.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Books {
	String name;
	String author;
	
	
	public Books() {
	}
	
	public Books(@JsonProperty("name")String name, 
			@JsonProperty("author")String author) {
		
		this.name = name;
		this.author = author;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
