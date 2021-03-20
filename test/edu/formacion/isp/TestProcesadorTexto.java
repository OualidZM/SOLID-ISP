package edu.formacion.isp;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pingpong.isp.Correcto;
import edu.pingpong.isp.Idioma;
import edu.pingpong.isp.ProcesadorTexto;


public class TestProcesadorTexto {

	@Test
	public void test_simple() {
		
		ProcesadorTexto procesador = new ProcesadorTexto();
		
		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.texto());
	}
	
	@Test
	public void test_con_idioma() {
		
		Correcto procesador = new Correcto();
		
		procesador.nueva("Tengo");
		procesador.nueva("hambre");
		
		assertEquals("Tengo hambre", procesador.texto());
		
		assertTrue(procesador.correcto(Idioma.ES));
	}
}
