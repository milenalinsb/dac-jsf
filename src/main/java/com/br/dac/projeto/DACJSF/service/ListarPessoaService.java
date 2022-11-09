package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.mapper.PessoaMapper;
import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ListarPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaResponse> listar() {
        return pessoaRepository.findAll().stream().map(PessoaMapper::toResponse).collect(toList());
    }
}
