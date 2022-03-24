package com.mjvSchool.biblioteca.Service;


import com.mjvSchool.biblioteca.model.Entidade;
import com.mjvSchool.biblioteca.repository.EntidadeRepository;
import com.mjvSchool.biblioteca.repository.EntidadeTipoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class EntidadeService {

    @Autowired
    private EntidadeRepository repository;
    @Autowired
    private EntidadeTipoRepository repositoryTipo;

    /*public void salvar(Entidade entidade){
    
        boolean possuiTipo = repositoryTipo.existsById(entidade.getEntidadeTipo().getId());
		if(possuiTipo)
			repository.save(entidade);
		else
			System.out.println("Entidade não possui um tipo");
    }*/

        @Transactional
        public Entidade save(@RequestBody Entidade entidade) {
            return repository.save(entidade);
        }

        @Transactional
        public Entidade update(@RequestBody Entidade livro) {
            return repository.save(livro);
        }

        public void delete(Integer id) {
            repository.deleteById(id);
        }

        @Transactional(readOnly = true)
        public List<Entidade> findAll() {
            repository.findAll();
            return repository.findAll();
        }

 
    
}
