package partida;

import agentes.Jugador;

public class DatosPartida {

	private Jugador[] jugadores;
	private int cajaBanca;
	private String nombreJugadorActual;
	private String[][] propiedades;

	public DatosPartida(Jugador[] jugadores, int cajaBanca, String nombreJugadorActual, String[][] propiedades) {
		this.jugadores = jugadores;
		this.cajaBanca = cajaBanca;
		this.nombreJugadorActual = nombreJugadorActual;
		this.propiedades = propiedades;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public int getCajaBanca() {
		return cajaBanca;
	}

	public String getNombreJugadorActual() {
		return nombreJugadorActual;
	}

	public String[][] getPropiedades() {
		return propiedades;
	}

}
