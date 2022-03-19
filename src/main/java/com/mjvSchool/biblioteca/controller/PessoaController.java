package com.mjvSchool.biblioteca.controller;

import java.util.List;

import com.mjvSchool.biblioteca.model.Livro;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @PostMapping()
    public void gravar(Livro pessoa) {
        System.out.println("GRAVAR");
    }
    @PutMapping()
    public void alterar(Livro pessoa) {
        System.out.println("ALTERAR");
    }
    @DeleteMapping()
    public void excluir(Integer id) {
        System.out.println("EXCLUIR");
    }
    @GetMapping()
    public List<Livro> listar() {
        System.out.println("LISTANDO DADOS");
        return null;
    }
}
