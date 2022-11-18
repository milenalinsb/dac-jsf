package com.br.dac.projeto.DACJSF.controller.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class UpdateDependenteRequest {

    private String nome;
    private LocalDate dataNascimento;
}