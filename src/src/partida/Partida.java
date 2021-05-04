package partida;

import agentes.Cartas_comunidad;
import agentes.Casilla;
import agentes.Jugador;
import agentes.Tablero;
import agentes.Suerte;
import utiles.Util;

import java.util.Scanner;

public class Partida {

	private int turno;
	static private Jugador[] jugadores;
	private boolean isFinalizada = false;
	
	public Partida(Jugador[] jugadores){
		this.jugadores = jugadores;
	}
	
	private Jugador jugadorActual() {
		
		return this.jugadores[this.turno]; //ronda
	}
	
	private int  getTotalJugadores() {
		return this.jugadores.length;
	}
	
//	private void mostrarPosicionJugadorActual() {
//		this.jugadorActual().mostrarPosicion();
//	}
	
	private void cambiarTurno() {
		if(turno == this.jugadores.length -1) {
			turno = 0;
		}else {
			turno ++;
		}
	}
	
	public static void aumentarDineroJugador(String nombreJugador, int cantidad) {
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].getNombre().equals(nombreJugador)) {
				int totalDinero = jugadores[i].getDinero() + cantidad;
				jugadores[i].setDinero(totalDinero);
				System.out.println("El dinero de " + jugadores[i].getNombre() + " ha aumentado a "+ totalDinero + "€");
			}
		}
	}
	
	public void  accion(String[] nuevaCasilla, Jugador jugadorActual) {
		String nombreCasilla = nuevaCasilla[1];
		String idCasilla = nuevaCasilla[0];
		// TODO Continuar en casillas
		System.out.println("Has caido en " + nombreCasilla);
		if (nombreCasilla.contains("Propiedad")) {
			Casilla.propiedad(idCasilla, nombreCasilla, jugadorActual);
		} else if (nombreCasilla.contains("Estacion")) {
			Casilla.estacion(idCasilla, nombreCasilla, jugadorActual);
		} else if (nombreCasilla.equals("Salida")) {
			jugadorActual.aumentarDinero(100);
		} else if (nombreCasilla.equals("Caja comunitaria")) {
			Cartas_comunidad.llamarCaja(jugadorActual);
		} else if (nombreCasilla.equals("Suerte")) {
			Suerte.llamarSuerte(jugadorActual);
		} else if (nombreCasilla.equals("Carcel")) {
			
		} else if (nombreCasilla.equals("Compania electricidad")) {
			
		} else if (nombreCasilla.equals("Compania del agua")) {
			
		} else if (nombreCasilla.equals("Estacionamiento Gratuito")) {
			
		} else if (nombreCasilla.equals("Ve a la Carcel")) {
			
		} else if (nombreCasilla.equals("Impuestos de lujo")) {
			
		} else if (nombreCasilla.equals("Impuestos sobre el Capital")) {
			
		}
	}
	
	public void  comenzar() {
		System.out.println("Va a comenzar la partida con " + this.getTotalJugadores() + " jugadores.");

		while(isFinalizada == false) {
			Jugador jugadorActual = this.jugadorActual();
				
			if (jugadorActual.getDinero() > 0) { // Solo mostrarmos el turno de los jugadores que tienen dinero
				System.out.println("\nEs el turno de " + jugadorActual.getNombre() + " (Dispones de " + jugadorActual.getDinero() + "€), elija una opcion:");
				
				
				if(jugadorActual.getPosicion() == 41) { //Miramos si el jugador esta en la carcel encerrado
					
					int cantidadTiradaDados = Util.dados();
					
					
					
					cambiarTurno();
				}else {
					int opcionElejida = Util.pedirOpcionesJugador();
					switch(opcionElejida) {
						case 1: // Tirar datos
							int cantidadTiradaDados = Util.dados();
							if(cantidadTiradaDados == 0) { //miramos si ha sacado 3 dobles
								jugadorActual.Posicion = 41;
							}else {
								jugadorActual.nuevaPosicion(cantidadTiradaDados);
								String[] nuevaCasilla = Tablero.getCasilla(jugadorActual.getPosicion());
								System.out.println("Has caido en la casilla: " + nuevaCasilla[1]);
								//TODO
								this.accion(nuevaCasilla, jugadorActual);
							}
							cambiarTurno();
							break;
						case 2: // Guardar Partida
							System.out.println("Sin implementar aún");
							break;
						case 3:
							System.out.println("\nSaliste de la partida");
							System.exit(0);		
							break;
						default:
							break;
					}
				}
			} else {
				cambiarTurno();
			}

		}
		
	}
	

	
}
