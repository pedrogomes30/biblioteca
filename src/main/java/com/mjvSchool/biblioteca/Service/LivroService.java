package com.mjvSchool.biblioteca.Service;

import com.mjvSchool.biblioteca.dto.LivroDto;
import com.mjvSchool.biblioteca.model.Livro;
import com.mjvSchool.biblioteca.repository.AutorRepository;
import com.mjvSchool.biblioteca.repository.CategoriaRepository;
import com.mjvSchool.biblioteca.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


<<<<<<< HEAD
import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//onde é definido a regra de negócio.
@Service
public class LivroService {
=======
public class LivroService{
>>>>>>> fbf601767613c6e673b6351bbf5f605c2523ce55
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private AutorRepository autorRepository;

    @Transactional(readOnly = true)
    public List<LivroDto> findAll(){
        List<Livro> list= livroRepository.findAll();
        return list.stream().map(x -> new LivroDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public LivroDto findById(Integer id) {
        Optional<Livro> obj = livroRepository.findById(id);
        Livro entity = obj.get();
        return new LivroDto(entity);
    }

    @Transactional
    public LivroDto insert(LivroDto dto) {
        Livro entity = new Livro();
        entity.setAutor(dto.getAutor());
        entity.setCategoria(dto.getCategoria());
        entity.setNome(dto.getNome());
        entity.setEdicao(dto.getEdicao());
        entity.setIsbn(dto.getIsbn());
        entity.setPreco(dto.getPreco());
        entity = livroRepository.save(entity);
        return new LivroDto(entity);
    }

    @Transactional
    public LivroDto update(Integer id,LivroDto dto) {
            Livro entity = livroRepository.getOne(id);
            entity.setAutor(dto.getAutor());
            entity.setCategoria(dto.getCategoria());
            entity.setNome(dto.getNome());
            entity.setEdicao(dto.getEdicao());
            entity.setIsbn(dto.getIsbn());
            entity.setPreco(dto.getPreco());
            entity = livroRepository.save(entity);
            return new LivroDto(entity);
    }

    public void delete(Integer id) {
            livroRepository.deleteById(id);
    }


    public void salvar(Livro livro){
        try{
            //check categoria
            boolean temCategoria    = categoriaRepository.existsById(livro.getCategoria().getId());
            //check autor
            boolean temAutor        = autorRepository.existsById(livro.getAutor().getId());
            if(!temCategoria)       {throw new Exception("categoria não definida ou definida de forma errada");}
            if(!temAutor)           {throw new Exception("Autor não definida ou definida de forma errada");}
            livroRepository.save(livro);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
<<<<<<< HEAD



=======
    

    
>>>>>>> fbf601767613c6e673b6351bbf5f605c2523ce55
}
