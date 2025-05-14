package com.Clara.foodta.domain.repository;

import com.Clara.foodta.domain.model.Estado;
import com.Clara.foodta.domain.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


    @Repository
    public interface EstadoRepository extends JpaRepository<Estado, Long> {



    }

