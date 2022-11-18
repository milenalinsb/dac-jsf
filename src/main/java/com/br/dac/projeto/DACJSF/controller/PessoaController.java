package com.br.dac.projeto.DACJSF.controller;

import com.br.dac.projeto.DACJSF.controller.request.PessoaRequest;
import com.br.dac.projeto.DACJSF.controller.request.UpdatePessoaRequest;
import com.br.dac.projeto.DACJSF.controller.response.PessoaResponse;
import com.br.dac.projeto.DACJSF.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private ListarPessoaService listarPessoaService;

    @Autowired
    private CreatePessoaService createPessoaService;

    @Autowired
    private UpdatePessoaService updatePessoaService;

    @Autowired
    private DeletePessoaService deletePessoaService;

    @Autowired
    private ListarPessoasPeloCpfService listarPessoasPeloCpfService;

    @GetMapping
    public List<PessoaResponse> readAll(){
        return listarPessoaService.readAll();
    }

    @GetMapping("/{pessoaId}")
    public PessoaResponse readOnly(@PathVariable Long pessoaId){
        return listarPessoaService.readOnly(pessoaId);
    }

    @GetMapping("/buscar")
    public List<PessoaResponse> readByCpf(@RequestParam String cpf){
        return listarPessoasPeloCpfService.buscarPorCpf(cpf);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public PessoaResponse create(@Valid @RequestBody PessoaRequest request){
        return createPessoaService.create(request);
    }

    @PutMapping("/{pessoaId}")
    public PessoaResponse update(@PathVariable Long pessoaId, @RequestBody UpdatePessoaRequest request){
        return updatePessoaService.update(pessoaId, request);
    }

    @DeleteMapping("/{pessoaId}")
    public void delete(@PathVariable Long pessoaId){
        deletePessoaService.delete(pessoaId);
    }
}
