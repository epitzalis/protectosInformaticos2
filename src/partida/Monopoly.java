package partida;

import agentes.Jugador;
import agentes.Tablero;
import utiles.Util;

public class Monopoly {

	public static void main(String[] args) {

		int pedir = Util.pedirOpcionesInicio();

		switch (pedir) {
		case 1:
			int numJug = Util.pedirNumeroJugadores();
			Jugador jugadores[] = Util.crearJugador(numJug);
			Partida partida = new Partida(jugadores);
			partida.comenzar();
			break;
		case 2:
			// Cargar partida
			DatosPartida datosPartida = Fichero.importarFichero();

			Partida partidaCargada = new Partida(datosPartida.getJugadores(), datosPartida.getCajaBanca(),
					datosPartida.getNombreJugadorActual());

			Tablero.setPropiedades(datosPartida.getPropiedades());
			partidaCargada.comenzar();

			break;
		case 3:
			System.out.println("\nSaliste de la partida");
			System.exit(0);
			break;
		default:
			break;
		}
	}

}
