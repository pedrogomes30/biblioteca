package com.mjvSchool.biblioteca.Service;

import com.mjvSchool.biblioteca.model.Livro;
import com.mjvSchool.biblioteca.repository.AutorRepository;
import com.mjvSchool.biblioteca.repository.CategoriaRepository;
import com.mjvSchool.biblioteca.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;

//onde é definido a regra de negócio.

public class LivroService {
    @Autowired
    private LivroRepository repository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private AutorRepository autorRepository;

    public void salvar(Livro livro){
        try{
            //check categoria
            boolean temCategoria    = categoriaRepository.existsById(livro.getCategoria().getId());
            //check autor
            boolean temAutor        = autorRepository.existsById(livro.getAutor().getId());
            if(!temCategoria)       {throw new Exception("categoria não definida ou definida de forma errada");} 
            if(!temAutor)           {throw new Exception("Autor não definida ou definida de forma errada");} 
            repository.save(livro);
        }catch(Exception e){
            System.out.println(e.getMessage()); 
        }

    }
    
}
