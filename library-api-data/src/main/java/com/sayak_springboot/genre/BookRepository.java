package com.sayak_springboot.genre;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {
	
	public List<Book> findByGenreId(String genreId);

}
