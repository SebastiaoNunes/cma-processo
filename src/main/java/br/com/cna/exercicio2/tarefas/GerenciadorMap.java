package br.com.cna.exercicio2.tarefas;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GerenciadorMap {
	
	private ExecutorService threadPool;
	private ConcurrentHashMap<String, String> map;
	
	public GerenciadorMap() {
		this.threadPool = Executors.newFixedThreadPool(3);
		this.map = new ConcurrentHashMap<String, String>();
	}
	
	public void popularCom(int nroElementos) {
		threadPool.execute(new Produtor(map, nroElementos));
		threadPool.execute(new Consumidor(map));
		threadPool.execute(new Consumidor(map));
	}
}
