package com.br.dac.projeto.DACJSF.mapper;

import com.br.dac.projeto.DACJSF.controller.request.PessoaRequest;
import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.domain.Pessoa;

public class PessoaMapper {

    public static Pessoa toEntity(PessoaRequest request) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(request.getNome());
        pessoa.setCpf(request.getCpf());
        return pessoa;
    }

    public static PessoaResponse toResponse(Pessoa pessoa) {

        return PessoaResponse.builder()
                .nome(pessoa.getNome())
                .cpf(pessoa.getCpf())
                .build();
    }
}
