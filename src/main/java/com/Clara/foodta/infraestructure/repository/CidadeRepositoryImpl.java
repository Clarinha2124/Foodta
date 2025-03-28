package com.Clara.foodta.infraestructure.repository;

import com.Clara.foodta.domain.model.Cidade;
import com.Clara.foodta.domain.model.Cozinha;
import com.Clara.foodta.domain.repository.CidadeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;



    @Component
    public class CidadeRepositoryImpl implements CidadeRepository {

        @PersistenceContext
        private EntityManager manager;

        @Override
        public List<Cidade> listar() {
            return manager.createQuery("from Cidade", Cidade.class).getResultList();
        }

        @Override
        public Cidade buscar(Long id) {
            return manager.find(Cidade.class, id);
        }
        @Transactional
        @Override
        public Cidade salvar(Cidade cidade) {
            return manager.merge(cidade);
        }


        @Transactional
        @Override
        public void remover(long id) {
            Cidade cidade = buscar(id);
            manager.remove(cidade);
        }
    }



