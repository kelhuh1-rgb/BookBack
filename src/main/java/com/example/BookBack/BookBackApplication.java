package com.example.BookBack;

import com.example.BookBack.controller.BookController;
import com.example.BookBack.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookBackApplication.class, args);


		Book book1 = new Book();
		book1.setId(1);
		book1.setTitle("Main Kampf");
		book1.setAuthor("Adolf Gitler");
		book1.setPages(501);




	}

}
