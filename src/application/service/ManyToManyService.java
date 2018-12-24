package application.service;

import java.util.List;
import java.util.Set;

import application.entity.Author;
import application.entity.Book;


public interface ManyToManyService {
	
	public boolean addAuthor(String name);
	public boolean addBook(String title);
	public boolean setAuthor (String title, String name);
	public List<Author> getBookAuthors(String title);
	public List<Book> getAuthorBooks(String name);
	public boolean deleteBook(String title);
	public boolean deleteAuthor(String name);

}
