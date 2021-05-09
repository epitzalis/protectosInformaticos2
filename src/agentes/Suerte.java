package agentes;

import agentes.Jugador;
import agentes.Casilla;
import agentes.Tablero;

public class Suerte {
	
	// las que contienen el nana faltan por desarrollar
	
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
			System.out.println("nana");
		}else if(resultado == 5) {
			System.out.println("nana");
		}else if(resultado == 6) {
			dividendo(jugadorActual);
		}else if(resultado == 7) {
			System.out.println("nana");
		}else if(resultado == 8) {
			retro(jugadorActual);
		}else if(resultado == 9) {
			veCarcel(jugadorActual);
		}else if(resultado == 10) {
			System.out.println("nana");
		}else if(resultado == 11) {
			impuesto(jugadorActual);
		}else if (resultado == 12) {
			priEsta(jugadorActual);
		}else if(resultado == 13) {
			System.out.println("nana");
		}else if(resultado == 14) {
			gana(jugadorActual);
		}else if(resultado == 15) {
			gana2(jugadorActual);
		}

		
	}

	public static void salida(Jugador jugadorActual){
		
			jugadorActual.Posicion = 1;
			System.out.println("Mueve a la casilla de salida");
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
	//4 -> Falta escribir
	public static void rara() {
		
	}
	//5 -> Falta
	public static void estacion() {
		
	}
	//6
	public static void dividendo(Jugador jugadorActual) {
		
		jugadorActual.aumentarDinero(50);
		System.out.println("El banco paga un dividendo de 50€");
	}
	//7 -> Libre de la carcel ->Falta
	public static void Lcarcel() {
		
	}
	//8
	public static void retro(Jugador jugadorActual) {
		
		jugadorActual.Posicion = jugadorActual.Posicion - 3;
		System.out.println("Retrocede 3 casillas");
	}
	//9
	
	
	////////////////////////////FALTA UNO
	
	public static void veCarcel(Jugador jugadorActual) {
	
		jugadorActual.Posicion = 11;
		System.out.println("ve a ka carcel");
		//carcel();
		//falta definir carcel
		
	}
	//10
	public static void reforma() {
		
	}
	//11
	public static void impuesto(Jugador jugadorActual) {
		
		jugadorActual.disminuirDinero(15);
		System.out.println("Paga impuestos 15€");
	}
	//12
	public static void priEsta(Jugador jugadorActual) {
		
		jugadorActual.Posicion = 6;
		System.out.println("Ve a la primera estación del tablero");
	}
	//13
	public static void co50() {
		
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
