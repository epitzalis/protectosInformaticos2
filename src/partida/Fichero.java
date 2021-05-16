package partida;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.json.JSONObject;

import agentes.Jugador;


public class Fichero {
	
	public static void exportarFichero(Jugador[] jugadores, int cajaBanca, String nombreJugadorActual, String[][] propiedades){
		JSONObject jo = new JSONObject();
		jo.put("jugadores", jugadores);
		jo.put("cajaBanca", cajaBanca);
		jo.put("nombreJugadorActual", nombreJugadorActual);
		jo.put("propiedades", propiedades);
		
		String nombreFichero = "Copia partida " + Long.toString(new Date().getTime()) + ".json";
		try {
			File archivo = new File(nombreFichero);
			FileWriter escribir = new FileWriter(archivo, true);
			escribir.write(jo.toString());
			escribir.close();
			System.out.println("Fichero exportado correctamente con el nombre: " + nombreFichero);
		}catch (IOException e) {
			System.out.println("Error al escribir el fichero");
		}

	}
//	
//	public static void exportarFichero(Jugador[] jugadores, int cajaBanca, int turno, String[][] propiedades){
//		JSONObject jo = new JSONObject();
//		jo.put("jugadores", jugadores);
//		jo.put("cajaBanca", cajaBanca);
//		jo.put("turno", turno);
//		jo.put("propiedades", propiedades);
//		
//		String nombreFichero = "Copia partida " + Long.toString(new Date().getTime()) + ".json";
//		try {
//			File archivo = new File(nombreFichero);
//			FileWriter escribir = new FileWriter(archivo, true);
//			escribir.write(jo.toString());
//			escribir.close();
//			System.out.println("Fichero exportado correctamente con el nombre: " + nombreFichero);
//		}catch (IOException e) {
//			System.out.println("Error al escribir el fichero");
//		}
//
//	}

}
