package agentes;

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
		
        if(propiedad[1].equals("Banca")) {
//        	comprar(idCasilla, nombreCasilla, jugadorActual);
        } else if(!propiedad[1].equals(jugadorActual.getNombre())) {	
        	pagarAlquilerEstacion(idCasilla, nombreCasilla, jugadorActual);
        }
	
	}
	
	public static void suerte() {
		
	}
	
	public static void cajacom() {
		
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
        	System.out.println("No puedes comprar más inmuebles en " + nombreCasilla);
        } else { // Compra casa
        	precioCompraCasilla = Integer.parseInt(casilla[3]);
        	nombreNuevaAdquisicion = "una casa";
        }
		
		
		if (numCasas != 5 && Util.pedirConfirmarCompra(nombreCasilla, nombreNuevaAdquisicion, precioCompraCasilla)) {
			if (jugadorActual.disminuirDinero(precioCompraCasilla)) {
				propiedad[1] = jugadorActual.getNombre();
				propiedad[2] = String.valueOf(numCasas + 1); // Incrementa en 1 la propiedad
			}
		} 
    
	}

	public static void pagarAlquilerPropiedad(String idCasilla, String nombreCasilla, Jugador jugadorActual){
		
		String[] propiedad = Tablero.getPropiedad(idCasilla);
		String[] casilla = Tablero.getCasilla(idCasilla);

        int casas = Integer.parseInt(propiedad[2]);
        int pagar;  
        		
        if(casas == 0) {
        	pagar = Integer.parseInt(casilla[5]);
        	jugadorActual.disminuirDinero(pagar);
        }else if(casas == 1) {
        	pagar = Integer.parseInt(casilla[6]);
        	jugadorActual.disminuirDinero(pagar);
    	}else if(casas == 2) {
    		pagar = Integer.parseInt(casilla[7]);
    		jugadorActual.disminuirDinero(pagar);
    	}else if(casas == 3) {
    		pagar = Integer.parseInt(casilla[8]);
    		jugadorActual.disminuirDinero(pagar);
    	}else if(casas == 4) {
    		pagar = Integer.parseInt(casilla[9]);
    		jugadorActual.disminuirDinero(pagar);
    	}else if(casas == 5) {
    		pagar = Integer.parseInt(casilla[10]);
    		jugadorActual.disminuirDinero(pagar);
    	}     
        	
	}
	
	public static void pagarAlquilerEstacion(String idCasilla, String nombreCasilla, Jugador jugadorActual){
		
		String[] propiedad = Tablero.getPropiedad(idCasilla);
		String[] casilla = Tablero.getCasilla(idCasilla);
		
        int numEsta = Integer.parseInt(propiedad[2]);
        int pagar;  
        		
        if(numEsta == 0) {
        	pagar = Integer.parseInt(casilla[3]);
        	jugadorActual.disminuirDinero(pagar);
        }else if(numEsta == 1) {
        	pagar = Integer.parseInt(casilla[4]);
        	jugadorActual.disminuirDinero(pagar);
    	}else if(numEsta == 2) {
    		pagar = Integer.parseInt(casilla[5]);
    		jugadorActual.disminuirDinero(pagar);
    	}else if(numEsta == 3) {
    		pagar = Integer.parseInt(casilla[6]);
    		jugadorActual.disminuirDinero(pagar);
    	}                       
    
	}
}
