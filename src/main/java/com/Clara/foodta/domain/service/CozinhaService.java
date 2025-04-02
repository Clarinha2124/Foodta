package com.Clara.foodta.domain.service;


import com.Clara.foodta.domain.model.Cozinha;
import com.Clara.foodta.domain.repository.CozinhaRepository;
import org.springframework.stereotype.Service;

@Service
public class CozinhaService {

    private CozinhaRepository cozinhaRepository;
    public Cozinha salvar(Cozinha cozinha){
        return cozinhaRepository.salvar(cozinha);
    }
}
