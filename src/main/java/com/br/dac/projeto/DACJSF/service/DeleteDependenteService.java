package com.br.dac.projeto.DACJSF.service;

import com.br.dac.projeto.DACJSF.domain.Dependente;
import com.br.dac.projeto.DACJSF.domain.Pessoa;
import com.br.dac.projeto.DACJSF.repository.DependenteRepository;
import com.br.dac.projeto.DACJSF.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    public void delete(Long dependenteId) {

        dependenteRepository.deleteById(dependenteId);
    }
}
