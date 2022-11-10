package com.br.dac.projeto.DACJSF.controller;

import com.br.dac.projeto.DACJSF.controller.request.DependenteRequest;
import com.br.dac.projeto.DACJSF.controller.request.UpdateDependenteRequest;
import com.br.dac.projeto.DACJSF.controller.response.DependenteResponse;
import com.br.dac.projeto.DACJSF.service.CreateDependenteService;
import com.br.dac.projeto.DACJSF.service.DeleteDependenteService;
import com.br.dac.projeto.DACJSF.service.ListarDependenteService;
import com.br.dac.projeto.DACJSF.service.UpdateDependenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/dependentes")
public class DependenteController {

    @Autowired
    private ListarDependenteService listarDependenteService;

    @Autowired
    private CreateDependenteService createDependenteService;

    @Autowired
    private UpdateDependenteService updateDependenteService;

    @Autowired
    private DeleteDependenteService deleteDependenteService;

    @GetMapping
    public List<DependenteResponse> readAll(){
        return listarDependenteService.readAll();
    }

    @GetMapping("/{dependenteId}")
    public DependenteResponse readOnly(@PathVariable Long dependenteId){
        return listarDependenteService.readOnly(dependenteId);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public DependenteResponse create(@Valid @RequestBody DependenteRequest request){
        return createDependenteService.create(request);
    }

    @PutMapping("/{dependenteId}")
    public DependenteResponse update(@PathVariable Long dependenteId, @RequestBody UpdateDependenteRequest request){
        return updateDependenteService.update(dependenteId, request);
    }

    @DeleteMapping("/{dependenteId}")
    public void delete(@PathVariable Long dependenteId){
        deleteDependenteService.delete(dependenteId);
    }
}
