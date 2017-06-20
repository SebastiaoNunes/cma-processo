package br.com.cna.exercicio1.serializador;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import br.com.cna.exercicio1.model.Empregado;

public class GsonSerializador implements Serializador {

	private Gson gson = new Gson();
	
	public String serializar(Empregado empregado) {
		return gson.toJson(empregado);
	}

	public Empregado deserializar(String empregado) throws JsonProcessingException, IOException {
		return gson.fromJson(empregado, Empregado.class);
	}
}

