package agentes;

import partida.Partida;
import utiles.Util;

public class Casilla {
	
	public static void propiedad(String idCasilla, String nombreCasilla, Jugador jugadorActual) {

		String[] propiedad = Tablero.getPropiedad(idCasilla);

        if(propiedad[1].equals("Banca") || propiedad[1].equals(jugadorActual.getNombre())) {
        	comprarPropiedad(idCasilla, nombreCasilla, jugadorActual);
        } else {	
        	pagarAlquilerPropiedad(idCasilla, nombreCasilla, jugadorActual);
        }
                  
	}
	
	public static void estacion(String idCasilla, String nombreCasilla, Jugador jugadorActual) {
		String[] propiedad = Tablero.getPropiedad(idCasilla);
		
		if(propiedad[1].equals("Banca") || propiedad[1].equals(jugadorActual.getNombre())) {
        	comprarEstacion(idCasilla, nombreCasilla, jugadorActual);
        } else if(!propiedad[1].equals(jugadorActual.getNombre())) {	
        	pagarAlquilerEstacion(idCasilla, nombreCasilla, jugadorActual);
        }
	
	}
	
	public static void servicio(String idCasilla, String nombreCasilla, Jugador jugadorActual, int dado) {
		
		String[] propiedad = Tablero.getPropiedad(idCasilla);
		String[] electrico = Tablero.getPropiedad(13);
		String[] aguas = Tablero.getPropiedad(29);
		String propietarioCasilla = propiedad[1];
		int pagar = 0;
		
		if(propiedad[1].equals("Banca") || propiedad[1].equals(jugadorActual.getNombre())) {
			comprarServicio(idCasilla, nombreCasilla, jugadorActual);
        } else if(!propiedad[1].equals(jugadorActual.getNombre())) {	
        	if(electrico[1] == aguas[1]) {
        		pagar = dado * 10;
        		jugadorActual.aumentarDinero(pagar);
        		aumentarDineroJugador(propietarioCasilla, pagar);
        	}else {
        		pagar = dado * 4;
        		jugadorActual.aumentarDinero(pagar);
        		aumentarDineroJugador(propietarioCasilla, pagar);
        	}
        }
	}
	//***********************************************Metodos de ajustar casillas*****************************************
	
	public static void comprarPropiedad(String idCasilla, String nombreCasilla, Jugador jugadorActual){
		String[] propiedad = Tablero.getPropiedad(idCasilla);
		String[] casilla = Tablero.getCasilla(idCasilla);
		int numCasas = Integer.parseInt(propiedad[2]);
		int precioCompraCasilla = 0; 
		String nombreNuevaAdquisicion = "";
		
		if(propiedad[1].equals("Banca")) { // numCasas == -1
			precioCompraCasilla = Integer.parseInt(casilla[2]);
			nombreNuevaAdquisicion = "la primera propiedad";
        } else if (numCasas == 4) { // Compra hotel
        	precioCompraCasilla = Integer.parseInt(casilla[4]);
        	nombreNuevaAdquisicion = "un hotel";
        } else if (numCasas == 5) {
        	System.out.println("No puedes comprar mas inmuebles en " + nombreCasilla);
        } else { // Compra casa
        	precioCompraCasilla = Integer.parseInt(casilla[3]);
        	nombreNuevaAdquisicion = "una casa";
        }
		
		
		if (numCasas != 5 && Util.pedirConfirmarCompraPropiedad(nombreCasilla, nombreNuevaAdquisicion, precioCompraCasilla)) {
			if (jugadorActual.disminuirDinero(precioCompraCasilla)) {
				propiedad[1] = jugadorActual.getNombre();
				propiedad[2] = String.valueOf(numCasas + 1); // Incrementa en 1 la propiedad
			}
		} 
    
	}

	public static void pagarAlquilerPropiedad(String idCasilla, String nombreCasilla, Jugador jugadorActual) {
		
		String[] propiedad = Tablero.getPropiedad(idCasilla);
		String[] casilla = Tablero.getCasilla(idCasilla);
		String propietarioCasilla = propiedad[1];

        int casas = Integer.parseInt(propiedad[2]);
        int cantidadPagar = 0;  
        		
        if (casas == 0) {
        	cantidadPagar = Integer.parseInt(casilla[5]);
        } else if (casas == 1) {
        	cantidadPagar = Integer.parseInt(casilla[6]);
    	} else if (casas == 2) {
    		cantidadPagar = Integer.parseInt(casilla[7]);
    	} else if (casas == 3) {
    		cantidadPagar = Integer.parseInt(casilla[8]);
    	} else if (casas == 4) {
    		cantidadPagar = Integer.parseInt(casilla[9]);
    	} else if (casas == 5) {
    		cantidadPagar = Integer.parseInt(casilla[10]);
    	}     
        System.out.println("Has caido en " + nombreCasilla + " que pertenece al " + propietarioCasilla + ", tienes que pagar " + cantidadPagar);
        jugadorActual.disminuirDinero(cantidadPagar);
        aumentarDineroJugador(propietarioCasilla, cantidadPagar);
	}
	
	public static void comprarEstacion(String idCasilla, String nombreCasilla, Jugador jugadorActual) {
		String[] propiedad = Tablero.getPropiedad(idCasilla);
		
		int precioCompraCasilla = Tablero.precioCompraEstacion;
		
		if (Util.pedirConfirmarCompraEstacion(nombreCasilla, precioCompraCasilla)) {
			if (jugadorActual.disminuirDinero(precioCompraCasilla)) {
				propiedad[1] = jugadorActual.getNombre();
			}
		} 
	}
	
	public static void pagarAlquilerEstacion(String idCasilla, String nombreCasilla, Jugador jugadorActual) {
		
		String[] propiedad = Tablero.getPropiedad(idCasilla);
		String[] casilla = Tablero.getCasilla(idCasilla);
		String propietarioCasilla = propiedad[1];
		
		int cantidadEstacionesPropietario = Tablero.getCantidadEstacionesJugador(propietarioCasilla);
		int posicionArrayPagar = 1 + cantidadEstacionesPropietario;
		
		int cantidadPagar = Integer.parseInt(casilla[posicionArrayPagar]);
		
        System.out.println("Has caido en " + nombreCasilla + " que pertenece al " + propietarioCasilla + ",como tiene " + cantidadEstacionesPropietario + 
        			" tienes que pagar " + cantidadPagar);

        jugadorActual.disminuirDinero(cantidadPagar);
        aumentarDineroJugador(propietarioCasilla, cantidadPagar);                   
    
	}
	
	public static void comprarServicio(String idCasilla, String nombreCasilla, Jugador jugadorActual) {
		String[] propiedad = Tablero.getPropiedad(idCasilla);
		
		int precioCompraCasilla = Tablero.precioCompraEstacion;
		
		if (Util.pedirConfirmarCompraEstacion(nombreCasilla, precioCompraCasilla)) {
			if (jugadorActual.disminuirDinero(precioCompraCasilla)) {
				propiedad[1] = jugadorActual.getNombre();
			}
		} 
	}
	
	private static void aumentarDineroJugador(String nombreJugador, int cantidad) {
		Partida.aumentarDineroJugador(nombreJugador, cantidad);
	}
	
	private static void disminuirDineroJugador(String nombreJugador, int cantidad) {
		Partida.disminuirDineroJugador(nombreJugador, cantidad);
	}

}
