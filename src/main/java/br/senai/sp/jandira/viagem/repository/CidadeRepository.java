package br.senai.sp.jandira.viagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.jandira.viagem.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
