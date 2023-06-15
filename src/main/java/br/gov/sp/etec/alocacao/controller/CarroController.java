package br.gov.sp.etec.alocacao.controller;
import br.gov.sp.etec.alocacao.dto.CarroDto;
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
import br.gov.sp.etec.alocacao.entity.Grupo;
import br.gov.sp.etec.alocacao.mapper.AlocacaoMapper;
import br.gov.sp.etec.alocacao.repository.CarroRepository;
import br.gov.sp.etec.alocacao.repository.GrupoRepository;

@RestController
public class CarroController {

	@Autowired
	CarroRepository repository;
	
	@Autowired
	GrupoRepository grupoRepository;

	
	@GetMapping("/carros")
	public List<Carro> carros() {		
		return repository.findAll();
	}
	
	@PostMapping("adicionar-carro")
	public Carro addCarro(@RequestBody CarroDto dto) {
		Carro carroEntrada = AlocacaoMapper.fromToEntity(dto);
		Grupo grupo = grupoRepository.findById(dto.getIdGrupo()).get();
		carroEntrada.setGrupo(grupo);
		return repository.save(carroEntrada);
	}
	
	@PutMapping("atualizar-carro")
	public Carro updateCarro(@RequestBody Carro carro) {
		return repository.save(carro);
	}
	
	@DeleteMapping("deletar-carro/{id}")
	public void deleteCarro(@PathVariable long id) {
		repository.deleteById(id);
	}

}