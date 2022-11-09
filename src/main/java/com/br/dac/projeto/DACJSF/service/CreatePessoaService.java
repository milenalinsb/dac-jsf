package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.request.PessoaRequest;
import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.mapper.PessoaMapper;
import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaResponse create(PessoaRequest request) {
        Pessoa pessoa = PessoaMapper.toEntity(request);

        pessoaRepository.save(pessoa);

        return PessoaMapper.toResponse(pessoa);
    }
}
