package com.mjvSchool.biblioteca.Service;
import com.mjvSchool.biblioteca.model.Livro;
import com.mjvSchool.biblioteca.repository.AutorRepository;
import com.mjvSchool.biblioteca.repository.CategoriaRepository;
import com.mjvSchool.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

//onde é definido a regra de negócio.
@Service
public class LivroService {

        @Autowired
        private LivroRepository livroRepository;
        @Autowired
        private CategoriaRepository categoriaRepository;
        @Autowired
        private AutorRepository autorRepository;

        @Transactional(readOnly = true)
        public List<Livro> findAll() {
            livroRepository.findAll();
            return livroRepository.findAll();
        }


        @Transactional
        public Livro save(@RequestBody Livro livro) {
            return livroRepository.save(livro);
        }

        @Transactional
        public Livro update(@RequestBody Livro livro) {
            return livroRepository.save(livro);
        }

        public void delete(Integer id) {
            livroRepository.deleteById(id);
        }

        public void salvar(Livro livro) {
            try {
                // check categoria
                boolean temCategoria = categoriaRepository.existsById(livro.getCategoria().getId());
                // check autor
                boolean temAutor = autorRepository.existsById(livro.getAutor().getId());
                if (!temCategoria) {
                    throw new Exception("categoria não definida ou definida de forma errada");
                }
                if (!temAutor) {
                    throw new Exception("Autor não definida ou definida de forma errada");
                }
                livroRepository.save(livro);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}
