package com.sayak_springboot.genre;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sayak_springboot.book.Genre;

@RestController 
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	@RequestMapping("/library/genres/{id}/books")
	public List<Book> getAllBooks(@PathVariable String id){
		return bookService.getAllBooks(id);
	}
	
	@RequestMapping("/library/genres/{genreId}/books/{id}")
	public Optional<Book> getGenre(@PathVariable String id) {
		return bookService.getBook(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/library/genres/{genreId}/books")
	public void addGenre(@RequestBody Book book, @PathVariable String genreId) {
		book.setGenre(new Genre(genreId, "", ""));
		bookService.addBook(book);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/library/genres/{genreId}/books/{id}")
	public void updateGenre(@RequestBody Book book, @PathVariable String genreId, @PathVariable String id) {
		book.setGenre(new Genre(genreId, "", ""));
		bookService.updateBook(book);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/library/genres/{genreId}/books/{id}")
	public void deleteGenre(@PathVariable String id) {
		bookService.deleteBook(id);
	}
	

}
