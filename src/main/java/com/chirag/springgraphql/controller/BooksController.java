package com.chirag.springgraphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.chirag.springgraphql.entity.Books;
import com.chirag.springgraphql.service.BooksService;


@Controller
public class BooksController {
	
	@Autowired
	private BooksService booksService;	
	
	@MutationMapping("createBook")
	public Books create(@Argument BookInput books) {
		Books b = new Books();
		b.setName(books.getName());
		b.setAuthor(books.getAuthor());
		b.setDesc(books.getDesc());
		b.setPages(books.getPages());
		b.setPrice(books.getPrice());
		return booksService.create(b);
		
	}
	
	@QueryMapping("allBooks")
	public List<Books> getAll(){
		return this.booksService.getAll();
	}
	
	@QueryMapping("getBook")
	public Books get(@Argument int bookId) {
		return this.booksService.get(bookId);
	}
}


class BookInput{
	private String name;
	private String desc;
	private String author;
	private double price;
	private int pages;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
