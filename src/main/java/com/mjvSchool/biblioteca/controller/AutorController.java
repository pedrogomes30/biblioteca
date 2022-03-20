package com.mjvSchool.biblioteca.controller;

import com.mjvSchool.biblioteca.model.Autor;
import com.mjvSchool.biblioteca.model.Livro;
import com.mjvSchool.biblioteca.repository.AutorRepository;
import com.mjvSchool.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping()
    public List<Autor> listar() {
        return autorRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Autor> listarUm(@PathVariable("id") Integer id){
        return autorRepository.findById(id);
    }

    @PostMapping()
    public void gravar(@RequestBody Autor autor) {
        autorRepository.save(autor);
    }
    @PutMapping(value = "/{id}")
    public void alterar(@PathVariable("id") Integer id,@RequestBody Autor autor) {
        autor.setId(id);
        autorRepository.save(autor);
    }
    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable Integer id) {
        autorRepository.deleteById(id);
    }
}
