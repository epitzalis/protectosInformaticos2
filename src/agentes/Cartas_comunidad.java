package agentes;

import agentes.Jugador;
import agentes.Casilla;
import agentes.Tablero;
import partida.Partida;

public class Cartas_comunidad {
	
	private static int contadorCasas;
	private static int contadorHotel;
	
	public static void llamarCaja(Jugador jugadorActual) {
		int resultado;
		resultado = (int)(Math.random()*15 + 1); 
		
		if(resultado == 1){
			salida(jugadorActual);
		}else if(resultado == 2) {
			errorBanco(jugadorActual);
		}else if(resultado == 3) {
			dentista(jugadorActual);
		}else if(resultado == 4) {
			dividendos(jugadorActual);
		}else if(resultado == 5) {
			libreCarcel(jugadorActual);
		}else if(resultado == 6) {
			carcel(jugadorActual);
		}else if(resultado == 7) {
			opera(jugadorActual);
		}else if(resultado == 8) {
			dividendo(jugadorActual);
		}else if(resultado == 9) {
			devoImp(jugadorActual);
		}else if(resultado == 10){
			cumple(jugadorActual);
		}else if(resultado == 11){
			loteria(jugadorActual);
		}else if(resultado == 12){
			multa(jugadorActual);
		}else if(resultado == 13){
			escola(jugadorActual);
		}else if(resultado == 14){
			consultor(jugadorActual);
		}else if(resultado == 15){
			reparacion(jugadorActual);
		}else if(resultado == 16){
			premio(jugadorActual);
		}
		
		String[] nuevaCasilla = Tablero.getCasilla(jugadorActual.getPosicion());
		partida.Partida.accion(nuevaCasilla, jugadorActual, 0);
	}
	//1
	public static void salida(Jugador jugadorActual) {
		jugadorActual.Posicion = 1;
		System.out.println("Mueve a la casilla de salida");
	}
	//2
	public static void errorBanco(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(200);
		System.out.println("Error del banco ganas 200€");
	}
	//3
	public static void dentista(Jugador jugadorActual) {
		jugadorActual.disminuirDinero(50);
		System.out.println("Pagas al dentista 50€");
		partida.Partida.cajaBanca = partida.Partida.cajaBanca + 50;
	}
	//4
	public static void dividendos(Jugador jugadorActual){
		jugadorActual.aumentarDinero(50);
		System.out.println("Ganas 50€ de dividendos");
	}
	//5
	public static void libreCarcel(Jugador jugadorActual){
		jugadorActual.Targetalibre = true;
		System.out.println("Queda libre de la cárcel, esta carta se puede usar cuando se crea oportuno. No se puede vender");
	}
	//6
	public static void carcel(Jugador jugadorActual) {
		jugadorActual.Posicion = 11;
		jugadorActual.Carcel = true;
		System.out.println("Vas a la carcel, sin pasar por la casilla de salida");
	}
	//7
	public static void opera(Jugador jugadorActual) {
		// cada jugador paga 50 al jugadorActual
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
	//8
	public static void dividendo(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(100);
		System.out.println("Dividendos ganas 100€");
	}
	//9
	public static void devoImp(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(20);
		System.out.println("Devolución de impuestos ganas 20€");
	}
	//10
	public static void cumple(Jugador jugadorActual) {
		//cada jugador da 10 al jugador actual
			Jugador[] jugadores = Partida.jugadores;
			String nombreJugador = jugadorActual.getNombre(); 
			int cobrar = (jugadores.length -1) * 10;
			System.out.println("Has ganado "+cobrar+" euros.");
				
			for (int i = 0; i < jugadores.length; i++) {
				if ((jugadores[i].getNombre().equals(nombreJugador))==false) {
					int totalDinero = jugadores[i].getDinero() - 10;
					jugadores[i].setDinero(totalDinero);
					System.out.println("El dinero de " + jugadores[i].getNombre() + " ha disminuido a "+ totalDinero + "â‚¬");
					System.out.println(" ");
				}
			}
	}
	//11
	public static void loteria(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(100);
		System.out.println("Primer premio en la lotería ganas 100€");
	}
	//12
	public static void multa(Jugador jugadorActual) {
		jugadorActual.disminuirDinero(100);
		System.out.println("Multa de velocidad pagas 100€");
		partida.Partida.cajaBanca = partida.Partida.cajaBanca + 100;
	}
	//13
	public static void escola(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(150);
		System.out.println("Matrícula escolar pagas 150€");
		partida.Partida.cajaBanca = partida.Partida.cajaBanca + 150;
	}
	//14
	public static void consultor(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(25);
		System.out.println("Tasa de consultor, ganas 25€");
	}
	//15
	public static void reparacion(Jugador jugadorActual) {
		//falta buscar casillas
		String[][] propiedad = Tablero.Propiedades;
		System.out.println("Tienes que pagar 40 por casa y 115 por hotel");
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
				  }else {
					  
				  }
			  }	  
		}
		int pagar = (40*contadorCasas) + (115*contadorHotel);
		System.out.println("Tienes "+contadorCasas+" casas y "+contadorHotel+" hoteles, tienes que pagar un total de: "+pagar);
	}
	//16
	public static void premio(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(10);
		System.out.println("Ganas el segundo premio en un concurso de disfraces ganas 10€");
	}
}
