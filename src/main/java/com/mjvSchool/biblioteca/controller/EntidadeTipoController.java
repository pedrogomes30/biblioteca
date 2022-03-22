package com.mjvSchool.biblioteca.controller;

import com.mjvSchool.biblioteca.model.EntidadeTipo;
import com.mjvSchool.biblioteca.repository.EntidadeTipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entidade_tipo")
public class EntidadeTipoController {

    @Autowired
    private EntidadeTipoRepository repository;

    @PostMapping()
    public void gravar(@RequestBody EntidadeTipo entidade) {
        repository.save(entidade);
        System.out.println("GRAVAR");
    }

    
}
