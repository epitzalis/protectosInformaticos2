package agentes;

import agentes.Jugador;
import agentes.Casilla;
import agentes.Tablero;

public class Cartas_comunidad {
	
	
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
			System.out.println("nana");
		}else if(resultado == 6) {
			System.out.println("nana");
		}else if(resultado == 7) {
			System.out.println("nana");
		}else if(resultado == 8) {
			dividendo(jugadorActual);
		}else if(resultado == 9) {
			devoImp(jugadorActual);
		}else if(resultado == 10){
			System.out.println("nana");
		}else if(resultado == 11){
			loteria(jugadorActual);
		}else if(resultado == 12){
			multa(jugadorActual);
		}else if(resultado == 13){
			escola(jugadorActual);
		}else if(resultado == 14){
			consultor(jugadorActual);
		}else if(resultado == 15){
			System.out.println("nana");
		}else if(resultado == 16){
			premio(jugadorActual);
		}	
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
	}
	//4
	public static void dividendos(Jugador jugadorActual){
		jugadorActual.aumentarDinero(50);
		System.out.println("Ganas 50€ de dividendos");
	}
	//5
	public static void libreCarcel(Jugador jugadorActual){
		//Falta definir carta libre
	}
	//6
	public static void carcel(Jugador jugadorActual) {
		//definir carcel
	}
	//7
	public static void opera(Jugador jugadorActual) {
		// cada jugador paga 50 al jugadorActual
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
	}
	//13
	public static void escola(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(150);
		System.out.println("Matrícula escolar pagas 150€");
	}
	//14
	public static void consultor(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(25);
		System.out.println("Tasa de consultor, ganas 25€");
	}
	//15
	public static void reparacion(Jugador jugadorActual) {
		//falta buscar casillas
	}
	//16
	public static void premio(Jugador jugadorActual) {
		jugadorActual.aumentarDinero(10);
		System.out.println("Ganas el segundo premio en un concurso de disfraces ganas 10€");
	}
}
