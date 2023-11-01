package com.chirag.springgraphql.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chirag.springgraphql.entity.Books;
import com.chirag.springgraphql.repositories.BookRepo;
import com.chirag.springgraphql.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService{
	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public Books create(Books books) {
		// TODO Auto-generated method stub
		return bookRepo.save(books);
	}

	@Override
	public List<Books> getAll() {
		// TODO Auto-generated method stub
		return this.bookRepo.findAll();
	}

	@Override
	public Books get(int bookId) {
		// TODO Auto-generated method stub
		return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found on server"));
	}

}
