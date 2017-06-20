package br.com.cna.exercicio1.serializador;

import br.com.cna.exercicio1.model.Empregado;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;

public class SerializadorService {
    
	private Serializador serializador;
	
	public SerializadorService(Serializador serializador) {
		this.serializador = serializador;
	}
	
	public long serializarDeserializar(List<Empregado> empregados) throws JsonProcessingException, IOException {
		Calendar inicio = Calendar.getInstance();
		
		for (Empregado empregado: empregados) {
			String empregadoSerializado = serializador.serializar(empregado);
			serializador.deserializar(empregadoSerializado);
		}
		
		Calendar fim = Calendar.getInstance();
		
		return (fim.getTimeInMillis() - inicio.getTimeInMillis());
	}
}
