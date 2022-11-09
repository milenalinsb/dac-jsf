package com.br.dac.projeto.DACJSF.controller;

import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.service.ListarPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private ListarPessoaService listarPessoaService;

    @GetMapping
    public List<PessoaResponse> listar(){
        return listarPessoaService.listar();
    }
}
