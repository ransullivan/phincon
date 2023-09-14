package com.id.phincon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.id.phincon.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	Book findByTitle(String name); //blom di implemntasi

}
