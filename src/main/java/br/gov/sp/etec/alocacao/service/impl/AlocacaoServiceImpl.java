package br.gov.sp.etec.alocacao.service.impl;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etec.alocacao.dto.AlocacaoDto;
import br.gov.sp.etec.alocacao.entity.Alocacao;

import br.gov.sp.etec.alocacao.entity.Cliente;

import br.gov.sp.etec.alocacao.entity.Carro;
import br.gov.sp.etec.alocacao.repository.AlocacaoRepository;
import br.gov.sp.etec.alocacao.repository.CarroRepository;
import br.gov.sp.etec.alocacao.repository.ClienteRepository;
import br.gov.sp.etec.alocacao.service.AlocacaoService;


@Service
public class AlocacaoServiceImpl implements AlocacaoService{

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	CarroRepository carroRepository;
	
	@Autowired
	AlocacaoRepository alocacaoRepository;
	
	@Override
	public Alocacao calcular(AlocacaoDto alocacaoDto) {
		
		Cliente cliente = clienteRepository.findById(alocacaoDto.getIdCliente()).get() ;
		
		Carro carro = carroRepository.findById(alocacaoDto.getIdCarro()).get();
		
		Alocacao alocacao = new Alocacao();
		alocacao.setCarro(carro);
		alocacao.setCliente(cliente);
		Period periodo = Period.between(LocalDate.parse(alocacaoDto.getDataInicioAlocacao()),
										LocalDate.parse(alocacaoDto.getDataFimAlocacao()));
		Double valorAlocacao = carro.getGrupo().getValorDiariaGrupo() * periodo.getDays();
		alocacao.setValorAlocacao(valorAlocacao);
		return alocacaoRepository.save(alocacao);
	}

	
	
}
