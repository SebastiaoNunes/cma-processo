package br.com.cna.exercicio1;

import br.com.cna.exercicio1.serializador.JacksonSerializador;
import br.com.cna.exercicio1.serializador.GsonSerializador;
import br.com.cna.exercicio1.serializador.SerializadorService;
import br.com.cna.exercicio1.model.Empregado;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import com.fasterxml.jackson.core.JsonProcessingException;

public class SerializadorServiceTest {

	@Test
	public void deveSerializarDeserializarEmpregados() throws JsonProcessingException, IOException {
		SerializadorService jacksonSerializador = new SerializadorService(new JacksonSerializador());
		SerializadorService gsonSerializador = new SerializadorService(new GsonSerializador());
		
		long jackasonTime = jacksonSerializador.serializarDeserializar(empregados());
		long gsonTime = gsonSerializador.serializarDeserializar(empregados());
		
		System.out.println("Tempo para o Jackson serializar e deserializar: " + jackasonTime);
		System.out.println("Tempo para o gson serializar e deserializar: " + gsonTime);
	}
	
	List<Empregado> empregados() {
		List<Empregado> empregados = new ArrayList<Empregado>();
		
		for (int i=0; i < 5000; i++) { 
			Empregado empregado = new Empregado();
			empregado.setId(i);
			empregado.setNome("Empregado" + 1);
			empregados.add(empregado);
		}
		
		return empregados;
	}
}
