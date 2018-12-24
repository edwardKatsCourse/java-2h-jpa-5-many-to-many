package application.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.entity.Author;
import application.entity.Book;
import application.service.ManyToManyService;

@RestController
public class AuthorBookController {
	
	@Autowired
	ManyToManyService model;
	
	@PostMapping(value="/addAuthor")
	public boolean addAuthor(@RequestParam (name="author") String name) {
		return model.addAuthor(name);
	}
	
	@PostMapping(value="/addBook")
	public boolean addBook(@RequestParam (name="book") String title) {
		return model.addBook(title);
	}
	
	@PostMapping(value="/setAuthor")
	public boolean setAuthor(@RequestParam (name="book") String title,
							 @RequestParam (name="author") String name) {
		return model.setAuthor(title, name);
	}
	
	@GetMapping(value = "/getAuthors")
	public List<Author> getAuthors(@RequestParam (name="book") String title){
		return model.getBookAuthors(title);
	}
	
	@GetMapping(value = "/getBooks")
	public List<Book> getBooks(@RequestParam (name="author") String name){
		return model.getAuthorBooks(name);
	}
	
	@DeleteMapping(value = "/removeBook")
	public boolean removeBook(@RequestParam (name="book") String title) {
		return model.deleteBook(title);
	}
	
	@DeleteMapping(value = "/removeAuthor")
	public boolean removeAuthor(@RequestParam (name="author") String name) {
		return model.deleteAuthor(name);
	}

}
