package com.mjvSchool.biblioteca.repository;

import com.mjvSchool.biblioteca.model.Autor;
import com.mjvSchool.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Integer> {
}
