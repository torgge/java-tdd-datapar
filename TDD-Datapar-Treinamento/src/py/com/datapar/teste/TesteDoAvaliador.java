package br.com.bonespirito.teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.com.bonespirito.leilao.Avaliador;
import br.com.bonespirito.leilao.Lance;
import br.com.bonespirito.leilao.Leilao;
import br.com.bonespirito.leilao.Usuario;

public class TesteDoAvaliador {

	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		// Cenário
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Playstation 4");
		
		leilao.propoe(new Lance(joao, 250));
		leilao.propoe(new Lance(jose, 300));
		leilao.propoe(new Lance(maria, 400));
		
		// Ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);		
		
		// Validação
		double maiorEsperado = 400;
		double menorEsperado = 250;

		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
	}

}
