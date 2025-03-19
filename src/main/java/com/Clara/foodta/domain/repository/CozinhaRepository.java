package com.Clara.foodta.domain.repository;

import com.Clara.foodta.domain.model.Cozinha;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CozinhaRepository {
    List<Cozinha> listar();
    Cozinha buscar (Long id);
    Cozinha salvar (Cozinha cozinha);
    void remover(long id);
}
