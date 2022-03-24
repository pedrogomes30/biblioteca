package com.mjvSchool.biblioteca.controller;


import com.mjvSchool.biblioteca.model.Autor;
import com.mjvSchool.biblioteca.model.Pagamentos;
import com.mjvSchool.biblioteca.repository.AutorRepository;
import com.mjvSchool.biblioteca.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping()
    public List<Pagamentos> findAll() {
        return pagamentoRepository.findAll();
    }

    @PostMapping
    public Pagamentos insert(@RequestBody Pagamentos pagamentos){
        return pagamentoRepository.save(pagamentos);
    }

}
