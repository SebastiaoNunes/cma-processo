package br.com.cna.exercicio2.tarefas;

import java.util.concurrent.ConcurrentHashMap;

public class Produtor implements Runnable {

	private int nroElementos;
	private ConcurrentHashMap<String, String> map;

	public Produtor(ConcurrentHashMap<String, String> map, int nroElementos) {
		this.map = map;
		this.nroElementos = nroElementos;
	}

	public void run() {
		for (int i = 0; i < nroElementos; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " adicionando: " + i);
			map.put(String.valueOf(i), String.valueOf(i));
		}
	}
}
