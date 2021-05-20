package agentes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CartasComunidadTest {
	Jugador jugadorPrueba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//jugadorPrueba = new agentes.Jugador("hola", 200, 0, null, false, false, 0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		jugadorPrueba = new agentes.Jugador("hola", 200, 0, null, false, false, 0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLlamarCaja() {
		fail("Not yet implemented");
	}

	@Test
	public void testSalida() {
		fail("Not yet implemented");
	}

	@Test
	public void testErrorBanco() {
		fail("Not yet implemented");
	}

	@Test
	public void testDentista() {
		CartasComunidad.dentista(jugadorPrueba);
		assertTrue(jugadorPrueba.getDinero()==150);
	}

	@Test
	public void testDividendos() {
		fail("Not yet implemented");
	}

	@Test
	public void testLibreCarcel() {
		fail("Not yet implemented");
	}

	@Test
	public void testCarcel() {
		fail("Not yet implemented");
	}

	@Test
	public void testOpera() {
		fail("Not yet implemented");
	}

	@Test
	public void testDividendo() {
		fail("Not yet implemented");
	}

	@Test
	public void testDevoImp() {
		fail("Not yet implemented");
	}

	@Test
	public void testCumple() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoteria() {
		fail("Not yet implemented");
	}

	@Test
	public void testMulta() {
		fail("Not yet implemented");
	}

	@Test
	public void testEscola() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsultor() {
		fail("Not yet implemented");
	}

	@Test
	public void testReparacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testPremio() {
		fail("Not yet implemented");
	}

}
