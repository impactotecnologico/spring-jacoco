package net.impactotecnologico.demo.basico.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.impactotecnologico.demo.basico.models.Blog;
import net.impactotecnologico.demo.basico.repositories.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogRepository blogRepository;

	@Override
	public Blog findByTitulo(String titulo) {
		Optional<Blog> bo = blogRepository.findByTitulo(titulo);

		if (bo.isPresent()) {
			return bo.get();
		} else {
			return new Blog();
		}

	}

}
