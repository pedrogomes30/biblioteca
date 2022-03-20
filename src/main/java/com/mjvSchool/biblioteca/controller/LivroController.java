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
    public Optional<Livro> listarUm(@PathVariable("id") Long id){
        return livroRepository.findById(Math.toIntExact(id));
    }

    @PostMapping()
    public void gravar(Livro livro) {
        livroRepository.save(livro);
    }
    @PutMapping()
    public void alterar(Livro livro) {
        livroRepository.save(livro);
    }
    @DeleteMapping(path = "/{id}")
    public void excluir(Integer id) {
        livroRepository.deleteById(id);
    }
}
