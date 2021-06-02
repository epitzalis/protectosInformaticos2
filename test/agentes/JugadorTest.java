package agentes;

import org.junit.Before;
import org.junit.Test;

public class JugadorTest {

	private Jugador jugador;

	@Before
	public void setUp() throws Exception {
		jugador = new agentes.Jugador("Jugador 1", 1200, 0, null, false, false, 0);
	}

	@Test
	public void testAumentarDinero() {
		int dinero1 = jugador.getDinero();
		jugador.aumentarDinero(50);
		int dinero2 = jugador.getDinero();
		assert (dinero1 != dinero2);
	}

	@Test
	public void testDisminuirDinero() {
		int dinero1 = jugador.getDinero();
		jugador.disminuirDinero(50);
		int dinero2 = jugador.getDinero();
		assert (dinero1 != dinero2);
	}

	@Test
	public void testNuevaPosicion() {
		int pos1 = jugador.getPosicion();
		jugador.nuevaPosicion(5);
		int pos2 = jugador.getPosicion();
		assert (pos1 != pos2);
	}

}
