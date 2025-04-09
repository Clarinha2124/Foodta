package com.Clara.foodta.domain.service;

import com.Clara.foodta.domain.model.Cidade;
import com.Clara.foodta.domain.repository.CidadeRepository;
import org.springframework.stereotype.Service;
@Service
public class CidadeService {

    private CidadeRepository cidadeRepository;
    public Cidade salvar(Cidade cidade){
        return cidadeRepository.salvar(cidade);
    }
}


