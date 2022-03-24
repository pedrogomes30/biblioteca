package com.mjvSchool.biblioteca.controller;


import com.mjvSchool.biblioteca.model.LivroAlugado;
import com.mjvSchool.biblioteca.model.Pagamentos;
import com.mjvSchool.biblioteca.repository.LivroAlugadoRepository;
import com.mjvSchool.biblioteca.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/livrosalugados")
public class LivroAlugadoController {

    @Autowired
    private LivroAlugadoRepository livroAlugadoRepository;

    @GetMapping()
    public List<LivroAlugado> findAll() {
        return livroAlugadoRepository.findAll();
    }

    @PostMapping
    public LivroAlugado insert(@RequestBody LivroAlugado livroAlugado){
        return livroAlugadoRepository.save(livroAlugado);
    }

}
