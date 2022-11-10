package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.request.UpdateDependenteRequest;
import com.br.dac.projeto.DACJSF.controller.request.UpdatePessoaRequest;
import com.br.dac.projeto.DACJSF.controller.response.DependenteResponse;
import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.domain.Dependente;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.mapper.DependenteMapper;
import com.br.dac.projeto.DACJSF.mapper.PessoaMapper;
import com.br.dac.projeto.DACJSF.repository.DependenteRepository;
import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    @Autowired
    private BuscarDependenteService buscarDependenteService;

    public DependenteResponse update(Long dependenteId, UpdateDependenteRequest request) {

        Dependente dependente = buscarDependenteService.porId(dependenteId);

        dependente.setNome(request.getNome());
        dependente.setDataNascimento(request.getDataNascimento());

        dependenteRepository.save(dependente);
        return DependenteMapper.toResponse(dependente);
    }
}
