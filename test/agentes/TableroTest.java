package agentes;

import org.junit.Test;

public class TableroTest {

	@Test
	public void testGetCasillas() {
		assert(Tablero.getCasillas() != null);
	}

	@Test
	public void testGetPropiedades() {
		assert(Tablero.getPropiedades() != null);
	}

	@Test
	public void testGetPropiedadString() {
		assert(Tablero.getPropiedad("1") != null);
	}

	@Test
	public void testGetPropiedadInt() {
		assert(Tablero.getPropiedad(1) != null);
	}

	@Test
	public void testGetCasillaString() {
		assert(Tablero.getCasilla("1") != null);
	}

	@Test
	public void testGetCasillaInt() {
		assert(Tablero.getCasilla(1) != null);
	}

	@Test
	public void testGetCantidadEstacionesJugador() {
		assert(Tablero.getCantidadEstacionesJugador("Jugador 1") == 0);
	}

}
