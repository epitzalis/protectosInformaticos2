package Agentes;

public class Casilla {
		//Matriz de casillas 
		//Falta en as casillas propiedades: id	Nombre Precio	CosteCasa	CosteHotel	Alquiler 1CASA	2C	3C	HOTEL
			
		String[][] Casillas;
		
		public String[][] llamarCasilla(){
			String[][] Casillas = {{"1", "Salida"}, {"2", "Propiedad 1"}, {"3", "Caja comunitaria"},
					{"4", "Propiedad 2"}, {"5", "Impuestos sobre el Capital"}, {"6", "Estación 1"}, 
					{"7", "Propiedad 3"}, {"8", "Suerte"}, {"9", "Propiedad 4"}, {"19", "Propiedad 5"},
					{"11", "Carcel"}, {"12", "Propiedad 6"},{"13", "Compañia electricidad"},{"14", "Propiedad 7"},
					{"15", "Propiedad 8"},{"16", "Estación 2"},{"17", "Propiedad 9"},{"18", "Cja Comunitaria"},
					{"19", "Propiedad 10"}, {"20", "Propiedad 11"},{"21", "Estacionamiento Gratuito"},
					{"22", "Propiedad 12"},{"23", "Suerte"},{"24", "Propiedad 13"}, {"25", "Propiedad 14"},
					{"26", "Estación 3"}, {"27", "Propiedad 15"}, {"28", "Propiedad 16"},{"29", "Compañia del agua"},
					{"30", "Propiedad 17"},{"31", "Ve a la Carcel"},{"32", "Propiedad 18"}, {"33", "Propiedad 19"},
					{"34", "Caja Comunitaria"},{"35", "Propiedad 20"},{"36", "Estación 4"}, {"37", "Suerte"},
					{"38", "Propiedad 21"},{"39", "Impuestos de lujo"},{"40", "Propiedad 22"}};
			return Casillas;
		}

		public String[][] getCasillas() {
			return Casillas;
		}

		public void setCasillas(String[][] casillas) {
			Casillas = casillas;
		}
		
}
