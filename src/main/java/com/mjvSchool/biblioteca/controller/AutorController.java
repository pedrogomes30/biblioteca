package com.mjvSchool.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import com.mjvSchool.biblioteca.model.Autor;

import com.mjvSchool.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/autor")
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


    @PutMapping()
    public void alterar(@RequestBody Autor autor) {
        autorRepository.save(autor);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable Integer id) {
        autorRepository.deleteById(id);
    }
}
