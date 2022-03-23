package br.com.desafio;

import java.time.LocalDate;

import br.com.desafio.dominio.Destino;
import br.com.desafio.dominio.Oferta;
import br.com.desafio.dominio.Ofertante;
import br.com.desafio.dominio.Solicitante;

public class Main {

	public static void main(String[] args) {
		
		Destino destino1 = new Destino();		
		destino1.setCidade("Fortaleza_CE");		
		destino1.setDistancia(380);
		
		Destino destino2 = new Destino();
		destino2.setCidade("Recife_PE");
		destino2.setDistancia(680);
		
		Ofertante ofertante = new Ofertante();
		ofertante.setNome("Rodrigo");
		ofertante.setCidade("Patos_PB");
		ofertante.setDataOferta(LocalDate.now());
		
		Oferta oferta = new Oferta();
		oferta.setDestino("Salvador_BH");
		oferta.setOrigem("Mossoró_RN");
		oferta.setDiasRet(5);
		oferta.getCaronas().add(destino1);
		oferta.getCaronas().add(destino2);
		oferta.getCaronas().add(ofertante);
		
		Solicitante solPedro = new Solicitante();
		solPedro.setNome("Pedro");	
		solPedro.solicitarCarona(oferta);
		System.out.println("Solicitações Efetivadas Pedro " + solPedro.getCaronasSolicitadas());	
		solPedro.progredir();
		solPedro.progredir();
		System.out.println("-");
		System.out.println("Solicitações Efetivadas Pedro " + solPedro.getCaronasSolicitadas());
		System.out.println("Solicitações Concluídas Pedro " + solPedro.getCaronasConcluidas());
		System.out.println("XP: " + solPedro.calcularXp());

		System.out.println("- - - - - - - -");
		
		Solicitante solJoao = new Solicitante();
		solJoao.setNome("João");		
		solJoao.solicitarCarona(oferta);
		System.out.println("Solicitações Efetivadas Joao " + solJoao.getCaronasSolicitadas());		
		solJoao.progredir();
		System.out.println("-");
		System.out.println("Solicitações Concluídas Joao " + solJoao.getCaronasConcluidas());
		System.out.println("Solicitações Efetivadas Joao " + solJoao.getCaronasSolicitadas());
		System.out.println("XP: " + solJoao.calcularXp());
		
		
		
		
		
		

	}

}
