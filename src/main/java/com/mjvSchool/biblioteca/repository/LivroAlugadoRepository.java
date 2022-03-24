package com.mjvSchool.biblioteca.repository;

import com.mjvSchool.biblioteca.model.Livro;
import com.mjvSchool.biblioteca.model.LivroAlugado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroAlugadoRepository extends JpaRepository<LivroAlugado,Integer> {
}
