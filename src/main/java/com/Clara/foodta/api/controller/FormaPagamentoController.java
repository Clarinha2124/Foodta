package com.Clara.foodta.api.controller;

import com.Clara.foodta.domain.model.FormaPagamento;
import com.Clara.foodta.domain.repository.FormaPagamentoRepository;
import com.Clara.foodta.domain.service.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


    @RestController
    @RequestMapping("/formapagamentos")
    public class FormaPagamentoController {

        @Autowired
        private FormaPagamentoRepository formapagamentoRepository;

        @Autowired
        private FormaPagamentoService formaPagamentoService;


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
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public FormaPagamento adicionar (@RequestBody FormaPagamento formapagamento){
            return formaPagamentoService.salvar(formapagamento);
        }
}
