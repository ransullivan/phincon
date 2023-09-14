package com.id.phincon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id.phincon.entity.Book;
import com.id.phincon.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;

	public Book saveBook(Book books) {
		return bookRepo.save(books);
	}

	public List<Book> saveBooks(List<Book> books) {
		return bookRepo.saveAll(books);
	}

	public List<Book> getBook() {
		return bookRepo.findAll();
	}

	public Book getBookById(long id) {
		return bookRepo.findById(id).orElse(null);
	}

	public Book getBookBytitle(String title) {
		return bookRepo.findByTitle(title);
	}

	public String deleteBook(long id) {
		bookRepo.deleteById(id);
		return "Book removed !! " + id;
	}

	public Book updateBook(Book books) {
		Book exBook = bookRepo.findById(books.getId()).orElse(null);
		exBook.setTitle(books.getTitle());
		exBook.setPublisher(books.getPublisher());
		exBook.setAuthor(books.getAuthor());
		exBook.setNumberOfPages(books.getNumberOfPages());
		exBook.setDateOfIssue(books.getDateOfIssue());
		return bookRepo.save(exBook);
	}

}