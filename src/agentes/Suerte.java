package agentes;

import agentes.Jugador;
import agentes.Casilla;
import agentes.Tablero;
import partida.Partida;

public class Suerte {
	private static int contadorCasas;
	private static int contadorHotel;
		
	public static void llamarSuerte(Jugador jugadorActual) {
		int resultado;
		resultado = (int)(Math.random()*15 + 1); 
		
		if(resultado == 1) {
			salida(jugadorActual);
		}else if(resultado == 2) {
			ultima(jugadorActual);
		}else if(resultado == 3) {
			prime(jugadorActual);
		}else if(resultado == 4) {
			rara(jugadorActual);
		}else if(resultado == 5) {
			estacion(jugadorActual);
		}else if(resultado == 6) {
			dividendo(jugadorActual);
		}else if(resultado == 7) {
			Lcarcel(jugadorActual);
		}else if(resultado == 8) {
			retro(jugadorActual);
		}else if(resultado == 9) {
			veCarcel(jugadorActual);
		}else if(resultado == 10) {
			reforma(jugadorActual);
		}else if(resultado == 11) {
			impuesto(jugadorActual);
		}else if (resultado == 12) {
			priEsta(jugadorActual);
		}else if(resultado == 13) {
			co50(jugadorActual);
		}else if(resultado == 14) {
			gana(jugadorActual);
		}else if(resultado == 15) {
			gana2(jugadorActual);
		}
		
		String[] nuevaCasilla = Tablero.getCasilla(jugadorActual.getPosicion());
		partida.Partida.accion(nuevaCasilla, jugadorActual, 0);
	}

	public static void salida(Jugador jugadorActual){
		
			jugadorActual.Posicion = 1;
			System.out.println("Mueve a la casilla de salida");
			jugadorActual.aumentarDinero(200);
			System.out.println("Has pasado por la salida y cobras 200");
			
	}
	//2
	public static void ultima(Jugador jugadorActual) {
		
			jugadorActual.Posicion = 40;
			System.out.println("Mueve hasta la última propiedad del tablero");
	}
	//3
	public static void prime(Jugador JugadorActual) {
			
			JugadorActual.Posicion = 2;
			System.out.println("Mueve hasta la primera propiedad del tablero");
	}
	//4
	public static void rara(Jugador jugadorActual) {
		int posicion = jugadorActual.Posicion;
		
		int distanciaAgua = 29 - posicion;
		int distanciaElec = 13 - posicion;
		
		if(distanciaAgua > 0 || distanciaElec > 0 ) {
			if(distanciaAgua < distanciaElec) {
				jugadorActual.Posicion = 29;
				System.out.println("Vas al servicio de agua");
			}else if(distanciaElec < distanciaAgua) {
				jugadorActual.Posicion = 13;
				System.out.println("Vas al servicio de electricidad");
			}
		}else {
			jugadorActual.Posicion = 29;
			System.out.println("Vas al servicio de agua");
		}
	}
	//5 
	public static void estacion(Jugador jugadorActual) {
		int posicion = jugadorActual.Posicion;
		
		int esta1 = 6 - posicion;
		int esta2 = 16 - posicion;
		int esta3 = 26 - posicion;
		int esta4 = 36 - posicion;
	
		if(esta1 > 0 || esta2 > 0 || esta3 > 0 || esta4 > 0) {
			if(esta1 < esta2 && esta1 < esta3 && esta1 < esta4) {
				jugadorActual.Posicion = 6;
				System.out.println("Vas a la estacion 1");
			}else if(esta2 < esta1 && esta2 < esta3 && esta2 < esta4) {
				jugadorActual.Posicion = 16;
				System.out.println("Vas a la estacion 2");
			}else if(esta3 < esta1 && esta3 < esta2 && esta3 < esta4) {
				jugadorActual.Posicion = 26;
				System.out.println("Vas a la estacion 3");
			}else if(esta4 < esta1 && esta4 < esta2 && esta4 < esta3) {
				jugadorActual.Posicion = 36;
				System.out.println("Vas a la estacion 4");
			}
		}else {
			jugadorActual.Posicion = 6;
			System.out.println("Vas a la estacion 1");
		}
	}
	//6
	public static void dividendo(Jugador jugadorActual) {
		
		jugadorActual.aumentarDinero(50);
		System.out.println("El banco paga un dividendo de 50€");
	}
	//7 -> Libre de la carcel ->Falta
	public static void Lcarcel(Jugador jugadorActual) {
		jugadorActual.Targetalibre = true;
		
		System.out.println("Queda libre de la cárcel, esta carta se puede usar cuando se crea oportuno. No se puede vender");
	}
	//8
	public static void retro(Jugador jugadorActual) {
		
		jugadorActual.Posicion = jugadorActual.Posicion - 3;
		System.out.println("Retrocede 3 casillas");
	}

	//9
	public static void veCarcel(Jugador jugadorActual) {
	
		jugadorActual.Carcel = true;
		jugadorActual.Posicion = 11;
		System.out.println("Ve a la carcel");
	}
	//10
	public static void reforma(Jugador jugadorActual) {
		String[][] propiedad = Tablero.Propiedades;
		System.out.println("Tienes que pagar 25 por casa y 100 por hotel");
		if(contadorCasas != 0 || contadorHotel != 0) {
			contadorCasas = 0;
			contadorHotel = 0;
		}
		for (int x=0; x < propiedad.length; x++) {
			  if(propiedad[x][1] == jugadorActual.getNombre()) {
				  if(Integer.parseInt(propiedad[x][2]) >= 1 || Integer.parseInt(propiedad[x][2]) <= 4) {
					  int casas = Integer.parseInt(propiedad[x][2]);
					  contadorCasas = contadorCasas + casas;
				  }else if(Integer.parseInt(propiedad[x][2]) == 5) {
					  int hoteles = Integer.parseInt(propiedad[x][2]);
					  contadorHotel = contadorHotel + hoteles;
				  }
			  }	  
		}
		int pagar = (25*contadorCasas) + (100*contadorHotel);
		System.out.println("Tienes "+contadorCasas+" casas y "+contadorHotel+" hoteles, tienes que pagar un total de: "+pagar);
	}
	//11
	public static void impuesto(Jugador jugadorActual) {
		
		jugadorActual.disminuirDinero(15);
		System.out.println("Paga impuestos 15€");
		partida.Partida.cajaBanca = partida.Partida.cajaBanca + 50;
	}
	//12
	public static void priEsta(Jugador jugadorActual) {
		
		jugadorActual.Posicion = 6;
		System.out.println("Ve a la primera estación del tablero");
	}
	//13
	public static void co50(Jugador jugadorActual) {
		Jugador[] jugadores = Partida.jugadores;
		String nombreJugador = jugadorActual.getNombre(); 
		int cobrar = (jugadores.length -1) * 50;
		System.out.println("Has ganado "+cobrar+" euros.");
		
		for (int i = 0; i < jugadores.length; i++) {
			if ((jugadores[i].getNombre().equals(nombreJugador))==false) {
				int totalDinero = jugadores[i].getDinero() - 50;
				jugadores[i].setDinero(totalDinero);
				System.out.println("El dinero de " + jugadores[i].getNombre() + " ha disminuido a "+ totalDinero + "â‚¬");
				System.out.println(" ");
			}
		}
	}
	//14
	public static void gana(Jugador jugadorActual) {
		
		jugadorActual.aumentarDinero(150);
		System.out.println("Dividendos, ganas 150€");
	}
	//15
	public static void gana2(Jugador jugadorActual) {
		
		jugadorActual.aumentarDinero(100);
		System.out.println("Ganas una competición de crucigramas ganas 100€");
	}
}
