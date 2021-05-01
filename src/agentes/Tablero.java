package agentes;

import java.util.ArrayList;

public class Tablero {
	
	 //static Casilla obj = new Casilla();
	//Falta en as casillas propiedades: id	Nombre Precio	CosteCasa	CosteHotel	Alquiler 1CASA	2C	3C	HOTEL
	static final int precioCompraEstacion = 200;
	
	static String[][] Casillas = {
			{"1", "Salida"}, 
			{"2", "Propiedad 1", "60","50","100","2","10","30","90","160","250"}, 
			{"3", "Caja comunitaria"},
			{"4", "Propiedad 2", "60","50","100","4","20","60","180","320","450"}, 
			{"5", "Impuestos sobre el Capital"},
			{"6", "Estacion 1", "25", "50", "100", "200"},
			{"7", "Propiedad 3","100","50","100","6","30","90","270","400","550"},
			{"8", "Suerte"}, 
			{"9", "Propiedad 4","100","50","100","6","30","90","270","400","550"}, 
			{"10", "Propiedad 5","120","50","100","8","40","100","300","450","600"},
			{"11", "Carcel"}, 
			{"12", "Propiedad 6","140","100","200","10","50","150","450","625","750"},
			{"13", "Compania electricidad"},
			{"14", "Propiedad 7","140","100","200","10","50","150","450","625","750"},
			{"15", "Propiedad 8","160","100","200","12","60","180","500","700","900"},
			{"16", "Estacion 2", "25", "50", "100", "200"},
			{"17", "Propiedad 9","180","100","200","14","70","200","550","700","950"},
			{"18", "Caja Comunitaria"},
			{"19", "Propiedad 10","180","100","200","14","70","200","550","700","950"}, 
			{"20", "Propiedad 11","200","100","200","16","80","220","600","800","1000"},
			{"21", "Estacionamiento Gratuito"},
			{"22", "Propiedad 12","220","150","300","18","90","250","700","875","1050"},
			{"23", "Suerte"},
			{"24", "Propiedad 13","220","150","300","18","90","250","700","875","1050"}, 
			{"25", "Propiedad 14","240","150","300","20","100","300","750","925","1100"},
			{"26", "Estacion 3", "25", "50", "100", "200"}, 
			{"27", "Propiedad 15","260","150","300","22","110","330","800","975","1150"}, 
			{"28", "Propiedad 16","260","150","300","22","110","330","800","975","1150"},
			{"29", "Compania del agua"},
			{"30", "Propiedad 17","280","150","300","24","120","360","850","1025","1200"},
			{"31", "Ve a la Carcel"},
			{"32", "Propiedad 18","300","200","400","26","130","390","900","1100","1275"}, 
			{"33", "Propiedad 19","300","200","400","26","130","390","900","1100","1275"},
			{"34", "Caja Comunitaria"},
			{"35", "Propiedad 20","320","200","400","28","150","450","1000","1200","1400"},
			{"36", "Estacion 4", "25", "50", "100", "200"}, 
			{"37", "Suerte"},
			{"38", "Propiedad 21","350","200","400","35","175","500","1100","1300","1500"},
			{"39", "Impuestos de lujo"},
			{"40", "Propiedad 22","400","200","400","50","200","600","1400","1700","2000"}};
	
	
//	Ninguna Propiedades es -1
//	Comprar sin casa es 0
//	Comprar casas suma 1 (de 1 a 4)
//	Comprar un hotel es 5
	// ID propiedad, nombre jugador, numero de casas (de 0 a 5, 5 es un hotel)
	static String[][] Propiedades = {
			{"1", "Banca"},
			{"2", "Banca", "-1"},
			{"3", "Banca"},
			{"4", "Banca", "-1"},
			{"5", "Banca"},
			{"6", "Banca", "0"},
			{"7", "Banca", "-1"},
			{"8", "Banca"},
			{"9", "Banca", "-1"},
			{"10", "Banca", "-1"},
			{"11", "Banca"},
			{"12", "Banca", "-1"},
			{"13", "Banca"},
			{"14", "Banca", "-1"},
			{"15", "Banca", "-1"},
			{"16", "Banca", "0"},
			{"17", "Banca", "-1"},
			{"18", "Banca"},
			{"19", "Banca", "-1"},
			{"20", "Banca", "-1"},
			{"21", "Banca"},
			{"22", "Banca", "-1"},
			{"23", "Banca"},
			{"24", "Banca", "-1"},
			{"25", "Banca", "-1"},
			{"26", "Banca", "0"},
			{"27", "Banca", "-1"},
			{"28", "Banca", "-1"},
			{"29", "Banca"},
			{"30", "Banca", "-1"},
			{"31", "Banca"},
			{"32", "Banca", "-1"},
			{"33", "Banca", "-1"},
			{"34", "Banca"},
			{"35", "Banca", "-1"},
			{"36", "Banca", "0"},
			{"37", "Banca"},
			{"38", "Banca", "-1"},
			{"39", "Banca"},
			{"40", "Banca", "-1"}
	};
	
	public static void imprimirTablero() {
		for (int x=0; Casillas.length < 40; x++) {
			        System.out.println( "id: "+ Casillas[x][0]+" Nombre: " + Casillas[x][1]);			  
			}
    }
	
	public static void MostrarCasilla(String casillas, String nombre) {
		System.out.println("Id (Posicion): " + casillas);
		System.out.println("Nombre de la casilla: " + nombre);
	}

	public static String[][] getCasillas() {
		return Casillas;
	}
	
	public static String[][] getPropiedades() {
		return Propiedades;
	}

	public static void setCasillas(String[][] casillas) {
		Casillas = casillas;
	}
	
	public static String[] getPropiedad(String idPropiedad) {
		boolean esEncontrada = false;
		int index = 0;
		for (int i = 0; i < Propiedades.length && esEncontrada == false; i++) {
			if (idPropiedad.equals(Propiedades[i][0]) ) {
				esEncontrada = true;
				index = i;
			}
		}
		return Propiedades[index];
	}
	
	public static String[] getPropiedad(int idPropiedad) {
		boolean esEncontrada = false;
		int index = 0;
		for (int i = 0; i < Propiedades.length && esEncontrada == false; i++) {
			if (idPropiedad == Integer.parseInt(Propiedades[i][0]) ) {
				esEncontrada = true;
				index = i;
			}
		}
		return Propiedades[index];
	}
	
	public static String[] getCasilla(String idCasilla) {
		boolean esEncontrada = false;
		int index = 0;
		for (int i = 0; i < Casillas.length && esEncontrada == false; i++) {
			if (idCasilla.equals(Casillas[i][0]) ) {
				esEncontrada = true;
				index = i;
			}
		}
		return Casillas[index];
	}
	
	public static String[] getCasilla(int idCasilla) {
		boolean esEncontrada = false;
		int index = 0;
		for (int i = 0; i < Casillas.length && esEncontrada == false; i++) {
			if (idCasilla == Integer.parseInt(Casillas[i][0]) ) {
				esEncontrada = true;
				index = i;
			}
		}
		return Casillas[index];
	}
	
	public static int getCantidadEstacionesJugador(String nombreJugador) {
		ArrayList<String> idsEstaciones = new ArrayList<String>();
		int cantidadEstacionesJugador = 0;
		int i = 0;
		
		// Encuentra los IDs de las estaciones
		for (i = 0; i < Casillas.length; i++) {
			if (Casillas[i][1].contains("Estacion")) {
				idsEstaciones.add(Casillas[i][0]);
			}
		}
		
		// Con los IDs comprueba cuantas estaciones pertenecen a un jugador
	    for (i = 0; i < idsEstaciones.size(); i++) {
	    	if (getPropiedad(idsEstaciones.get(i))[1].equals(nombreJugador)) {
	    		cantidadEstacionesJugador++;
			}
	    }
		
		return cantidadEstacionesJugador;
	}
	
}
	
