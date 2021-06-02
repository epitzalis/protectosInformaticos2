package agentes;

import org.junit.Before;
import org.junit.Test;
import partida.Partida;

public class CasillaTest {

	private Jugador jugador;
	private Jugador jugador2;
	String[][] propiedades = Tablero.getPropiedades();
	String[][] casillas = Tablero.getCasillas();

	@Before
	public void setUp() throws Exception {
		jugador = new Jugador("jugador 1", 1200, 0, null, false, false, 0);
		jugador2 = new Jugador("jugador 2", 1200, 0, null, false, false, 0);
		Partida.jugadores = new Jugador[1];
		Partida.jugadores[0] = jugador;
	}

//	@Test 
//	public void testPropiedad() { 
//		int dinero1 = jugador.getDinero(); 
//		Casilla.propiedad("2", "Propiedad 1", jugador);
//		int dinero2 = jugador.getDinero(); 
//		assert(dinero1 != dinero2); 
//	}

//	@Test 
//	public void testEstacion() { 
//		int dinero1 = jugador.getDinero();
//		Casilla.estacion("6", "Estacion 1", jugador);
//		int dinero2 = jugador.getDinero(); 
//		assert(dinero1 != dinero2); 
//	}

//	@Test
//	public void testServicio() {
//		int dinero1 = jugador.getDinero(); 
//		Casilla.servicio("29", "Compania del agua", jugador, 0);
//		int dinero2 = jugador.getDinero(); 
//		assert(dinero1 != dinero2); 
//	}

//	@Test
//	public void testComprarPropiedad() {
//		int dinero1 = jugador.getDinero();
//		Casilla.comprarPropiedad("2", "Propiedad 1", jugador);
//		int dinero2 = jugador.getDinero();
//		assert(dinero1 != dinero2);
//	}

	@Test
	public void testPagarAlquilerPropiedad() {
		int dinero1 = jugador.getDinero();
		Casilla.pagarAlquilerPropiedad("4", "Propiedad 2", jugador);
		int dinero2 = jugador.getDinero();
		assert (dinero1 != dinero2);
	}

//	@Test
//	public void testComprarEstacion() {
//		int dinero1 = jugador.getDinero();
//		Casilla.comprarEstacion("16", "Estacion 2", jugador);
//		int dinero2 = jugador.getDinero();
//		assert(dinero1 != dinero2);
//	}

//	@Test
//	public void testPagarAlquilerEstacion() {
//		int dinero1 = jugador.getDinero();
//		Casilla.pagarAlquilerEstacion("16", "Estacion 2", jugador);
//		int dinero2 = jugador.getDinero();
//		assert(dinero1 == dinero2);
//	}

//	@Test
//	public void testComprarServicio() {
//		int dinero1 = jugador.getDinero();
//		Casilla.comprarServicio("29", "Compania del agua", jugador);
//		int dinero2 = jugador.getDinero();
//		assert(dinero1 != dinero2);
//	}

}
