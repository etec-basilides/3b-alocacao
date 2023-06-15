package br.gov.sp.etec.alocacao.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.alocacao.entity.Carro;
import br.gov.sp.etec.alocacao.entity.Grupo;
import br.gov.sp.etec.alocacao.repository.CarroRepository;
import br.gov.sp.etec.alocacao.repository.GrupoRepository;

@RestController
public class GrupoController {

	@Autowired /*Cria a instancia do projeto, injesta um objeto, no caso é o grupoRepository*/
	private GrupoRepository repository;
	
	@GetMapping("/grupos")
	public ResponseEntity<?> listarGrupo() {		
		 List<Grupo> grupos = repository.findAll();
		 return new ResponseEntity(grupos,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("adicionar-grupo")
	public Grupo addGrupo(@RequestBody Grupo grupo) {
		grupo.setDataCriacao(LocalDate.now());
		grupo.setDataAtualizacao(LocalDate.now());
		return repository.save(grupo);
	}
	
	@PutMapping("atualizar-grupo")
	public Grupo updateGrupo(@RequestBody Grupo grupo) {
		return repository.save(grupo);
	}
	
	@DeleteMapping("deletar-grupo/{id}")
	public void deleteGrupo(@PathVariable long id) {
		repository.deleteById(id);
	}

}