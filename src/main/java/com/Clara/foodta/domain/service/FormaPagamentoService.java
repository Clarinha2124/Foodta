package com.Clara.foodta.domain.service;

import com.Clara.foodta.domain.model.FormaPagamento;
import com.Clara.foodta.domain.repository.FormaPagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class FormaPagamentoService {
    private FormaPagamentoRepository formaPagamentoRepository;
    public FormaPagamento salvar(FormaPagamento formaPagamento){
        return formaPagamentoRepository.salvar(formaPagamento);
    }
}
