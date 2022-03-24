package com.mjvSchool.biblioteca.controller;

import com.mjvSchool.biblioteca.model.Autor;
import com.mjvSchool.biblioteca.model.Categoria;
import com.mjvSchool.biblioteca.repository.AutorRepository;
import com.mjvSchool.biblioteca.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

        @Autowired
        private CategoriaRepository categoriaRepository;

        @GetMapping()
        public List<Categoria> findAll() {
            return categoriaRepository.findAll();
        }

        @PostMapping
        public Categoria insert(@RequestBody Categoria categoria){
            return categoriaRepository.save(categoria);
        }

}

