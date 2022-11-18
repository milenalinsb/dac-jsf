package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.request.ConverterDependenteRequest;
import com.br.dac.projeto.DACJSF.controller.request.UpdateDependenteRequest;
import com.br.dac.projeto.DACJSF.controller.response.DependenteResponse;
import com.br.dac.projeto.DACJSF.domain.Dependente;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.mapper.DependenteMapper;
import com.br.dac.projeto.DACJSF.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversorDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    @Autowired
    private BuscarDependenteService buscarDependenteService;

    @Autowired
    private BuscarPessoaService buscarPessoaService;

    public DependenteResponse converter(Long dependenteId, ConverterDependenteRequest request) {

        Dependente dependente = buscarDependenteService.porId(dependenteId);
        Pessoa pessoa = buscarPessoaService.porId(request.getPessoaId());

        dependente.setPessoa(pessoa);

        dependenteRepository.save(dependente);
        return DependenteMapper.toResponse(dependente);
    }

}
