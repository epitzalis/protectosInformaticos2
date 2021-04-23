package partida;

import agentes.Jugador;
import agentes.Tablero;
import utiles.Util;

import java.util.Scanner;

public class Partida {

	private int ronda;
//	private Tablero tablero;
	private int turno;
	private Jugador[] jugadores;
	private boolean isFinalizada = false;
	
	public Partida(Jugador[] jugadores){
		
		this.jugadores = jugadores;
		final int dineroMinimo = 0;
		this.ronda = 1;
		
	}
	
	public int  getRonda() {
		return this.ronda;
	}
	
	public Jugador jugadorActual() {
		
		return this.jugadores[this.turno]; //ronda
	}
	
	public int  getTotalJugadores() {
		return this.jugadores.length;
	}
	
	public void mostrarRonda() {
		System.out.println("Es el turno del jugador: " + this.jugadorActual().getNombre());
	}
	
	public void mostrarPosicionJugadorActual() {
		this.jugadorActual().mostrarPosicion();
	}
	
	public String[][] PropiedadesJActual() {
		return this.jugadorActual().getPropiedades();
	}
	
	public void cambiarTurno() {
		if(turno == this.jugadores.length -1) {
			turno = 0;
		}else {
			turno ++;
		}
	}
	
	public void  comenzar() {
		System.out.println("Va a comenzar la partida con " + this.getTotalJugadores() + " jugadores.");
//		String[][] casillas = Tablero.getCasillas();
		while(isFinalizada == false) {
			Jugador jugadorActual = this.jugadorActual();
			
			System.out.println("Es el turno de " + jugadorActual.getNombre() + " elija una opción:");
			int opcionElejida = this.pedirOpcionesJugador();
			
	    	switch(opcionElejida) {
    		case 1: // Tirar datos
    			int cantidadTiradaDados = Util.dados();
    			
    			jugadorActual.nuevaPosicion(cantidadTiradaDados);
    			String[] nuevaCasilla = Tablero.getCasilla(jugadorActual.getPosicion());
    			System.out.println("Has caido en la casilla: " + nuevaCasilla[1]);
    			//TODO
    			
    			
    			
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
		
	}
	
	private int pedirOpcionesJugador() {
		System.out.println("Opciones");
		System.out.println("1- Tirar datos");
		System.out.println("2- Guardar Partida");
		System.out.println("3- Exit");
		
		System.out.println("Escribe una de las opciones (1,2,3): ");
		
		int numeroOpcion = 0;
		Scanner Pedir = new Scanner(System.in);
		
		while (numeroOpcion == 0) {
			try {
				numeroOpcion = Integer.parseInt(Pedir.nextLine());
				if (numeroOpcion < 1 || numeroOpcion > 3 ) {
					numeroOpcion = 0;
					System.out.println("Debe introducir un número del 1 al 3");
				}
			} catch (Exception e) {
				numeroOpcion = 0;
				System.out.println("Debe introducir un número del 1 al 3");
			}
		}
		
		return numeroOpcion;
	}
	
	
	
	
}
