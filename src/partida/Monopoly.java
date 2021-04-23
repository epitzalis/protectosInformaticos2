package partida;

import agentes.Jugador;
import utiles.Util;

public class Monopoly {
	
	static final int Max_jugadores = 8;
	static final int Dinero_inicial = 10000;
	static final int Pos_inicial = 1;
	
    public static void main(String[] args) {
    	    	
    	
    	int pedir = Util.pedirOpcionesInicio();

//		while(true) {
    	switch(pedir) {
    		case 1:
    			int numJug = Util.pedirNumeroJugadores();
        		Jugador jugadores [] = Monopoly.crearJugador(numJug);
        		Partida partida = new Partida(jugadores);
        		partida.comenzar();
    			break;
    		case 2:
                // Cargar partida 
    			System.out.println("NO ESTÁ IMPLEMENTADO CARGAR PARTIDA");
    			break;
    		case 3:
    			System.out.println("\nSaliste de la partida");
    			System.exit(0);		
    			break;
    		default:
    			break;
		}
//		}
    }
    
    private static Jugador[] crearJugador(int numj) {
    	
//    	System.out.println("Vamos a crear jugadores con un maximo de 8");
    	Jugador jugadores [] = new Jugador[numj];	
    	
    	if(numj >=2 & numj<=8) {
	    	for(int i =0 ; i < numj; i++) {

	    		String nombre;
	    		nombre = "Jugador " + (i + 1);

	    		String[][] Propiedades= null;
	    		String[] Cartas = null;
	    		
	    		jugadores[i] = new Jugador(nombre, Dinero_inicial, Pos_inicial, Propiedades, Cartas );
	    		   		
	    	}
		}else {
			System.out.println("Error el numero de jugadores no es correcto");
		};
		return jugadores;
    }   
}
