package com.mjvSchool.biblioteca.Service;


import com.mjvSchool.biblioteca.model.Entidade;
import com.mjvSchool.biblioteca.repository.EntidadeRepository;
import com.mjvSchool.biblioteca.repository.EntidadeTipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EntidadeService {

    @Autowired
    private EntidadeRepository repository;
    @Autowired
    private EntidadeTipoRepository repositoryTipo;

    public void salvar(Entidade entidade){
    
        boolean possuiTipo = repositoryTipo.existsById(entidade.getEntidadeTipo().getId());
		if(possuiTipo)
			repository.save(entidade);
		else
			System.out.println("Entidade não possui um tipo");
    }
    
}
