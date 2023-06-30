package com.openlogix.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.openlogix.library.bean.Books;

public interface BooksRepository extends CrudRepository <Books, String >{

}
