package br.gov.sp.etec.alocacao.dto;

public class AlocacaoDto {

	private Long idCliente;
	private Long idCarro;
	private String dataInicioAlocacao;
	private String dataFimAlocacao;
	
	
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Long getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(Long idCarro) {
		this.idCarro = idCarro;
	}
	public String getDataInicioAlocacao() {
		return dataInicioAlocacao;
	}
	public void setDataInicioAlocacao(String dataInicioAlocacao) {
		this.dataInicioAlocacao = dataInicioAlocacao;
	}
	public String getDataFimAlocacao() {
		return dataFimAlocacao;
	}
	public void setDataFimAlocacao(String dataFimAlocacao) {
		this.dataFimAlocacao = dataFimAlocacao;
	}
	
	
	
	
	
}
