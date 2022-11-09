package com.br.dac.projeto.DACJSF.repository;

import com.br.dac.projeto.DACJSF.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
