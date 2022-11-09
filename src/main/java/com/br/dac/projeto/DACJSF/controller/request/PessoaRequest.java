package com.br.dac.projeto.DACJSF.controller.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class PessoaRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String cpf;

}
