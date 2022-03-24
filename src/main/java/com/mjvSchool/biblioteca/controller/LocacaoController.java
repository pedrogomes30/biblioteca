package com.mjvSchool.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import com.mjvSchool.biblioteca.Service.LocacaoService;
import com.mjvSchool.biblioteca.dto.LocacaoDto;
import com.mjvSchool.biblioteca.model.Entidade;
import com.mjvSchool.biblioteca.model.Locacao;

import com.mjvSchool.biblioteca.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/locacao")
public class LocacaoController {

    @Autowired
    private LocacaoService locacaoService;

    @GetMapping()
    public List<Locacao> listar() {
        return locacaoService.findAll();
    }



    @PostMapping()
    public void gravar(@RequestBody LocacaoDto dto) {
        locacaoService.salvar(dto);
    }
//
//
//    @PutMapping()
//    public void alterar(@RequestBody Locacao locacao) {
//        locacaoService.save(locacao);
//    }
//
//    @DeleteMapping(path = "/{id}")
//    public void excluir(@PathVariable Integer id) {
//        locacaoService.deleteById(id);
//    }
}
