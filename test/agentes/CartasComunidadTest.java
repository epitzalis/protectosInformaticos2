package agentes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CartasComunidadTest {
	
	private Jugador jugador;
	
	@Before
	public void setUp() throws Exception {
		jugador = new agentes.Jugador("Jugador 1", 200, 0, null, false, false, 0);
	}

	//@Test
	//public void testLlamarCaja() {
	//	fail("Not yet implemented");
	//}

	@Test
	public void testSalida() {
		CartasComunidad.salida(jugador);
		int posicionNueva = jugador.getPosicion();
		assert(posicionNueva == 1);
	}

	@Test
	public void testErrorBanco() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.errorBanco(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testDentista() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.dentista(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testDividendos() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.dividendos(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testLibreCarcel() {
		boolean tarjetaInicio = jugador.isTargetalibre();
		CartasComunidad.libreCarcel(jugador);
		boolean tarjetaFinal = jugador.isTargetalibre();
		assert(tarjetaInicio != tarjetaFinal);
	}

	@Test
	public void testCarcelPosición() {
		CartasComunidad.carcel(jugador);
		int posicionNueva = jugador.getPosicion();
		assert(posicionNueva == 11);
	}
	@Test
	public void testCarcelIndice() {
		CartasComunidad.carcel(jugador);
		assert(jugador.isCarcel() == true);
	}

	//@Test
	//public void testOpera() {
	//	fail("Not yet implemented");
	//}

	@Test
	public void testDividendo() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.dividendo(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testDevoImp() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.devoImp(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	//@Test
	//public void testCumple() {
	//	fail("Not yet implemented");
	//}

	@Test
	public void testLoteria() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.loteria(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testMulta() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.multa(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testEscola() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.escola(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testConsultor() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.consultor(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testReparacion() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.reparacion(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial == dineroFinal);
	}

	@Test
	public void testPremio() {
		int dineroInicial = jugador.getDinero();
		CartasComunidad.premio(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

}
