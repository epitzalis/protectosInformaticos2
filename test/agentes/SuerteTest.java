package agentes;

import org.junit.Before;
import org.junit.Test;

public class SuerteTest {
	
	private Jugador jugador;

	@Before
	public void setUp() throws Exception {
		jugador = new Jugador("Jugador 1", 200, 0, null, false, false, 0);
	}

	@Test
	public void testSalida() {
		int dineroInicial = jugador.getDinero();
		Suerte.salida(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testUltima() {
		Suerte.ultima(jugador);
		int posicionNueva = jugador.getPosicion();
		assert(posicionNueva == 40);
	}

	@Test
	public void testPrime() {
		Suerte.prime(jugador);
		int posicionNueva = jugador.getPosicion();
		assert(posicionNueva == 2);
	}

	@Test
	public void testRara() {
		int posicionInicial = jugador.getPosicion();
		Suerte.rara(jugador);
		int posicionNueva = jugador.getPosicion();
		assert(posicionInicial != posicionNueva);
	}

	@Test
	public void testEstacion() {
		int posicionInicial = jugador.getPosicion();
		Suerte.estacion(jugador);
		int posicionNueva = jugador.getPosicion();
		assert(posicionInicial != posicionNueva);
	}

	@Test
	public void testDividendo() {
		int dineroInicial = jugador.getDinero();
		Suerte.dividendo(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testLcarcel() {
		Suerte.Lcarcel(jugador);
		assert(jugador.isTargetalibre());
	}

	@Test
	public void testRetro() {
		int posicionInicial = jugador.getPosicion();
		Suerte.retro(jugador);
		int posicionNueva = jugador.getPosicion();
		assert(posicionInicial != posicionNueva);
	}

	@Test
	public void testVeCarcel() {
		int posicionInicial = jugador.getPosicion();
		Suerte.veCarcel(jugador);
		int posicionNueva = jugador.getPosicion();
		assert(posicionInicial != posicionNueva);
		assert(jugador.isCarcel());
	}

	@Test
	public void testReforma() {
		int dineroInicial = jugador.getDinero();
		Suerte.reforma(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial == dineroFinal);
	}

	@Test
	public void testImpuesto() {
		int dineroInicial = jugador.getDinero();
		Suerte.impuesto(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testPriEsta() {
		int posicionInicial = jugador.getPosicion();
		Suerte.priEsta(jugador);
		int posicionNueva = jugador.getPosicion();
		assert(posicionInicial != posicionNueva);
	}

	@Test
	public void testGana() {
		int dineroInicial = jugador.getDinero();
		Suerte.gana(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

	@Test
	public void testGana2() {
		int dineroInicial = jugador.getDinero();
		Suerte.gana2(jugador);
		int dineroFinal = jugador.getDinero();
		assert(dineroInicial != dineroFinal);
	}

}
