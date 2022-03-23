package br.com.desafio.dominio;

import java.time.LocalDate;

public class Ofertante extends Carona{
	
	LocalDate dataOferta;
	
	public Ofertante() {}
	
	public LocalDate getDataOferta() {
		return dataOferta;
	}
	public void setDataOferta(LocalDate dataOferta) {
		this.dataOferta = dataOferta;
	}

	public double calcular_xp() {
		
		return xp_padrao + 20d;
	}

	public String toString() {
		return "Ofertante {" + 
					"Nome do Ofertante= '" + getNome() + '\'' +	
					"Cidade de Origem= '" + getCidade() + '\'' +	
				    ", Data da Oferta= " + dataOferta +
				    '}'; 
	}
	
	
	
}
