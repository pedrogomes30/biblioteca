package com.mjvSchool.biblioteca.controller;


import java.util.List;


import com.mjvSchool.biblioteca.Service.LivroService;

import com.mjvSchool.biblioteca.model.Livro;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping()
    public List<Livro> findAll() {
        return livroService.findAll();
    }

    @PostMapping
    public Livro insert(@RequestBody Livro livro){
        return livroService.save(livro);
    }

    @PutMapping(value = "/{id}")
    public Livro update(@RequestBody Livro livro){
        return livroService.update(livro);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id){
         livroService.delete(id);
    }
}
