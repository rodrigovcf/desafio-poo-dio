package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Oferta {
	
	private String origem;
	private String destino;
	private int diasRet;
	
	private final LocalDate dataPartida = LocalDate.now();
	private final LocalDate dataRetorno = dataPartida.plusDays(diasRet);
	
	private Set<Solicitante> solicitacoes = new HashSet<>();
	private Set<Carona> caronas = new LinkedHashSet<>();
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getDiasRet() {
		return diasRet;
	}
	public void setDiasRet(int diasRet) {
		this.diasRet = diasRet;
	}
	public Set<Solicitante> getSolicitacoes() {
		return solicitacoes;
	}
	public void setSolicitacoes(Set<Solicitante> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}
	public Set<Carona> getCaronas() {
		return caronas;
	}
	public void setCaronas(Set<Carona> caronas) {
		this.caronas = caronas;
	}
	public LocalDate getDataPartida() {
		return dataPartida;
	}
	public LocalDate getDataRetorno() {
		return dataRetorno;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caronas == null) ? 0 : caronas.hashCode());
		result = prime * result + ((dataPartida == null) ? 0 : dataPartida.hashCode());
		result = prime * result + ((dataRetorno == null) ? 0 : dataRetorno.hashCode());
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + diasRet;
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
		result = prime * result + ((solicitacoes == null) ? 0 : solicitacoes.hashCode());
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
		Oferta other = (Oferta) obj;
		if (caronas == null) {
			if (other.caronas != null)
				return false;
		} else if (!caronas.equals(other.caronas))
			return false;
		if (dataPartida == null) {
			if (other.dataPartida != null)
				return false;
		} else if (!dataPartida.equals(other.dataPartida))
			return false;
		if (dataRetorno == null) {
			if (other.dataRetorno != null)
				return false;
		} else if (!dataRetorno.equals(other.dataRetorno))
			return false;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (diasRet != other.diasRet)
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (solicitacoes == null) {
			if (other.solicitacoes != null)
				return false;
		} else if (!solicitacoes.equals(other.solicitacoes))
			return false;
		return true;
	}
	
	

}
