package br.com.cna.exercicio2;

import org.junit.*;
import br.com.cna.exercicio2.tarefas.GerenciadorMap;

public class GerenciadorMapTest {

	@Test
	public void deveAcessarTodosElementosDoMapa() throws InterruptedException {
		GerenciadorMap gerenciador = new GerenciadorMap();
		gerenciador.popularCom(1000);
		
		Thread.sleep(20000);
	}
}
