package com.br.dac.projeto.DACJSF.controller.response;

import com.br.dac.projeto.DACJSF.domain.Pessoa;
import lombok.*;

import java.time.LocalDate;

@Builder @NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class DependenteResponse {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private Pessoa pessoa;
}

