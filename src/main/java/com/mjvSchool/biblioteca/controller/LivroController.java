package com.mjvSchool.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import com.mjvSchool.biblioteca.model.Livro;

import com.mjvSchool.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping()
    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Livro> listarUm(@PathVariable("id") Integer id){
        return livroRepository.findById(id);
    }


    @PostMapping()
    public void gravar(@RequestBody Livro livro) {
        livroRepository.save(livro);
    }


    @PutMapping()
    public void alterar(@RequestBody Livro livro) {
        livroRepository.save(livro);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable Integer id) {
        livroRepository.deleteById(id);
    }
}
