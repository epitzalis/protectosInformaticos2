package partida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

import agentes.Jugador;
import utiles.Util;

public class Fichero {

	public static void exportarFichero(Jugador[] jugadores, int cajaBanca, String nombreJugadorActual,
			String[][] propiedades) {

		DatosPartida datosPartida = new DatosPartida(jugadores, cajaBanca, nombreJugadorActual, propiedades);

		JsonObject jsObj = (JsonObject) new Gson().toJsonTree(datosPartida);

		String nombreFichero = "partida" + Long.toString(new Date().getTime()) + ".json";
		try {
			File archivo = new File(nombreFichero);
			FileWriter escribir = new FileWriter(archivo, true);
			escribir.write(jsObj.toString());
			escribir.close();
			System.out.println("Fichero exportado correctamente con el nombre: " + nombreFichero);
		} catch (IOException e) {
			System.out.println("Error al escribir el fichero");
		}

	}

	public static DatosPartida importarFichero() {

		DatosPartida datosPartida = null;
		Gson gson = new Gson();

		String nombreFichero = Util.introducirNombreFichero();

		try {
			datosPartida = gson.fromJson(new FileReader(nombreFichero), DatosPartida.class);
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			System.out.println(
					"Error leyendo el archivo, verifique el nombre del fichero y vuelva a ejecutar la aplicacion");
			System.exit(0);
		}

		return datosPartida;

	}

}
