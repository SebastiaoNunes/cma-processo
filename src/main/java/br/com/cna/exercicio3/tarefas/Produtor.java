package br.com.cna.exercicio3.tarefas;

import java.util.concurrent.BlockingQueue;

public class Produtor implements Runnable{

	private BlockingQueue<String> fila;
	private int nroElementos;
	
	public Produtor(BlockingQueue<String> fila, int nroElementos) {
		this.fila = fila;
		this.nroElementos = nroElementos;
	}
	
	public void run() {
		for (int i = 0 ; i < nroElementos; i++) {
			try {
				System.out.println("Thread: " + Thread.currentThread().getName() + " adicionando: " + i);
				fila.put(String.valueOf(i));
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
