package agentes;

public class Tablero {
	
	 //static Casilla obj = new Casilla();
	//Falta en as casillas propiedades: id	Nombre Precio	CosteCasa	CosteHotel	Alquiler 1CASA	2C	3C	HOTEL
	
	static String[][] Casillas = {
			{"1", "Salida"}, 
			{"2", "Propiedad 1", "60","50","100","2","10","30","90","160","250"}, 
			{"3", "Caja comunitaria"},
			{"4", "Propiedad 2", "60","50","100","4","20","60","180","320","450"}, 
			{"5", "Impuestos sobre el Capital"}, 
			{"6", "Estaci�n 1"}, 
			{"7", "Propiedad 3","100","50","100","6","30","90","270","400","550"}, 
			{"8", "Suerte"}, 
			{"9", "Propiedad 4","100","50","100","6","30","90","270","400","550"}, 
			{"10", "Propiedad 5","120","50","100","8","40","100","300","450","600"},
			{"11", "Carcel"}, 
			{"12", "Propiedad 6","140","100","200","10","50","150","450","625","750"},
			{"13", "Compa�ia electricidad"},
			{"14", "Propiedad 7","140","100","200","10","50","150","450","625","750"},
			{"15", "Propiedad 8","160","100","200","12","60","180","500","700","900"},
			{"16", "Estaci�n 2"},
			{"17", "Propiedad 9","180","100","200","14","70","200","550","700","950"},
			{"18", "Cja Comunitaria"},
			{"19", "Propiedad 10","180","100","200","14","70","200","550","700","950"}, 
			{"20", "Propiedad 11","200","100","200","16","80","220","600","800","1000"},
			{"21", "Estacionamiento Gratuito"},
			{"22", "Propiedad 12","220","150","300","18","90","250","700","875","1050"},
			{"23", "Suerte"},
			{"24", "Propiedad 13","220","150","300","18","90","250","700","875","1050"}, 
			{"25", "Propiedad 14","240","150","300","20","100","300","750","925","1100"},
			{"26", "Estaci�n 3"}, 
			{"27", "Propiedad 15","260","150","300","22","110","330","800","975","1150"}, 
			{"28", "Propiedad 16","260","150","300","22","110","330","800","975","1150"},
			{"29", "Compa�ia del agua"},
			{"30", "Propiedad 17","280","150","300","24","120","360","850","1025","1200"},
			{"31", "Ve a la Carcel"},
			{"32", "Propiedad 18","300","200","400","26","130","390","900","1100","1275"}, 
			{"33", "Propiedad 19","300","200","400","26","130","390","900","1100","1275"},
			{"34", "Caja Comunitaria"},
			{"35", "Propiedad 20","320","200","400","28","150","450","1000","1200","1400"},
			{"36", "Estaci�n 4"}, 
			{"37", "Suerte"},
			{"38", "Propiedad 21","350","200","400","35","175","500","1100","1300","1500"},
			{"39", "Impuestos de lujo"},
			{"40", "Propiedad 22","400","200","400","50","200","600","1400","1700","2000"}};
	
	public static void imprimirTablero() {
        
		for (int x=0; Casillas.length < 40; x++) {
			        System.out.println( "id: "+ Casillas[x][0]+" Nombre: " + Casillas[x][1]);			  
			}
    }
	
	public static void MostrarCasilla(String casillas, String nombre) {
		
		System.out.println("Id (Posici�n): " + casillas);
		System.out.println("Nombre de la casilla: " + nombre);
		
	}

	public static String[][] getCasillas() {
		return Casillas;
	}

	public static void setCasillas(String[][] casillas) {
		Casillas = casillas;
	}
	
	public static String[] getCasilla(int posicion) {
		boolean esEncontrada = false;
		int index = 0;
		for (int i = 0; i < Casillas.length && esEncontrada == false; i++) {
			if (posicion == Integer.parseInt(Casillas[i][0]) ) {
				esEncontrada = true;
				index = i;
			}
		}
		return Casillas[index];
	}
	
}
	
