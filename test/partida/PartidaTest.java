package partida;

import org.junit.Before;
import org.junit.Test;

import agentes.Jugador;

public class PartidaTest {
	
	private Jugador jugador;
	private String nombreJugador = "Jugador 1";

	@Before
	public void setUp() throws Exception {
		jugador = new Jugador(nombreJugador, 200, 0, null, false, false, 0);
		Partida.jugadores = new Jugador[1];
		Partida.jugadores[0] = jugador;
	}

	@Test
	public void testAumentarDineroJugador() {
		int dineroInicial = jugador.getDinero();
		Partida.aumentarDineroJugador(nombreJugador, 50);
		int dineroFinal = jugador.getDinero();
		assert((dineroInicial + 50) == dineroFinal);
	}

	@Test
	public void testDisminuirDineroJugador() {
		int dineroInicial = jugador.getDinero();
		Partida.disminuirDineroJugador(nombreJugador, 50);
		int dineroFinal = jugador.getDinero();
		assert((dineroInicial - 50) == dineroFinal);
	}

}
