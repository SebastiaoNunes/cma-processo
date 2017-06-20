package br.com.cna.exercicio2.tarefas;

import java.util.concurrent.ConcurrentHashMap;

public class Consumidor implements Runnable {

	private ConcurrentHashMap<String, String> map;

	public Consumidor(ConcurrentHashMap<String, String> map) {
		this.map = map;
	}

	public void run() {
		String key = null;
		while(map.keys().hasMoreElements()) {
			key = map.keys().nextElement();
			map.remove(key);
			System.out.println("Thread : " + Thread.currentThread().getName() + " acessando key: " + key);
		}
	}
}
