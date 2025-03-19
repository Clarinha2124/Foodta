package com.Clara.foodta.infraestructure.repository;

import com.Clara.foodta.domain.model.Cidade;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;

public class CidadeRepositoryImpl {
    @Component
    public class CidadeRepoitoryImpl implements CidadeRepository {

        @PersistenceContext
        private EntityManager manager;

        @Override
        public List<Cidade> listar() {
            return manager.createQuery("from Cidade", Cidade.class).getResultList();
        }

        @Override
        public Cidade buscar(Long id) {
            return null;
        }

        @Override
        public Cidade salvar(Cidade cidade) {
            return null;
        }



        @Override
        public void remover(long id) {

        }
    }
}
