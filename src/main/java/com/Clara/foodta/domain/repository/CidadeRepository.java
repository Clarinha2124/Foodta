package com.Clara.foodta.domain.repository;

import com.Clara.foodta.domain.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


    @Repository
    public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    }

