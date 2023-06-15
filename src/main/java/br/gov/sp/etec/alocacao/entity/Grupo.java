package br.gov.sp.etec.alocacao.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column (name = "id_grupo")
		private Long idGrupo;
		private String descricacaoGrupo;
		private Double valorDiariaGrupo;
		private LocalDate dataCriacao;
		private LocalDate dataAtualizacao;
		private boolean status;
		
		
		public Grupo() {
			super(); 
		}
		
		public Grupo(String descricacaoGrupo, Double valorDiariaGrupo, LocalDate dataCriacao, LocalDate dataAtualizacao, Boolean status) {
			super();
			this.descricacaoGrupo = descricacaoGrupo;
			this.valorDiariaGrupo = valorDiariaGrupo;
			this.dataCriacao = dataCriacao;
			this.dataAtualizacao = dataAtualizacao;
			this.status = status;
		}
		
		public Long getidGrupo() {
			return idGrupo;
		}
		public void setidGrupo(Long id) {
			this.idGrupo = id;
		}
		public String getDescricacaoGrupo() {
			return descricacaoGrupo;
		}
		public void setDescricacaoGrupo(String descricacaoGrupo) {
			this.descricacaoGrupo = descricacaoGrupo;
		}
		public Double getValorDiariaGrupo() {
			return valorDiariaGrupo;
		}
		public void setValorDiariaGrupo(Double valorDiariaGrupo) {
			this.valorDiariaGrupo = valorDiariaGrupo;
		}
		public LocalDate getDataCriacao() {
			return dataCriacao;
		}
		public void setDataCriacao(LocalDate dataCriacao) {
			this.dataCriacao = dataCriacao;
		}
		public LocalDate getDataAtualizacao() {
			return dataAtualizacao;
		}
		public void setDataAtualizacao(LocalDate dataAtualizacao) {
			this.dataAtualizacao = dataAtualizacao;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
		
		
		

	


}
