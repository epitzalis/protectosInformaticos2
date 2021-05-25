package agentes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CasillaTest {
	
	private Jugador jugador;

	@Before
	public void setUp() throws Exception {
		jugador = new agentes.Jugador("Jugador 1", 1200, 0, null, false, false, 0);
	}

	@Test 
	public void testPropiedad() { 
		String[] propiedad1 = Tablero.getPropiedad("2"); 
		Casilla.propiedad("2", "Propiedad 1", jugador);
		String[] propiedad2 = Tablero.getPropiedad("2"); 
		assert(propiedad1[1] !=propiedad2[1]); 
	}
	 
	@Test 
	public void testEstacion() { 
		String[] propiedad1 = Tablero.getPropiedad("6"); 
		Casilla.estacion("6", "Estacion 1", jugador);
		String[] propiedad2 = Tablero.getPropiedad("6"); 
		assert(propiedad1[1] != propiedad2[1]); 
	}
	 

	@Test
	public void testServicio() {
		String[] propiedad1 = Tablero.getPropiedad("29");
		Casilla.servicio("29", "Compania del agua", jugador, 0);
		String[] propiedad2 = Tablero.getPropiedad("29");
		assert(propiedad1[1] != propiedad2[1]);
	}

	@Test
	public void testComprarPropiedad() {
		int dinero1 = jugador.getDinero();
		Casilla.comprarPropiedad("2", "Propiedad 1", jugador);
		int dinero2 = jugador.getDinero();
		assert(dinero1 != dinero2);
	}

	
	@Test public void testPagarAlquilerPropiedad() { 
		int dinero1 = jugador.getDinero();
		Casilla.pagarAlquilerPropiedad("4", "Propiedad 2", jugador);
		int dinero2 = jugador.getDinero();
		assert(dinero1 != dinero2);
	}
	 

	@Test
	public void testComprarEstacion() {
		int dinero1 = jugador.getDinero();
		Casilla.comprarEstacion("16", "Estacion 2", jugador);
		int dinero2 = jugador.getDinero();
		assert(dinero1 != dinero2);
	}

	@Test
	public void testPagarAlquilerEstacion() {
		int dinero1 = jugador.getDinero();
		Casilla.pagarAlquilerEstacion("16", "Estacion 2", jugador);
		int dinero2 = jugador.getDinero();
		assert(dinero1 != dinero2);
	}

	@Test
	public void testComprarServicio() {
		int dinero1 = jugador.getDinero();
		Casilla.comprarServicio("29", "Compania del agua", jugador);
		int dinero2 = jugador.getDinero();
		assert(dinero1 != dinero2);
	}

}
