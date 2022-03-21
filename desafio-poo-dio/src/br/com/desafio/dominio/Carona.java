package br.com.desafio.dominio;

public abstract class Carona {
	
	public static final double xp_padrao = 10d;
	
	private String nome;
	private String cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void getCidade(String cidadeOrig) {
		this.cidade = cidadeOrig;
	}
	
	public abstract double calcular_xp();

}
