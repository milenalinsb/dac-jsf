package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.request.PessoaRequest;
import com.br.dac.projeto.DACJSF.controller.request.UpdatePessoaRequest;
import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.mapper.PessoaMapper;
import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdatePessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private BuscarPessoaService buscarPessoaService;

    public PessoaResponse update(Long pessoaId, UpdatePessoaRequest request) {

        Pessoa pessoa = buscarPessoaService.porId(pessoaId);

        pessoa.setNome(request.getNome());

        pessoaRepository.save(pessoa);
        return PessoaMapper.toResponse(pessoa);
    }
}
