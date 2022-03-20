package com.mjvSchool.biblioteca.controller;

import com.mjvSchool.biblioteca.model.Autor;
import com.mjvSchool.biblioteca.model.Categoria;
import com.mjvSchool.biblioteca.repository.AutorRepository;
import com.mjvSchool.biblioteca.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/categorias")
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
    @PutMapping(value = "/{id}")
    public void alterar(@PathVariable("id") Integer id,@RequestBody Categoria categoria) {
        categoria.setId(id);
        categoriaRepository.save(categoria);
    }
    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable Integer id) {
        categoriaRepository.deleteById(id);
    }
}
