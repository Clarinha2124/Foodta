package com.Clara.foodta.infraestructure.repository;

import com.Clara.foodta.domain.model.Cidade;
import com.Clara.foodta.domain.model.Estado;
import com.Clara.foodta.domain.repository.EstadoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EstadoRepositoryImpl implements EstadoRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Estado> listar() {
        return manager.createQuery("from Estado", Estado.class).getResultList();
    }

    @Override
    public Estado buscar(Long id) {
        return manager.find(Estado.class, id);
    }
@Transactional
    @Override
    public Estado salvar(Estado estado) {
    return manager.merge(estado);
    }


@Transactional
    @Override
    public void remover(long id) {
        Estado estado= buscar(id);
        manager.remove(estado);
    }
}
