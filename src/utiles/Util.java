package utiles;

import java.util.Scanner;
import agentes.Jugador;
import agentes.Tablero;

public class Util {

	static final int DineroInicial = 10000;
	static final int PosInicial = 1;

	public static int[] dados() {

		int[] resultados = new int[3];
		int dado1 = (int) (Math.random() * 7 + 1);
		int dado2 = (int) (Math.random() * 7 + 1);
		int resultado = dado1 + dado2;

		System.out.println("Has sacado: " + resultado + ". (Dado 1: " + dado1 + ", dado 2: " + dado2 + ")");

		resultados[0] = resultado;
		resultados[1] = dado1;
		resultados[2] = dado2;

		return resultados;
	}

	public static Jugador[] crearJugador(int numj) {

		Jugador jugadores[] = new Jugador[numj];

		if (numj >= 2 & numj <= 8) {
			for (int i = 0; i < numj; i++) {

				String nombre;
				nombre = "Jugador " + (i + 1);

				String[] Cartas = null;

				jugadores[i] = new Jugador(nombre, DineroInicial, PosInicial, Cartas, false, false, 0);

			}
		} else {
			System.out.println("Error el numero de jugadores no es correcto");
		}
		;
		return jugadores;
	}

	public static int pedirNumeroJugadores() {
		System.out.println("Cuantos jugadores sois (entre 2 y 8): ");

		int numeroJugadores = 0;
		Scanner Pedir = new Scanner(System.in);

		while (numeroJugadores == 0) {
			try {
				numeroJugadores = Integer.parseInt(Pedir.nextLine());
				if (numeroJugadores < 2 || numeroJugadores > 8) {
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
				if (numeroOpcion < 1 || numeroOpcion > 3) {
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
		System.out.println("2- Comprar casa / hotel ");
		System.out.println("3- Imprimir tablero ");
		System.out.println("4- Imprimir tablero de Casillas ");
		System.out.println("5- Guardar Partida");
		System.out.println("6- Exit");

		System.out.println("Escribe una de las opciones (1,2,3,4,5,6): ");

		int numeroOpcion = 0;
		Scanner Pedir = new Scanner(System.in);

		while (numeroOpcion == 0) {
			try {
				numeroOpcion = Integer.parseInt(Pedir.nextLine());
				if (numeroOpcion < 1 || numeroOpcion > 6) {
					numeroOpcion = 0;
					System.out.println("Debe introducir un número del 1 al 6");
				}
			} catch (Exception e) {
				numeroOpcion = 0;
				System.out.println("Debe introducir un número del 1 al 6");
			}
		}

		return numeroOpcion;
	}

	public static int pedirOpcionesJugador2() {
		System.out.println("Opciones");
		System.out.println("1- Tirar datos");
		System.out.println("2- Guardar Partida");
		System.out.println("3- Usar carta, si tienes");
		System.out.println("4- Pagar 50 para salir");
		System.out.println("5- Exit");

		System.out.println("Escribe una de las opciones (1,2,3,4): ");

		int numeroOpcion = 0;
		Scanner Pedir = new Scanner(System.in);

		while (numeroOpcion == 0) {
			try {
				numeroOpcion = Integer.parseInt(Pedir.nextLine());
				if (numeroOpcion < 1 || numeroOpcion > 4) {
					numeroOpcion = 0;
					System.out.println("Debe introducir un numero del 1 al 4");
				}
			} catch (Exception e) {
				numeroOpcion = 0;
				System.out.println("Debe introducir un numero del 1 al 4");
			}
		}

		return numeroOpcion;
	}

	public static boolean pedirConfirmarCompraPropiedad(String nombreCasilla, String nombreNuevaAdquisicion,
			int precioCompraCasilla) {

		System.out.println("¿Deseas comprar " + nombreNuevaAdquisicion + " en " + nombreCasilla + " por "
				+ precioCompraCasilla + "€?");

		System.out.println("1- Si");
		System.out.println("2- No");

		System.out.println("Escribe una de las opciones (1,2): ");

		int numeroOpcion = 0;
		Scanner Pedir = new Scanner(System.in);

		while (numeroOpcion == 0) {
			try {
				numeroOpcion = Integer.parseInt(Pedir.nextLine());
				if (numeroOpcion < 1 || numeroOpcion > 2) {
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
				if (numeroOpcion < 1 || numeroOpcion > 2) {
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

	public static void comprarCasa(Jugador jugadorActual) {

		String idcasilla;
		System.out.println("Propiedad que quieres comprar casa: ");
		Scanner pedir = new Scanner(System.in);
		idcasilla = pedir.nextLine();
		String[] propiedad = Tablero.getPropiedad(idcasilla);
		String[] casilla = Tablero.getCasilla(idcasilla);

		if (propiedad[1] == jugadorActual.getNombre()) {
			int casasactuales = Integer.parseInt(propiedad[2]);
			if (casasactuales >= 0 || casasactuales < 4) {
				int precioCasa = Integer.parseInt(casilla[3]);
				System.out.println("La propiedad: " + propiedad[0] + "tiene, actualmente " + propiedad[2] + "casa");
				System.out.println("Puedes comprar " + (4 - casasactuales) + "casas, cuantas quieres comprar:");
				Scanner pedir2 = new Scanner(System.in);
				int comprar = Integer.parseInt(pedir2.nextLine());

				if (comprar >= 1 || comprar <= 4) {
					int gasto = precioCasa * comprar;
					jugadorActual.disminuirDinero(gasto);
					propiedad[2] = Integer.toString(comprar);
					System.out.println("Has comprado " + comprar + " casas en " + propiedad[0]);
				} else {
					System.out.println("No se ha podido comprar");
				}
			} else if (casasactuales == 4) {
				System.out.println("Puedes comprar un hotel, quieres  comprar un hotel ? 1-Si, 2-No");
				int precioHotel = Integer.parseInt(casilla[4]);
				Scanner pedir3 = new Scanner(System.in);
				int comprarH = Integer.parseInt(pedir3.nextLine());

				if (comprarH == 1) {
					System.out.println("Se ha realizado la compra del hotel");
					jugadorActual.disminuirDinero(precioHotel);
					propiedad[2] = Integer.toString(5);
				} else if (comprarH == 2) {
					System.out.println("No se ha realizado la compra");
				} else {
					System.out.println("No se ha comprado nada");
				}
			} else if (casasactuales == 5) {
				System.out.println("No se puedes comprar mas en esta propiedad");
			}
		} else {
			System.out.println("No puedes comprar casas ni hotel aquí");
		}
	}

	public static void imprimirTablero() {

		String[][] propiedad = Tablero.getPropiedades();
		;

		for (int x = 0; x < propiedad.length; x++) {
			System.out.print("|");
			for (int y = 0; y < propiedad[x].length; y++) {
				System.out.print(propiedad[x][y]);
				if (y != propiedad[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}
	}

	public static void imprimirCasillas() {

		String[][] casilla = Tablero.getCasillas();
		System.out.println("Se impimen siguiendo el siguiente orden: ");
		System.out.println("IdCasilla,  Precio Casa, Precio Hotel, Alquiler, 1 Casa, 2 Casas, 3 Casas, 4 casas, Hotel");
		System.out.println("");
		for (int x = 0; x < casilla.length; x++) {
			System.out.print("|");
			for (int y = 0; y < casilla[x].length; y++) {
				System.out.print(casilla[x][y]);
				if (y != casilla[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}
	}

	public static String introducirNombreFichero() {
		System.out.println("Introduce el nombre del fichero:");

		String nombrefichero = "";
		Scanner pedir = new Scanner(System.in);

		while (nombrefichero.equals("")) {
			try {
				nombrefichero = pedir.nextLine();

			} catch (Exception e) {
				nombrefichero = "";
				System.out.println("Introduce el nombre del fichero:");
			}
		}
		return nombrefichero;
	}

}
