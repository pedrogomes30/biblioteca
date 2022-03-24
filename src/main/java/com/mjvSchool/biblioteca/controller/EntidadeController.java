package com.mjvSchool.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import com.mjvSchool.biblioteca.Service.EntidadeService;
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
    private EntidadeService entidadeService;

    @PostMapping()
    public void save(@RequestBody Entidade entidade) {
        System.out.println("GRAVAR");
        System.out.println(entidade);
		entidadeService.save(entidade);
    }

    @PutMapping()
    public void update(@RequestBody Entidade entidade) {
        System.out.println("ALTERAR");
        entidadeService.update(entidade);   
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Integer id) {
        System.out.println("EXCLUIR");
        entidadeService.delete(id);
    }

    @GetMapping()
    public List<Entidade> findAll() {
        return entidadeService.findAll();
    }

   
    
}
