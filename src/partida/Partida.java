package partida;

import agentes.CartasComunidad;
import agentes.Casilla;
import agentes.Jugador;
import agentes.Tablero;
import agentes.Suerte;
import utiles.Util;


public class Partida {

	private String nombreJugadorActual = "Jugador 1";
	public static Jugador[] jugadores;
	private boolean isFinalizada = false;
	public static int cajaBanca;
	
	public Partida(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	
	public Partida(Jugador[] jugadores, int cajaBanca, String nombreJugadorActual) {
		this.jugadores = jugadores;
		this.cajaBanca = cajaBanca;
		this.nombreJugadorActual = nombreJugadorActual;
	}
	
	private Jugador jugadorActual() {
		int index = 0;
		for (int i = 0; i < jugadores.length; i++) {
			if (nombreJugadorActual.equals(jugadores[i].getNombre())) {
				index = i;
			}
		}
		return jugadores[index];
	}
	
	private int getTotalJugadores() {
		return this.jugadores.length;
	}
		
	private void cambiarTurno() {
		String jugadorSiguiente = ""; 
		if (!this.checkTerminoPartida()) {
			int encontrado = 0;
			int i = 0;
			while (encontrado < 3 && jugadorSiguiente.equals("")) {
				if (encontrado > 0 && jugadores[i].getDinero() > 0) {
					jugadorSiguiente = jugadores[i].getNombre();
				}
				if (nombreJugadorActual.equals(jugadores[i].getNombre())) {
					encontrado++;
				}
				if (i == (jugadores.length - 1)) {
					i = 0;
				} else {
					i++;
				}
			}
			this.nombreJugadorActual = jugadorSiguiente;
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
	
	public static void disminuirDineroJugador(String nombreJugador, int cantidad) {
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].getNombre().equals(nombreJugador)) {
				int totalDinero = jugadores[i].getDinero() - cantidad;
				jugadores[i].setDinero(totalDinero);
				System.out.println("El dinero de " + jugadores[i].getNombre() + " ha disminuido a "+ totalDinero + "€");
			}
		}
	}

	public static void accion(String[] nuevaCasilla, Jugador jugadorActual, int dado) {
		String nombreCasilla = nuevaCasilla[1];
		String idCasilla = nuevaCasilla[0];

		if (nombreCasilla.contains("Propiedad")) {
			Casilla.propiedad(idCasilla, nombreCasilla, jugadorActual);
		} else if (nombreCasilla.contains("Estacion ")) {
			Casilla.estacion(idCasilla, nombreCasilla, jugadorActual);
		} else if (nombreCasilla.equals("Salida")) {
			jugadorActual.aumentarDinero(100);
		} else if (nombreCasilla.equals("Caja comunitaria")) {
			CartasComunidad.llamarCaja(jugadorActual);
		} else if (nombreCasilla.equals("Suerte")) {
			Suerte.llamarSuerte(jugadorActual);
		} else if (nombreCasilla.equals("Carcel")) {
			System.out.println("Estas en carcel pero solo de paso, tranquilo :)");
		} else if (nombreCasilla.equals("Compania electricidad")) {
			Casilla.servicio(idCasilla, nombreCasilla, jugadorActual, dado);
		} else if (nombreCasilla.equals("Compania del agua")) {
			Casilla.servicio(idCasilla, nombreCasilla, jugadorActual, dado);
		} else if (nombreCasilla.equals("Estacionamiento Gratuito")) {
			jugadorActual.aumentarDinero(cajaBanca);
			System.out.println("Has ganado "+cajaBanca+" euros.");
			cajaBanca = 0;
		} else if (nombreCasilla.equals("Ve a la Carcel")) {
			jugadorActual.setPosicion(11);
			jugadorActual.setCarcel(true);
			System.out.println("Vas a la carcel, sin pasar por la casilla de salida");
		} else if (nombreCasilla.equals("Impuestos de lujo")) {
			System.out.println("Pagas 100");
			jugadorActual.disminuirDinero(100);
			cajaBanca = cajaBanca + 100; 
		} else if (nombreCasilla.equals("Impuestos sobre el Capital")) {
			System.out.println("Pagas 200");
			jugadorActual.disminuirDinero(200);
			cajaBanca = cajaBanca + 200;
		}
	}
	
	private boolean checkTerminoPartida() {
		int totalJugadoresActivos = 0;
		String nombreGanador = "";
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].getDinero() > 0) {
				totalJugadoresActivos++;
				nombreGanador = jugadores[i].getNombre();
			}
		}
		
		if (totalJugadoresActivos == 1) {
			System.out.println("Felicidades" + nombreGanador + ", has ganado la partida");
			return true;
		} else {
			return false;
		}
		
	}
	
	public void  comenzar() {
		
		System.out.println("Va a comenzar la partida con " + this.getTotalJugadores() + " jugadores.");

		while(isFinalizada == false) {
			Jugador jugadorActual = this.jugadorActual();
			
			
			if (jugadorActual.getDinero() > 0) { // Solo mostrarmos el turno de los jugadores que tienen dinero
				System.out.println("\nEs el turno de " + jugadorActual.getNombre() + " (Dispones de " + jugadorActual.getDinero() + "€), elija una opcion:");
				
				
				if(jugadorActual.isCarcel() == true && jugadorActual.getContador() < 3) { //Miramos si el jugador esta en la carcel encerrado
					
					int opcionElegida2 = Util.pedirOpcionesJugador2();
					
						switch(opcionElegida2) {
							case 1: //probar suerte
								int prueba[] = Util.dados();
								if(prueba[1] == prueba[2]) {
									System.out.println("Estas libre de la carcel, en el siguiente turno");
									jugadorActual.setCarcel(false);
								}else {
									System.out.println("Mala suerte, la proxima sera");
								}
								break;
							case 2: // Guardar Partida
								Fichero.exportarFichero(this.jugadores, this.cajaBanca, this.nombreJugadorActual, Tablero.getPropiedades());
								break;
							case 3:
								if(jugadorActual.isTargetalibre() == true) {
									System.out.println("Has usado la carta de suerte");
									jugadorActual.setCarcel(false);
									jugadorActual.setTargetalibre(false);
								}else {
									System.out.println("No tienes targeta");
								}
								break;
							case 4:
								System.out.println("Has pagado 50, quedas libre de la carcel");
							case 5:
								System.out.println("\nSaliste de la partida");
								System.exit(0);
								break;
							default:
								break;
					}
					jugadorActual.setContador(jugadorActual.getContador() + 1);
					cambiarTurno();
				}else {
					if(jugadorActual.getContador() == 3) {
						System.out.println("Has salido de la carcel");
						jugadorActual.setContador(0);
						System.out.println("");
					}
					int opcionElejida = Util.pedirOpcionesJugador();
					switch(opcionElejida) {
						case 1: // Tirar datos
							int dados[] = Util.dados();
							int cantidadTiradaDados = dados[0];
							jugadorActual.nuevaPosicion(cantidadTiradaDados);
							String[] nuevaCasilla = Tablero.getCasilla(jugadorActual.getPosicion());
							System.out.println("Has caido en la casilla: " + nuevaCasilla[1]);

							this.accion(nuevaCasilla, jugadorActual, cantidadTiradaDados);
														
							//comprobamos si saca doble y si va a la carcel
							if(dados[1] == dados[2]) {
								
								int tirada2[] = Util.dados();
								System.out.println("Has sacado un doble, volverás a tirar despues");
								int cantidadTiradaDados2 = tirada2[0];
								jugadorActual.nuevaPosicion(cantidadTiradaDados2);
								String[] nuevaCasilla2 = Tablero.getCasilla(jugadorActual.getPosicion());
								System.out.println("Has caido en la casilla: " + nuevaCasilla2[1]);
								this.accion(nuevaCasilla2, jugadorActual, cantidadTiradaDados2);
								
								if(tirada2[1] == tirada2[2]) {
									
									int tirada3[] = Util.dados();
									System.out.println("Has sacado un doble, volverás a tirar despues");
									int cantidadTiradaDados3 = tirada3[0];
									jugadorActual.nuevaPosicion(cantidadTiradaDados2);
									String[] nuevaCasilla3 = Tablero.getCasilla(jugadorActual.getPosicion());
									System.out.println("Has caido en la casilla: " + nuevaCasilla3[1]);
									this.accion(nuevaCasilla3, jugadorActual, cantidadTiradaDados3);
									
									if(tirada3[1] == tirada3[2]) {
										jugadorActual.nuevaPosicion(11);
										System.out.println("Vas a la carcel");
										jugadorActual.setCarcel(true);
									}
								}
							}
							cambiarTurno();
							break;
						case 2:
							Util.comprarCasa(jugadorActual);
							break;
						case 3:
							Util.imprimirTablero();
							break;
						case 4: 
							Util.imprimirCasillas();
							break;
						case 5: // Guardar Partida
							Fichero.exportarFichero(this.jugadores, this.cajaBanca, this.nombreJugadorActual, Tablero.getPropiedades());
							break;
						case 6:
							System.out.println("\nSaliste de la partida");
							System.exit(0);		
							break;
						default:
							break;
					}
				}
			} 
			isFinalizada = this.checkTerminoPartida();
		}
		System.out.println("La partida ha finalizado.");
		System.exit(0);		
	}	
	
}
