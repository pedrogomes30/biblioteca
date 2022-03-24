package com.mjvSchool.biblioteca.controller;


import com.mjvSchool.biblioteca.Service.LivroService;
import com.mjvSchool.biblioteca.model.Autor;
import com.mjvSchool.biblioteca.model.Livro;
import com.mjvSchool.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping()
    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    @PostMapping
    public Autor insert(@RequestBody Autor autor){
        return autorRepository.save(autor);
    }

}
