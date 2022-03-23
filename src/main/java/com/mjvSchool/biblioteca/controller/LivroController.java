package com.mjvSchool.biblioteca.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.mjvSchool.biblioteca.Service.LivroService;
import com.mjvSchool.biblioteca.dto.LivroDto;
import com.mjvSchool.biblioteca.model.Livro;

import com.mjvSchool.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping()
    public ResponseEntity<List<LivroDto>> findAll() {
        List<LivroDto> list = livroService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<LivroDto> findById(@PathVariable Integer id) {
        LivroDto dto = livroService.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<LivroDto> insert(@RequestBody LivroDto dto){
        dto = livroService.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<LivroDto> update(@PathVariable Integer id,@RequestBody LivroDto dto){
        dto = livroService.update(id,dto);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        livroService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
