package partida;

import agentes.Jugador;
import utiles.Util;
import partida.Partida;;

public class Monopoly {
	
	static final int Max_jugadores = 8;
	
    public static void main(String[] args) {
    	    	
    	
    	int pedir = Util.pedirOpcionesInicio();

    	switch(pedir) {
    		case 1:
    			int numJug = Util.pedirNumeroJugadores();
        		Jugador jugadores [] = Util.crearJugador(numJug);
        		Partida partida = new Partida(jugadores);
        		Partida.Njugadores = numJug;
        		partida.comenzar();
    			break;
    		case 2:
                // Cargar partida 
    			System.out.println("NO ESTÃ� IMPLEMENTADO CARGAR PARTIDA");
    			break;
    		case 3:
    			System.out.println("\nSaliste de la partida");
    			System.exit(0);		
    			break;
    		default:
    			break;
		}
    }
    
  
}
