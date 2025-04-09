package com.Clara.foodta.domain.service;

import com.Clara.foodta.domain.model.Estado;
import com.Clara.foodta.domain.repository.EstadoRepository;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
    private EstadoRepository estadoRepository;
    public Estado salvar(Estado estado){
        return estadoRepository.salvar(estado);
    }
}