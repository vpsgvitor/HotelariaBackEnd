package br.com.vitor.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitor.model.Hospede;
import br.com.vitor.repository.HospedeRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HospedeController {
	
	@Autowired
	HospedeRepository hospedeRepository;
	
	@GetMapping("/Hospede")
	public List<Hospede> listar() {
		return hospedeRepository.findAll();
	}
	
	@PostMapping("/Hospede")
	void addPessoa(@RequestBody Hospede hospede) {
		hospedeRepository.save(hospede);
	}
}