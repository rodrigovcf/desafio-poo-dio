package br.com.desafio.dominio;

import java.time.LocalDate;

public class Ofertante {
	
	String nome;
	String cidade;
	LocalDate dataOferta;
	
	public Ofertante() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public LocalDate getDataOferta() {
		return dataOferta;
	}
	public void setDataOferta(LocalDate dataOferta) {
		this.dataOferta = dataOferta;
	}
	
	
}
