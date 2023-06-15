package br.gov.sp.etec.alocacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.alocacao.entity.Carro;
import br.gov.sp.etec.alocacao.entity.Cliente;
import br.gov.sp.etec.alocacao.repository.CarroRepository;
import br.gov.sp.etec.alocacao.repository.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	ClienteRepository repository;
	
	@GetMapping("/cliente")
	public List<Cliente> cliente() {		
		return repository.findAll();
	}
	
	@PostMapping("adicionar-cliente")
	public Cliente addCliente(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@PutMapping("consultar-clientes")
	public Cliente selectCliente(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	

}