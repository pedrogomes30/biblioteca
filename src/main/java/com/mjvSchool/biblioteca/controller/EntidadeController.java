package com.mjvSchool.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import com.mjvSchool.biblioteca.model.Entidade;
import com.mjvSchool.biblioteca.repository.EntidadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/entidade")
public class EntidadeController {

    @Autowired
    private EntidadeRepository entidadeRepository;

    @PostMapping()
    public void gravar(@RequestBody Entidade entidade) {
        entidadeRepository.save(entidade);
        System.out.println("GRAVAR");
    }

    @PutMapping(value = "/{id}")
    public void alterar(@PathVariable("id") Integer id,@RequestBody Entidade entidade) {
        entidade.setId(id);
        entidadeRepository.save(entidade);
        System.out.println("ALTERAR");
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(Integer id) {
        System.out.println("EXCLUIR");
    }

    @GetMapping()
    public List<Entidade> listar(){
        return entidadeRepository.findAll();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Entidade> listarUm(@PathVariable("id") Integer id){
        System.out.println("LISTANDO");
        return entidadeRepository.findById(id);
    }
}
