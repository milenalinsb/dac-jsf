package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.mapper.PessoaMapper;
import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListarPessoasPeloCpfService {

    @Autowired
    private BuscarPessoaPorCpfService buscarPessoaPorCpfService;


    public List<PessoaResponse> buscarPorCpf(String cpf) {

        List<PessoaResponse> pessoasResponse = new ArrayList<>();

        List<Pessoa> pessoas = buscarPessoaPorCpfService.porCpf(cpf);

        pessoas.forEach(pessoa -> {
            PessoaResponse response = PessoaMapper.toResponse(pessoa);
            pessoasResponse.add(response);
        });
        return pessoasResponse;
    }
}
