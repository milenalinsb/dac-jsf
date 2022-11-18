package com.br.dac.projeto.DACJSF.repository;

import com.br.dac.projeto.DACJSF.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findAllByCpfContaining(String cpf);

    Optional<Pessoa> findByCpf(String pessoaCpf);
}
