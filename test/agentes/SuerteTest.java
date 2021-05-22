package agentes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SuerteTest {
	
	private Jugador jugador;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		jugador = new agentes.Jugador("Jugador 1", 200, 0, null, false, false, 0);
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testLlamarSuerte() {
//		int dineroInicial = jugador.getDinero();
//		int i = 0;
//		while (i < 100) {
//			Suerte.llamarSuerte(jugador);
//		}
//		assert(jugador.getDinero() != dineroInicial);
//	}

	@Test
	public void testSalida() {
		int dineroInicial = jugador.getDinero();
		Suerte.salida(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testUltima() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrime() {
		fail("Not yet implemented");
	}

	@Test
	public void testRara() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testDividendo() {
		fail("Not yet implemented");
	}

	@Test
	public void testLcarcel() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetro() {
		fail("Not yet implemented");
	}

	@Test
	public void testVeCarcel() {
		fail("Not yet implemented");
	}

	@Test
	public void testReforma() {
		fail("Not yet implemented");
	}

	@Test
	public void testImpuesto() {
		fail("Not yet implemented");
	}

	@Test
	public void testPriEsta() {
		fail("Not yet implemented");
	}

	@Test
	public void testCo50() {
		fail("Not yet implemented");
	}

	@Test
	public void testGana() {
		fail("Not yet implemented");
	}

	@Test
	public void testGana2() {
		fail("Not yet implemented");
	}

}
