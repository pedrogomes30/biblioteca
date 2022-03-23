package com.mjvSchool.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import com.mjvSchool.biblioteca.model.Categoria;

import com.mjvSchool.biblioteca.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping()
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Categoria> listarUm(@PathVariable("id") Integer id){
        return categoriaRepository.findById(id);
    }


    @PostMapping()
    public void gravar(@RequestBody Categoria categoria) {
        categoriaRepository.save(categoria);
    }


    @PutMapping()
    public void alterar(@RequestBody Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable Integer id) {
        categoriaRepository.deleteById(id);
    }
}
