package com.Clara.foodta.domain.service;

import com.Clara.foodta.domain.exception.EntidadeEmUsoException;
import com.Clara.foodta.domain.exception.EntidadeNaoEncontradaException;
import com.Clara.foodta.domain.model.Restaurante;
import com.Clara.foodta.domain.repository.RestauranteRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class RestauranteService {
    private RestauranteRepository RestauranteRepository;

    public Restaurante salvar(Restaurante restaurante) {
        return RestauranteRepository.salvar(restaurante);
    }

    public void excluir(Long id) {
        try {
            RestauranteRepository.remover(id);
        } catch (DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(String.format("Restaurante ou código %d não pode ser removida, pois está em uso.", id));
        } catch (EmptyResultDataAccessException e) {
            throw new EntidadeNaoEncontradaException(String.format("Não existe cadastro de restaurantes com código %d", id));
        }
    }
}