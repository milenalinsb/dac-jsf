package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.domain.Dependente;
import com.br.dac.projeto.DACJSF.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class BuscarDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    public Dependente porId(Long dependenteId) {
        return dependenteRepository.findById(dependenteId)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Dependente não encontrado"));
    }
}
