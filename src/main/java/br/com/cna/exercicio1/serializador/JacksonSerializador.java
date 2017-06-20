package br.com.cna.exercicio1.serializador;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import br.com.cna.exercicio1.model.Empregado;

public class JacksonSerializador implements Serializador {

	private ObjectMapper objectMapper = new ObjectMapper();
	
	public String serializar(Empregado empregado) throws IOException {
		return objectMapper.writeValueAsString(empregado);
        
	}

	public Empregado deserializar(String empregado) throws JsonProcessingException, IOException {
		return objectMapper.readValue(empregado, Empregado.class);
	}
}
