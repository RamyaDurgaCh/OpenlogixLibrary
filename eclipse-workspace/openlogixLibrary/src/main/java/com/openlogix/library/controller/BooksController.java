package com.openlogix.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openlogix.library.bean.Books;
import com.openlogix.library.services.BooksService;

@RestController
public class BooksController {
	@Autowired
	private BooksService booksService;
	@RequestMapping("/books")
	public  List <Books> getAllBooks(){
		return booksService.getAllBooks();
	
	}
	@RequestMapping(method= RequestMethod.POST, value ="/books")
	public void addBook(@RequestBody Books books) {
		booksService.addBooks(books);
		
	}
	
	@RequestMapping(method= RequestMethod.PUT, value ="/books/{id}")
	public void updateBook(@PathVariable String id ,@RequestBody Books books) {
		booksService.updateBook(books);
		
	}
	@RequestMapping(method= RequestMethod.DELETE, value ="/books/{id}")
	public void deleteBook(@PathVariable String id) {
		booksService.deleteBook(id);
		}

}
