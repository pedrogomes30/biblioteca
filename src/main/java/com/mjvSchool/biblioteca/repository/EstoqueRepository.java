package com.mjvSchool.biblioteca.repository;

import com.mjvSchool.biblioteca.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque,Integer> {
}
