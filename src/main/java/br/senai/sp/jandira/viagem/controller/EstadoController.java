package br.senai.sp.jandira.viagem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.jandira.viagem.model.Estado;
import br.senai.sp.jandira.viagem.repository.EstadoRepository;

@RestController
@RequestMapping("/api")
public class EstadoController {

	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping("/estados") 
	private List<Estado> getAll(){
		return estadoRepository.findAll();
	}
	@GetMapping("/estados/{id}") 
	private Estado getXpto(@PathVariable Long id){
		return estadoRepository.findById(id).get();
	}
	@GetMapping("/estados/sigla/{sigla}")
	private Estado getEstadoPorSigla(@PathVariable String sigla) {
		return estadoRepository.findBySigla(sigla);
	}
	
}
