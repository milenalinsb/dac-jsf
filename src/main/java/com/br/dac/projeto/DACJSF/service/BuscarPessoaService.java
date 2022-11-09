package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class BuscarPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa porId(Long pessoaId) {
        return pessoaRepository.findById(pessoaId)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Pessoa não encontrado"));
    }
}
