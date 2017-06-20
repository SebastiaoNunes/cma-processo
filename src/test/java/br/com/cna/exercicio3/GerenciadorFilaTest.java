package br.com.cna.exercicio3;

import org.junit.*;
import br.com.cna.exercicio3.tarefas.GerenciadorFila;

public class GerenciadorFilaTest {

	@Test
	public void deveConsumirTodosElementosDaFila() throws InterruptedException {
		GerenciadorFila gerenciador = new GerenciadorFila();
		gerenciador.processarFilaCom(20);
		
		Thread.sleep(100000);
	}
}
