package br.com.cna.exercicio3.tarefas;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GerenciadorFila {

	private ExecutorService threadPool;
	private BlockingQueue<String> fila;
	
	public GerenciadorFila() {
		this.threadPool = Executors.newFixedThreadPool(3);
		this.fila = new ArrayBlockingQueue<String>(1);;
	}
	
	public void processarFilaCom(int numeroElementos) {
		threadPool.execute(new Produtor(fila, numeroElementos));
		threadPool.execute(new Consumidor(fila));
		threadPool.execute(new Consumidor(fila));
	}
}
