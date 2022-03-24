package com.mjvSchool.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import com.mjvSchool.biblioteca.model.Entidade;
import com.mjvSchool.biblioteca.model.Locacao;

import com.mjvSchool.biblioteca.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/locacao")
public class LocacaoController {

    @Autowired
    private LocacaoRepository locacaoRepository;

    @GetMapping()
    public List<Locacao> listar() {
        return locacaoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Locacao> listarUm(@PathVariable("id") Integer id){
        return locacaoRepository.findById(id);
    }


    @PostMapping()
    public void gravar(@RequestBody Locacao locacao) {
        System.out.println(locacao.getLoja().getId());
        locacaoRepository.save(locacao);
    }


    @PutMapping()
    public void alterar(@RequestBody Locacao locacao) {
        locacaoRepository.save(locacao);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable Integer id) {
        locacaoRepository.deleteById(id);
    }
}
