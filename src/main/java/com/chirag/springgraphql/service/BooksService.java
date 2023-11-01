package com.chirag.springgraphql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chirag.springgraphql.entity.Books;

public interface BooksService {
	
	//Create
	Books create(Books books);
	
	//get all
	List<Books> getAll();
	
	//get single book
	Books get(int bookId);
	

}
