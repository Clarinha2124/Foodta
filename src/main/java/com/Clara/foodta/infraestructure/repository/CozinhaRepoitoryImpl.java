package com.Clara.foodta.infraestructure.repository;

import com.Clara.foodta.domain.model.Cozinha;
import com.Clara.foodta.domain.repository.CozinhaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CozinhaRepoitoryImpl implements CozinhaRepository {

    @PersistenceContext
   private EntityManager manager;

    @Override
    public List<Cozinha> listar() {
        return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
    }

    @Override
    public Cozinha buscar(Long id) {
        return null;
    }

    @Override
    public Cozinha salvar(Cozinha cozinha) {
        return null;
    }



    @Override
    public void remover(long id) {

    }
}
