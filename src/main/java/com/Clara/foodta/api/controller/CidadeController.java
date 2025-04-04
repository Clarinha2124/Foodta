package com.Clara.foodta.api.controller;

import com.Clara.foodta.domain.model.Cidade;
import com.Clara.foodta.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


    @RestController
    @RequestMapping("/cidades")
    public class CidadeController {

        @Autowired
        private CidadeRepository cidadeRepository;

        @GetMapping
        public List<Cidade> listar(){
            return cidadeRepository.listar();
        }
    }

