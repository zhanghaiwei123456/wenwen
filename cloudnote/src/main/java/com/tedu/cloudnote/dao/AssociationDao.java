package com.tedu.cloudnote.dao;

import java.util.List;

import com.tedu.cloudnote.entity.Book;

public interface AssociationDao {
	public Book findById(String bookId);
	
	public List<Book> findAllBook();

}
