package com.mjvSchool.biblioteca.repository;

import com.mjvSchool.biblioteca.model.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<Locacao,Integer> {
}
