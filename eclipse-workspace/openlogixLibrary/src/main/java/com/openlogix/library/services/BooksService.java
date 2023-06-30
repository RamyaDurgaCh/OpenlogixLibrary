package com.openlogix.library.services;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlogix.library.bean.Books;
import com.openlogix.library.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	public BooksRepository booksRepo;
	
	public List <Books> getAllBooks(){
		
		List<Books> books = new ArrayList <>();
		booksRepo.findAll().forEach(books:: add );
		return books;
	}

	public void addBooks(Books books) {
		// TODO Auto-generated method stub
		booksRepo.save(books);
		
	}

	public void updateBook(Books books) {
		booksRepo.save(books);
		
		
	}

	public void deleteBook(String id) {
		// TODO Auto-generated method stub
		booksRepo.deleteById(id);
		
	}
}
