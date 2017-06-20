package br.com.cna.exercicio3.tarefas;

import java.util.concurrent.BlockingQueue;

public class Consumidor implements Runnable {
	
	private BlockingQueue<String> fila;
	
	public Consumidor(BlockingQueue<String> fila) {
		this.fila = fila;
	}

	public void run() {
		try {
			String conteudo = null;
			
			while ((conteudo = fila.take()) != null) {
				System.out.println("Thread : " + Thread.currentThread().getName() + " acessando Valor: " + conteudo);
	        }
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}

