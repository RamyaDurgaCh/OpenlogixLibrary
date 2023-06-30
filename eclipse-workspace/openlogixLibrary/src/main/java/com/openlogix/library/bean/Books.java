package com.openlogix.library.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Books")
public class Books {
	@Id
	private String id;
	private String bookName;
	private String authorName;
	private String Publisher;
	
	public Books() {
		super();
	}
	public Books(String id, String bookName,String authorName,String Publisher) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName=authorName;
		this.Publisher=Publisher;
	}
	public String getId() {
		return id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

}
