package com.mjvSchool.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import com.mjvSchool.biblioteca.model.Estoque;

import com.mjvSchool.biblioteca.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueRepository estoqueRepository;

    @GetMapping()
    public List<Estoque> listar() {
        return estoqueRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Estoque> listarUm(@PathVariable("id") Integer id){
        return estoqueRepository.findById(id);
    }


    @PostMapping()
    public void gravar(@RequestBody Estoque estoque) {
        estoqueRepository.save(estoque);
    }


    @PutMapping()
    public void alterar(@RequestBody Estoque estoque) {
        estoqueRepository.save(estoque);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable Integer id) {
        estoqueRepository.deleteById(id);
    }
}
