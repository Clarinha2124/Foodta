package com.Clara.foodta.domain.service;

import com.Clara.foodta.domain.model.Restaurante;
import com.Clara.foodta.domain.repository.RestauranteRepository;
import org.springframework.stereotype.Service;

@Service
public class RestauranteService {
    private RestauranteRepository RestauranteRepository;

    public Restaurante salvar(Restaurante restaurante) {
        return RestauranteRepository.salvar(restaurante);
    }
}
