package com.Clara.foodta.domain.service;

import com.Clara.foodta.domain.exception.EntidadeEmUsoException;
import com.Clara.foodta.domain.exception.EntidadeNaoEncontradaException;
import com.Clara.foodta.domain.model.FormaPagamento;
import com.Clara.foodta.domain.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class FormaPagamentoService {
    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;
    public FormaPagamento salvar(FormaPagamento formaPagamento){
        return formaPagamentoRepository.save(formaPagamento);}
        public void excluir (Long id){
            try{
                formaPagamentoRepository.deleteById(id);
            }
            catch (DataIntegrityViolationException e){
                throw new EntidadeEmUsoException(String.format("Forma de Pagamento ou código %d não pode ser removida, pois está em uso.", id));
            }
            catch (EmptyResultDataAccessException e){
                throw new EntidadeNaoEncontradaException(String.format("Não existe cadastro de Forma de Pagamento  com código %d", id));
            }
    }
}
