package agentes;

public class Jugador {
	
	private String Nombre;
	private int Dinero;
	private int Posicion;
//	private String[][] Propiedades;
	private String[] Cartas;
	
	//******************************************************** Metodos **********************************************************
	
	public Jugador(String nombre, int dinero, int posInicial, String[][] propiedades, String[] cartas) {
		
		this.Nombre = nombre;
		//System.out.println("Tu nombre es " + nombre);
		
		this.Dinero = dinero;
		//System.out.println("Tu Dinero es " + dinero);
		
		this.Posicion = posInicial;
		//System.out.println("Tu Posici�n es " + posicion);
		
//		this.Propiedades = propiedades;
		
		//System.out.println("Tus propiedades son: " );
		//for(int i=0;i<propiedades.length;i++) {
		//	System.out.println( i + " - " + propiedades[i] );
		//}
		
		this.Cartas = cartas;
		//System.out.println("Tus cartas son: ");
		//for(int j=0;j<propiedades.length;j++) {
		//	System.out.println( j + " - " + propiedades[j] );
		//}
	}
	
	public void aumentarDinero(int mas) {
		
		this.Dinero = this.Dinero + mas;
	}
	
	public void disminuirDinero(int menos) {
		
		this.Dinero = this.Dinero - menos;
		
	}
	
	public void mostrarDinero() {
		
		System.out.println("Dinero: " + this.Dinero);
	}
	
	public void nuevaPosicion(int dado) {
		
		if((this.Posicion + dado)<=40) {
			this.Posicion = this.Posicion + dado;
		}
		else {
			this.Posicion = this.Posicion + dado -40;
		}
	}
	public void mostrarPosicion() {
		System.out.println("Dinero: " + this.Posicion);
	}
	
	
	
	//********************************************************Get y Set **********************************************************
	public String getNombre() {
		return Nombre;
	}
	public int getDinero() {
		return Dinero;
	}
	public int getPosicion() {
		return Posicion;
	}
//	public String[][] getPropiedades() {
//		return Propiedades;
//	}
	public String[] getcartas() {
		return Cartas;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setDinero(int dinero) {
		Dinero = dinero;
	}
	public void setPosicion(int posicion) {
		Posicion = posicion;
	}
//	public void setPropiedades(String[][] propiedades) {
//		Propiedades = propiedades;
//	}
	public void setCartas(String[] cartas) {
		Cartas = cartas;
	}
}

