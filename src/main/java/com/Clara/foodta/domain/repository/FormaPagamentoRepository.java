package com.Clara.foodta.domain.repository;

import com.Clara.foodta.domain.model.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {

}
