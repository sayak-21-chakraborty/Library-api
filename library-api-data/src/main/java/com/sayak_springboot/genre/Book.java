package com.sayak_springboot.genre;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sayak_springboot.book.Genre;

@Entity
public class Book {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Genre genre;
	
	
	public Book() {
		
	}
	
	
	public Book(String id, String name, String description, String genreId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.genre = new Genre(genreId, "", "");
		
	}
	
	

	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
