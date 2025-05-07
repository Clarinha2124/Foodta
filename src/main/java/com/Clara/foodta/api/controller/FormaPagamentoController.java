package com.Clara.foodta.api.controller;

import com.Clara.foodta.domain.exception.EntidadeEmUsoException;
import com.Clara.foodta.domain.model.Cidade;
import com.Clara.foodta.domain.model.Cozinha;
import com.Clara.foodta.domain.model.FormaPagamento;
import com.Clara.foodta.domain.repository.FormaPagamentoRepository;
import com.Clara.foodta.domain.service.FormaPagamentoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
    @RequestMapping("/formapagamentos")
    public class FormaPagamentoController {

        @Autowired
        private FormaPagamentoRepository formapagamentoRepository;

        @Autowired
        private FormaPagamentoService formaPagamentoService;


        @GetMapping
        public List<FormaPagamento> listar() {
            return formapagamentoRepository.findAll();
        }


        @GetMapping("/{formapagamentoId}")
        public ResponseEntity<FormaPagamento> buscar(@PathVariable Long formapagamentoId) {
            Optional <FormaPagamento> formapagamento = formapagamentoRepository.findById(formapagamentoId);

            if (formapagamento.isPresent()) {
                return ResponseEntity.ok(formapagamento.get());
            }

            return ResponseEntity.notFound().build();
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public FormaPagamento adicionar(@RequestBody FormaPagamento formapagamento) {
            return formaPagamentoService.salvar(formapagamento);
        }

        @PutMapping("/{formapagamentoId}")
        public ResponseEntity<FormaPagamento> atualizar(@PathVariable Long formapagamentoId, @RequestBody FormaPagamento formapagamento) {
           Optional <FormaPagamento> formapagamentoAtual = formapagamentoRepository.findById(formapagamentoId);

            if (formapagamentoAtual != null) {
                BeanUtils.copyProperties(formapagamento, formapagamentoAtual, "id");

               FormaPagamento formapagamentoSalva = formaPagamentoService.salvar(formapagamentoAtual.get());
                return ResponseEntity.ok(formapagamentoSalva);
            }
            return ResponseEntity.notFound().build();
        }

        @DeleteMapping("/{formadePagamentoId}")
        public ResponseEntity<FormaPagamento> remover(@PathVariable Long formadePagamentoId) {
            try {
                formaPagamentoService.excluir(formadePagamentoId);
                return ResponseEntity.notFound().build();
            } catch (EnumConstantNotPresentException e) {
                return ResponseEntity.notFound().build();
            } catch (EntidadeEmUsoException e) {
                return ResponseEntity.status(HttpStatus.CONFLICT).build();
            }
        }
    }