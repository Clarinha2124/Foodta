package com.Clara.foodta.domain.repository;

import com.Clara.foodta.domain.model.FormaPagamento;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FormaPagamentoRepository {
    List<FormaPagamento> listar();
    FormaPagamento buscar (Long id);
    FormaPagamento salvar (FormaPagamento formapagamento);
    void remover(long id);
}
