package com.br.dac.projeto.DACJSF.controller.request;

import com.br.dac.projeto.DACJSF.domain.Pessoa;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class DependenteRequest {

    private String nome;
    private LocalDate dataNascimento;
    private Long pessoa;
}
