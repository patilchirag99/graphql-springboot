package com.chirag.springgraphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chirag.springgraphql.entity.Books;
import com.chirag.springgraphql.service.BooksService;

@SpringBootApplication
public class SpringGraphqlApplication implements CommandLineRunner{
	
	@Autowired
	private BooksService booksService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringGraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Books b1 = new Books();
		b1.setName("Java 101");
		b1.setDesc("Learn java from scratch");
		b1.setAuthor("Chirag");
		b1.setPages(200);
		b1.setPrice(300);
		
		Books b2 = new Books();
		b2.setName("Advance java");
		b2.setDesc("Learn advance java");
		b2.setAuthor("XYZ");
		b2.setPages(2030);
		b2.setPrice(3300);
		
		Books b3 = new Books();
		b3.setName("Python basics");
		b3.setDesc("Learn python basics");
		b3.setAuthor("XYZ");
		b3.setPages(400);
		b3.setPrice(600);
		
		this.booksService.create(b1);
		this.booksService.create(b2);
		this.booksService.create(b3);
		
	}

}
