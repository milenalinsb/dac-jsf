package com.br.dac.projeto.DACJSF.controller.response;

import lombok.*;

@Builder @NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class PessoaResponse {

    private String nome;
    private String cpf;
}
