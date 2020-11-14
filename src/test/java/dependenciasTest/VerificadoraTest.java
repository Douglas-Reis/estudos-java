package dependenciasTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import dependencias.Verificadora;

public class VerificadoraTest {

	@Test
	public void testPalindromo() {
		fail("Not yet implemented");
	}

	@Test
	public void testAnoBissexto() {
		Verificadora verificadora = new Verificadora();
		
		assertEquals("Caso 1", true, verificadora.AnoBissexto("2020"));
		
	}

	@Test
	public void testVerificaVoto() {
		fail("Not yet implemented");
	}

	@Test
	public void testVerificaNumero() {
		fail("Not yet implemented");
	}

}
