package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class BuscarPessoaPorCpfService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> porCpf(String cpf) {
        return (pessoaRepository.findAllByCpfContaining(cpf));
    }
}
