package agentes;

import agentes.Tablero;
import agentes.Jugador;

public class Casilla {
	
	public static void propiedad(String nombreCasilla, Jugador jugadorActual) {

		String[][] propiedades = Tablero.getPropiedades();
		
		boolean encontrado = false;
        for (int i = 0; i < propiedades.length; i++) {  
            if (propiedades[i][0].equals(nombreCasilla)) {
                encontrado = true;
                
                if(propiedades[i][1].equals("Banca")) {
                	
                	comprar(nombreCasilla, jugadorActual);
                	
                }else if(propiedades[i][1].equals(jugadorActual.getNombre())) {
                	
                	//Nada 
                	
                	}
                else {
                	
                	pagarAlquilerPropiedad(nombreCasilla, jugadorActual);
                }
                
                break; // Paramos busqueda
                
            } else {
                encontrado = false;
            }
        }   
	}
	public static void estacion(String nombreCasilla, Jugador jugadorActual) {
String[][] propiedades = Tablero.getPropiedades();
		
		boolean encontrado = false;
        for (int i = 0; i < propiedades.length; i++) {  
            if (propiedades[i][0].equals(nombreCasilla)) {
                encontrado = true;
                
                if(propiedades[i][1].equals("Banca")) {
                	
                	comprar(nombreCasilla, jugadorActual);
                	
                }else if(propiedades[i][1].equals(jugadorActual.getNombre())) {
                	
                	//Nada 
                	
                	}
                else {
                	
                	pagarAlquilerEstacion(nombreCasilla, jugadorActual);
                }
                
                break; // Paramos busqueda
                
            } else {
                encontrado = false;
            }
        }
	}
	
	public static void suerte() {
		
	}
	
	public static void cajacom() {
		
	}
	//***********************************************Metodos de ajustar casillas*****************************************
	public static void comprar(String nombreCasilla, Jugador jugadorActual){
		
		String[][] propiedades = Tablero.getPropiedades();
		String[][] casillas = Tablero.getPropiedades();
		
		boolean encontrado = false;
        for (int i = 0; i < casillas.length; i++) {  
            if (casillas[i][0].equals(nombreCasilla)) {
                encontrado = true;
                
                boolean encontrado2 = false;
                for (int j = 0; j < propiedades.length; j++) {  
                    if (propiedades[i][0].equals(nombreCasilla)) {
                        encontrado2 = true;
                        
                        //falta comprar si puedo o no comprar la casilla
                        
                        propiedades[i][1] = jugadorActual.getNombre();
                        
                        jugadorActual.disminuirDinero(Integer.parseInt(casillas[i][2]));
                        
                        break; // Paramos busqueda
                        
                    } else {
                        encontrado2 = false;
                    }
                } 
                
                break; // Paramos busqueda
                
            } else {
                encontrado = false;
            }
        } 	
	}
	public static void pagarAlquilerPropiedad(String nombreCasilla, Jugador jugadorActual){
		
		String[][] propiedades = Tablero.getPropiedades();
		String[][] casillas = Tablero.getPropiedades();
		
		boolean encontrado = false;
        for (int i = 0; i < casillas.length; i++) {  
            if (casillas[i][0].equals(nombreCasilla)) {
                encontrado = true;
                
                boolean encontrado2 = false;
                for (int j = 0; j < propiedades.length; j++) {  
                    if (propiedades[i][0].equals(nombreCasilla)) {
                        encontrado2 = true;
                        
                        int casas = Integer.parseInt(propiedades[i][2]);
                        int pagar;  
                        		
                        if(casas == 0) {
                        	pagar = Integer.parseInt(casillas[i][5]);
                        	jugadorActual.disminuirDinero(pagar);
                        }else if(casas == 1) {
                        	pagar = Integer.parseInt(casillas[i][6]);
                        	jugadorActual.disminuirDinero(pagar);
                    	}else if(casas == 2) {
                    		pagar = Integer.parseInt(casillas[i][7]);
                    		jugadorActual.disminuirDinero(pagar);
                    	}else if(casas == 3) {
                    		pagar = Integer.parseInt(casillas[i][8]);
                    		jugadorActual.disminuirDinero(pagar);
                    	}else if(casas == 4) {
                    		pagar = Integer.parseInt(casillas[i][9]);
                    		jugadorActual.disminuirDinero(pagar);
                    	}else if(casas == 5) {
                    		pagar = Integer.parseInt(casillas[i][10]);
                    		jugadorActual.disminuirDinero(pagar);
                    	}
                        	
                        break; // Paramos busqueda
                        
                    } else {
                        encontrado2 = false;
                    }
                } 
                
                break; // Paramos busqueda
                
            } else {
                encontrado = false;
            }
        } 	
	}
	public static void pagarAlquilerEstacion(String nombreCasilla, Jugador jugadorActual){
		
		String[][] propiedades = Tablero.getPropiedades();
		String[][] casillas = Tablero.getPropiedades();
		
		boolean encontrado = false;
        for (int i = 0; i < casillas.length; i++) {  
            if (casillas[i][0].equals(nombreCasilla)) {
                encontrado = true;
                
                boolean encontrado2 = false;
                for (int j = 0; j < propiedades.length; j++) {  
                    if (propiedades[i][0].equals(nombreCasilla)) {
                        encontrado2 = true;
                        
                        int numEsta = Integer.parseInt(propiedades[i][2]);
                        int pagar;  
                        		
                        if(numEsta == 0) {
                        	pagar = Integer.parseInt(casillas[i][3]);
                        	jugadorActual.disminuirDinero(pagar);
                        }else if(numEsta == 1) {
                        	pagar = Integer.parseInt(casillas[i][4]);
                        	jugadorActual.disminuirDinero(pagar);
                    	}else if(numEsta == 2) {
                    		pagar = Integer.parseInt(casillas[i][5]);
                    		jugadorActual.disminuirDinero(pagar);
                    	}else if(numEsta == 3) {
                    		pagar = Integer.parseInt(casillas[i][6]);
                    		jugadorActual.disminuirDinero(pagar);
                    	}
                        	
                        break; // Paramos busqueda
                        
                    } else {
                        encontrado2 = false;
                    }
                } 
                
                break; // Paramos busqueda
                
            } else {
                encontrado = false;
            }
        } 	
	}
}
