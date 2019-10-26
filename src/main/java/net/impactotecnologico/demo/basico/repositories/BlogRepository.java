package net.impactotecnologico.demo.basico.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.impactotecnologico.demo.basico.models.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

	Optional<Blog> findByTitulo(String titulo);

}
