package com.Clara.foodta.infraestructure.repository;


import com.Clara.foodta.domain.model.FormaPagamento;
import com.Clara.foodta.domain.repository.FormaPagamentoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import java.util.List;



@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<FormaPagamento> listar() {
        return manager.createQuery("from FormaPagamento", FormaPagamento.class).getResultList();
    }


    @Override
    public FormaPagamento buscar(Long id) {

        return manager.find(FormaPagamento.class, id);
    }
    @Transactional
    @Override
    public FormaPagamento salvar(FormaPagamento formapagamento) {

        return manager.merge(formapagamento);
    }

    @Transactional
    @Override
    public void remover(long id) {
        FormaPagamento formapagamento = buscar(id);
        if (formapagamento == null){
            throw new EmptyResultDataAccessException(1);
        }
        manager.remove(formapagamento);
    }
}

