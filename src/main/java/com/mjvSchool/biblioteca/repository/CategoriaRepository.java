package com.mjvSchool.biblioteca.repository;

import com.mjvSchool.biblioteca.model.Autor;
import com.mjvSchool.biblioteca.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
