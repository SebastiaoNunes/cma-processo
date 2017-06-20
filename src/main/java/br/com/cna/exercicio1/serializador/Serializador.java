package br.com.cna.exercicio1.serializador;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import br.com.cna.exercicio1.model.Empregado;

public interface Serializador {

	public String serializar(Empregado empregado) throws JsonProcessingException, IOException;
	public Empregado deserializar(String empregado) throws JsonProcessingException, IOException;
}
