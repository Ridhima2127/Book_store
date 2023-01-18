package com.heartcore.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.heartcore.BookStore.model.Books;
import com.heartcore.BookStore.service.BooksService;

@RestController
@CrossOrigin(origins="*")
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	ResponseEntity response;
	boolean flag;
	
	@PostMapping("/addbooks")
	public ResponseEntity<?> addBooks(@RequestBody Books books){
		flag = booksService.addBooks(books);
		if(flag) {
			response = new ResponseEntity<String>("book is added", HttpStatus.CREATED);
			
		}else{
			response = new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@GetMapping("/books")
	public ResponseEntity<?> getBooks(){
		List<Books> books = booksService.getBooksList();
	
		if (books!=null) {
			response= new ResponseEntity<List<Books>>(books, HttpStatus.OK);
		}
		else {
			response= new ResponseEntity<String>("No Books Available", HttpStatus.BAD_REQUEST);
		}
		
		return response;
	
	}
	
	

}
