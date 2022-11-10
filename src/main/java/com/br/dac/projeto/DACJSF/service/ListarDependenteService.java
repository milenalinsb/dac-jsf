package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.response.DependenteResponse;
import com.br.dac.projeto.DACJSF.mapper.DependenteMapper;
import com.br.dac.projeto.DACJSF.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class ListarDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    public List<DependenteResponse> readAll() {
        return dependenteRepository.findAll().stream().map(DependenteMapper::toResponse).collect(toList());
    }

    public DependenteResponse readOnly(Long id) {
        return dependenteRepository.findById(id).map(DependenteMapper::toResponse)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Dependente não encontrado"));
    }
}
