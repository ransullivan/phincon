package com.id.phincon.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.id.phincon.entity.Book;
import com.id.phincon.service.BookService;


@RestController
public class BookController {

	   @Autowired
	    private BookService service;

	    @PostMapping("/addbook")
	    public Book addBook(@RequestBody Book Book) {
	        return service.saveBook(Book);
	    }

	    @PostMapping("/addbooks")
	    public List<Book> addbook(@RequestBody List<Book> book) {
	        return service.saveBooks(book);
	    }

	    @GetMapping("/book")
	    public List<Book> findAllbook() {
	        return service.getBook();
	    }

	    @GetMapping("/BookById/{id}")
	    public Book findBookById(@PathVariable int id) {
	        return service.getBookById(id);
	    }

	    @GetMapping("/Book/{title}")
	    public Book findBookByTitle(@PathVariable String title) {
	        return service.getBookBytitle(title);
	    }

	    @PutMapping("/update")
	    public Book updateBook(@RequestBody Book Book) {
	        return service.updateBook(Book);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteBook(@PathVariable int id) {
	        return service.deleteBook(id);
	    }	
}
