package com.mjvSchool.biblioteca.repository;

import com.mjvSchool.biblioteca.model.Entidade;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadeRepository extends JpaRepository<Entidade,Integer> {
    
}
