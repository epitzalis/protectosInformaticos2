package utiles;

import java.util.Scanner;

import agentes.Jugador;

public class Util {
	
	static final int DineroInicial = 10000;
	static final int PosInicial = 1;
	
	public static int dados() {
		int resultado;
		resultado = (int)(Math.random()*7 + 1) + (int)(Math.random()*7 + 1); 
		return resultado;
	}
	
    public static Jugador[] crearJugador(int numj) {
    	
    	Jugador jugadores [] = new Jugador[numj];	
    	
    	if(numj >=2 & numj<=8) {
	    	for(int i =0 ; i < numj; i++) {

	    		String nombre;
	    		nombre = "Jugador " + (i + 1);

	    		String[] Cartas = null;
	    		
	    		jugadores[i] = new Jugador(nombre, DineroInicial, PosInicial, Cartas );
	    		   		
	    	}
		}else {
			System.out.println("Error el numero de jugadores no es correcto");
		};
		return jugadores;
    } 
	
	public static int pedirNumeroJugadores() {
		System.out.println("Cuantos jugadores sois (entre 2 y 8): ");
		
		int numeroJugadores = 0;
		Scanner Pedir = new Scanner(System.in);
		
		while (numeroJugadores == 0) {
			try {
				numeroJugadores = Integer.parseInt(Pedir.nextLine());
				if (numeroJugadores < 2 || numeroJugadores > 8 ) {
					numeroJugadores = 0;
					System.out.println("Solo puede elegir entre 2 y 8 jugadores");
				}
			} catch (Exception e) {
				numeroJugadores = 0;
				System.out.println("Solo puede elegir entre 2 y 8 jugadores");
			}
		}
		
		return numeroJugadores;
	}
	
	public static int pedirOpcionesInicio() {
    	System.out.println("Bienvenido al Monopoly");
    	
    	System.out.println("Selecciona una opcion");
    	
    	System.out.println("1- Nueva partida");
    	System.out.println("2- Cargar partida ");
    	System.out.println("3- Exit");
    	
    	System.out.println("Escribe una de las opciones (1,2,3): ");
		
		int numeroOpcion = 0;
		Scanner Pedir = new Scanner(System.in);
		
		while (numeroOpcion == 0) {
			try {
				numeroOpcion = Integer.parseInt(Pedir.nextLine());
				if (numeroOpcion < 1 || numeroOpcion > 3 ) {
					numeroOpcion = 0;
					System.out.println("Escribe una de las opciones (1,2,3): ");
				}
			} catch (Exception e) {
				numeroOpcion = 0;
				System.out.println("Escribe una de las opciones (1,2,3): ");
			}
		}
		
		return numeroOpcion;
	}
	
	public static int pedirOpcionesJugador() {
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
	
	public static boolean pedirConfirmarCompraPropiedad(String nombreCasilla, String nombreNuevaAdquisicion, int precioCompraCasilla) {
		    	
    	System.out.println("¿Deseas comprar " + nombreNuevaAdquisicion + " en " + nombreCasilla + " por " + precioCompraCasilla + "€?");
    	
    	System.out.println("1- Si");
    	System.out.println("2- No");
    	
    	System.out.println("Escribe una de las opciones (1,2): ");
		
		int numeroOpcion = 0;
		Scanner Pedir = new Scanner(System.in);
		
		while (numeroOpcion == 0) {
			try {
				numeroOpcion = Integer.parseInt(Pedir.nextLine());
				if (numeroOpcion < 1 || numeroOpcion > 2 ) {
					numeroOpcion = 0;
					System.out.println("Escribe una de las opciones (1,2): ");
				}
			} catch (Exception e) {
				numeroOpcion = 0;
				System.out.println("Escribe una de las opciones (1,2): ");
			}
		}
		
		if (numeroOpcion == 1) {
			System.out.println("Has adquirido un inmueble en " + nombreCasilla);
			return true;
		} else {
			System.out.println("Has decidido no comprar nada");
			return false;
		}
		
	}
	
	public static boolean pedirConfirmarCompraEstacion(String nombreCasilla, int precioCompraCasilla) {
    	
    	System.out.println("¿Deseas comprar " + nombreCasilla + " por " + precioCompraCasilla + "€?");
    	
    	System.out.println("1- Si");
    	System.out.println("2- No");
    	
    	System.out.println("Escribe una de las opciones (1,2): ");
		
		int numeroOpcion = 0;
		Scanner Pedir = new Scanner(System.in);
		
		while (numeroOpcion == 0) {
			try {
				numeroOpcion = Integer.parseInt(Pedir.nextLine());
				if (numeroOpcion < 1 || numeroOpcion > 2 ) {
					numeroOpcion = 0;
					System.out.println("Escribe una de las opciones (1,2): ");
				}
			} catch (Exception e) {
				numeroOpcion = 0;
				System.out.println("Escribe una de las opciones (1,2): ");
			}
		}
		
		if (numeroOpcion == 1) {
			System.out.println("Has adquirido " + nombreCasilla);
			return true;
		} else {
			System.out.println("Has decidido no comprar nada");
			return false;
		}
		
	}
	
}
