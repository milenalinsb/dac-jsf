package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.request.DependenteRequest;
import com.br.dac.projeto.DACJSF.controller.response.DependenteResponse;
import com.br.dac.projeto.DACJSF.domain.Dependente;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.mapper.DependenteMapper;
import com.br.dac.projeto.DACJSF.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    @Autowired
    private BuscarPessoaService buscarPessoaService;

    public DependenteResponse create(DependenteRequest request) {
        Pessoa pessoa = buscarPessoaService.porId(request.getPessoa());

        Dependente dependente = DependenteMapper.toEntity(request);
        dependente.setPessoa(pessoa);

        dependenteRepository.save(dependente);

        return DependenteMapper.toResponse(dependente);
    }
}
