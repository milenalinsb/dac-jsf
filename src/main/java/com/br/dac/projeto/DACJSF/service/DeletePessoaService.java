package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private BuscarPessoaService buscarPessoaService;

    public void delete(Long pessoaId) {

        Pessoa pessoa = buscarPessoaService.porId(pessoaId);

        pessoaRepository.deleteById(pessoaId);
    }
}
