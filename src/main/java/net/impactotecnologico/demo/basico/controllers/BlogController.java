package net.impactotecnologico.demo.basico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.impactotecnologico.demo.basico.models.Blog;
import net.impactotecnologico.demo.basico.services.BlogService;

@RestController
@RequestMapping(path = "/blog", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class BlogController {

	@Autowired
	BlogService blogService;

	@GetMapping(path = "/{titulo}")
	public ResponseEntity<Blog> porTitulo(@PathVariable(name = "titulo") String titulo) {

		Blog b = blogService.findByTitulo(titulo);

		if (b.getTitulo() != null) {
			return new ResponseEntity<Blog>(b, HttpStatus.OK);
		} else {
			return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
		}

	}
}
