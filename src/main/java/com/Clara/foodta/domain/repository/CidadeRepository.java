package com.Clara.foodta.domain.repository;

import com.Clara.foodta.domain.model.Cidade;
import com.Clara.foodta.domain.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


    @Repository
    public interface CidadeRepository extends JpaRepository<Cidade, Long> {


        @Query("from Cidade r join fetch r.estado")
        List<Cidade> findAll();

    }

