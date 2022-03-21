package com.mjvSchool.biblioteca.repository;

import com.mjvSchool.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Integer> {
}
