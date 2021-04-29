package br.senai.sp.jandira.viagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.jandira.viagem.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
	Estado findBySigla(String sigla);
}
