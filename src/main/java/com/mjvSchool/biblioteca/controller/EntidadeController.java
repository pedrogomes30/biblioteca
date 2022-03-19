package com.mjvSchool.biblioteca.controller;

import java.util.List;

import com.mjvSchool.biblioteca.model.Entidade;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/entidade")
public class EntidadeController {
    @PostMapping()
    public void gravar(Entidade entidade) {
        System.out.println("GRAVAR");
    }
    @PutMapping()
    public void alterar(Entidade entidade) {
        System.out.println("ALTERAR");
    }
    @DeleteMapping()
    public void excluir(Integer id) {
        System.out.println("EXCLUIR");
    }
    @GetMapping()
    public List<Entidade> listar() {
        System.out.println("LISTANDO DADOS");
        return null;
    }
}
