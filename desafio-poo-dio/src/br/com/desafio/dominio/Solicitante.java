package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Solicitante {
	
	private String nome;
	private Set<Carona> caronasSolicitadas = new LinkedHashSet<>();
	private Set<Carona> caronasConcluidas = new LinkedHashSet<>();
	
	public void solicitarCarona(Oferta oferta) {
		this.caronasSolicitadas.addAll(oferta.getCaronas());
		oferta.getSolicitacoes().add(this);
	}
	
	public void progredir() {
		Optional<Carona> carona = this.caronasSolicitadas.stream().findFirst();
		if(carona.isPresent()) {
			this.caronasConcluidas.add(carona.get());
			this.caronasSolicitadas.remove(carona.get());
		}else {
			System.err.println("Você não está associado em nenhuma carona!");
		}
	}
	
	/*
	 * Quando concluir solicitacao
	 */
	public double calcularXp() {
		return this.caronasConcluidas
				.stream()
				.mapToDouble(carona -> carona.calcular_xp())
				.sum();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Carona> getCaronasSolicitadas() {
		return caronasSolicitadas;
	}
	public void setCaronasSolicitadas(Set<Carona> caronasSolicitadas) {
		this.caronasSolicitadas = caronasSolicitadas;
	}
	public Set<Carona> getCaronasConcluidas() {
		return caronasConcluidas;
	}
	public void setCaronasConcluidas(Set<Carona> caronasConcluidas) {
		this.caronasConcluidas = caronasConcluidas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caronasConcluidas == null) ? 0 : caronasConcluidas.hashCode());
		result = prime * result + ((caronasSolicitadas == null) ? 0 : caronasSolicitadas.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Solicitante other = (Solicitante) obj;
		if (caronasConcluidas == null) {
			if (other.caronasConcluidas != null)
				return false;
		} else if (!caronasConcluidas.equals(other.caronasConcluidas))
			return false;
		if (caronasSolicitadas == null) {
			if (other.caronasSolicitadas != null)
				return false;
		} else if (!caronasSolicitadas.equals(other.caronasSolicitadas))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
}
