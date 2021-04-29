package br.senai.sp.jandira.viagem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.jandira.viagem.model.Destino;
import br.senai.sp.jandira.viagem.repository.DestinoRepository;

@RestController
@RequestMapping("/api")
public class DestinoController {
	@Autowired
	private DestinoRepository destinoRepository;

	@GetMapping("/destinos")
	private List<Destino> getAll() {
		return destinoRepository.findAll();
	}

	@GetMapping("/destinos/{id}")
	private Destino getDestino(@PathVariable Long id) {
		return destinoRepository.findById(id).get();
	}

	@PostMapping("/destinos")
	@ResponseStatus(code = HttpStatus.CREATED)
	private Destino saveDestino(@RequestBody Destino destino) {
		return destinoRepository.save(destino);
	}
	
	@PutMapping("/destinos")
	private Destino updateDestino(@RequestBody Destino destino) {
		return destinoRepository.save(destino);
	}
	@DeleteMapping("/destino/{id}")
	private void deleteDestino(@PathVariable Long id) {
		 destinoRepository.deleteById(id);
	}
}
