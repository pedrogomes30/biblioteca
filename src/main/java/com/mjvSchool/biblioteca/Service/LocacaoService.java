package com.mjvSchool.biblioteca.Service;

import com.mjvSchool.biblioteca.dto.LocacaoDto;
import com.mjvSchool.biblioteca.model.Entidade;
import com.mjvSchool.biblioteca.model.Locacao;
import com.mjvSchool.biblioteca.repository.EntidadeRepository;
import com.mjvSchool.biblioteca.repository.LocacaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocacaoService {

    @Autowired
    private EntidadeRepository entidadeRepository;
    @Autowired
    private LocacaoRepository locacaoRepository;


    public List<Locacao> findAll(){
        return locacaoRepository.findAll();
    }

    public void salvar(LocacaoDto dto) {

        ModelMapper mapper =  new ModelMapper();

        Entidade entidade = entidadeRepository.findById(dto.getClientId()).orElse(null);
        if(entidade!=null) {
            Locacao locacao = mapper.map(dto, Locacao.class);
            locacao.setCliente(entidade);
            locacaoRepository.save(locacao);
        }else {
            System.out.println("entidade não existe");
        }

    }


//
//    public void save(Locacao locacao) {
//    }
//
//    public void deleteById(Integer id) {
//    }
//
//    public Optional<Locacao> findById(Integer id) {
//    }
}
