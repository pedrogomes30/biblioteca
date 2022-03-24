package com.mjvSchool.biblioteca.repository;

import com.mjvSchool.biblioteca.model.Livro;
import com.mjvSchool.biblioteca.model.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamentos,Integer> {
}
