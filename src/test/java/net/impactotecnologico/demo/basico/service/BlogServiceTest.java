package net.impactotecnologico.demo.basico.service;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import net.impactotecnologico.demo.basico.models.Blog;
import net.impactotecnologico.demo.basico.repositories.BlogRepository;
import net.impactotecnologico.demo.basico.services.BlogServiceImpl;

@SpringBootTest
public class BlogServiceTest {

	@Mock
	BlogRepository blogRepository;

	@InjectMocks
	BlogServiceImpl blogServiceImpl;

	@Test
	public void potTituloOK() {

		String titulo = "t";

		Optional<Blog> blogEncontrado = Optional.of(new Blog(1l, "t"));

		Mockito.when(blogRepository.findByTitulo(titulo)).thenReturn(blogEncontrado);

		Blog obtenido = blogServiceImpl.findByTitulo(titulo);

		Mockito.verify(blogRepository).findByTitulo(titulo);
		Assertions.assertEquals(blogEncontrado.get(), obtenido);

	}
}
