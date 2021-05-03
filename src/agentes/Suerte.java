package agentes;

import agentes.Jugador;
import agentes.Casilla;
import agentes.Tablero;

public class Suerte {
	//Faltan incluir mensajes para terminal y if comparación dinero
	//tambien algunos como carcel o priximidad (resta)
	//1
	
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
		}else if(resultado == 12) {
			System.out.println("nana");
		}else if(resultado == 13) {
			gana(jugadorActual);
		}else if(resultado == 14) {
			gana2(jugadorActual);
		}

		
	}

	public static void salida(Jugador jugadorActual){
		
			jugadorActual.Posicion = 1;
	}
	//2
	public static void ultima(Jugador jugadorActual) {
		
			jugadorActual.Posicion = 40;
	}
	//3
	public static void prime(Jugador JugadorActual) {
			
			JugadorActual.Posicion = 2;
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
	}
	//7 -> Libre de la carcel ->Falta
	public static void Lcarcel() {
		
	}
	//8
	public static void retro(Jugador jugadorActual) {
		
		jugadorActual.Posicion = jugadorActual.Posicion - 3;
	}
	//9
	public static void veCarcel(Jugador jugadorActual) {
	
		jugadorActual.Posicion = 11;
		
		//carcel();
		//falta definir carcel
		
	}
	//10
	public static void reforma() {
		
	}
	//11
	public static void impuesto(Jugador jugadorActual) {
		
		jugadorActual.disminuirDinero(15);
		
	}
	//12
	public static void priEsta(Jugador jugadorActual) {
		
		jugadorActual.Posicion = 6;
	}
	//13
	public static void co50() {
		
	}
	//14
	public static void gana(Jugador jugadorActual) {
		
		jugadorActual.aumentarDinero(150);
	}
	//15
	public static void gana2(Jugador jugadorActual) {
		
		jugadorActual.aumentarDinero(100);
	}
}
