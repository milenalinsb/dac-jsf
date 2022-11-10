package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void delete(Long pessoaId) {

        pessoaRepository.deleteById(pessoaId);
    }
}
