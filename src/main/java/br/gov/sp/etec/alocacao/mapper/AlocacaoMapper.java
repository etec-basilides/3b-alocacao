package br.gov.sp.etec.alocacao.mapper;

import br.gov.sp.etec.alocacao.dto.CarroDto;
import br.gov.sp.etec.alocacao.entity.Carro;

public class AlocacaoMapper {
	
	public static Carro fromToEntity(CarroDto dto) {
		Carro c = new Carro();
		c.setChassi(dto.getChassi());
		c.setCor(dto.getCor());
		c.setModelo(dto.getModelo());
		c.setPlaca(dto.getPlaca());
		return c;
	}
	
	
}
