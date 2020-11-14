package dependenciasTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import dependencias.Verificadora;

public class VerificadoraTest {
	
	Verificadora verificadora = new Verificadora();
	
	@Before
	public void start() {
		
		verificadora = new Verificadora();
	}
	
	@Test
	public void testPalindromo() {

		 boolean caso1 = verificadora.Palindromo("A cara rajada da jararaca");
		 boolean caso2 = verificadora.Palindromo("sol");
		 
		 assertTrue(caso1);
		 assertFalse(caso2);
	}
	
	@Test
	public void testAnoBissexto() {
		
		 boolean caso1 = verificadora.AnoBissexto("2020");
		 boolean caso2 = verificadora.AnoBissexto("2019");
		 
		 assertTrue(caso1);
		 assertFalse(caso2);
	}
	
	@Test
	public void testVerificaVoto() {
		
		String caso1 = verificadora.VerificaVoto(16);
		String caso2 = verificadora.VerificaVoto(25);
		String caso3 = verificadora.VerificaVoto(15);
		
		assertEquals("O voto é facultativo", caso1);
		assertEquals("O voto é obrigatório", caso2);
		assertEquals("Você não pode voltar", caso3);
	}
	
	@Test
	public void testVerificaNumero() {
		boolean caso1 = verificadora.VerificaNumero(10);
		boolean caso2 = verificadora.VerificaNumero(1);
		 
		assertTrue(caso1);
		assertFalse(caso2);
	}
}