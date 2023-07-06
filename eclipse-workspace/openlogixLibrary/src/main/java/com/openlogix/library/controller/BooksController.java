package com.openlogix.library.controller;
import org.apache.logging.log4j.*;

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
	
	private static Logger logger =LogManager.getLogger(LogsController.class.getName());
	public static void main (String[] args) {

	}
	
	
	@Autowired
	private BooksService booksService;
	@RequestMapping("/books")
	public  List <Books> getAllBooks(){
		return booksService.getAllBooks();
	
	}
	@RequestMapping(method= RequestMethod.POST, value ="/books")
	public void addBook(@RequestBody Books books) {
		logger.info("Add Book method Execution started");
		booksService.addBooks(books);
		logger.info("inside add book method");
	}
	
	@RequestMapping(method= RequestMethod.PUT, value ="/books/{id}")
	public void updateBook(@PathVariable String id ,@RequestBody Books books) {
		logger.info("Update Book method Execution started");
		booksService.updateBook(books);
		logger.info("inside update book method");
		
	}
	@RequestMapping(method= RequestMethod.DELETE, value ="/books/{id}")
	public void deleteBook(@PathVariable String id) {
		logger.info("Delete Book method Execution started");
		booksService.deleteBook(id);
		logger.info("Inside delete book method");
		}

}
