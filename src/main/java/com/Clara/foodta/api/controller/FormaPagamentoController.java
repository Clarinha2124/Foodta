package com.Clara.foodta.api.controller;

import com.Clara.foodta.domain.model.FormaPagamento;
import com.Clara.foodta.domain.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


    @RestController
    @RequestMapping("/formapagamentos")
    public class FormaPagamentoController {

        @Autowired
        private FormaPagamentoRepository formapagamentoRepository;

        @GetMapping
        public List<FormaPagamento> listar(){
            return formapagamentoRepository.listar();
        }


        @GetMapping("/{formapagamentoId}")
        public ResponseEntity<FormaPagamento> buscar(@PathVariable Long formapagamentoId){
            FormaPagamento formapagamento = formapagamentoRepository.buscar(formapagamentoId);

            if (formapagamento != null){
                return ResponseEntity.ok(formapagamento);
            }

            return ResponseEntity.notFound().build();
        }
}
