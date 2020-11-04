package com.sayak_springboot.library;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

	@RequestMapping("/library")
	public String libraryWelcome() {
		return "Welcome to my Library";
	}
}
