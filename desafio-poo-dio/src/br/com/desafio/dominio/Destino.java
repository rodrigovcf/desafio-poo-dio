package br.com.desafio.dominio;

public class Destino extends Carona{
	
	private int distancia;
	
	public Destino() {}
	
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	/*
	 * XP calculado com base na distancia percorrida
	 */
	public double calcular_xp() {
		
		return xp_padrao * distancia;
	}

	public String toString() {
		return "Destino {" + 
				"Cidade de Destino= '" + getCidade() + '\'' +				
			    ", Distancia em km= '" + getDistancia() + '\'' + 
			    '}'; 
	}
	
	
	
}
