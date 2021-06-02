package agentes;

public class Jugador {

	private String Nombre;
	private int Dinero;
	private int Posicion;
	private String[] Cartas;
	private boolean Carcel;
	private boolean Targetalibre;
	private int contador;

	// ******************************************************** Metodos
	// **********************************************************

	public Jugador(String nombre, int dinero, int posInicial, String[] cartas, boolean carcel, boolean targetalibre,
			int contador) {

		this.Nombre = nombre;

		this.Dinero = dinero;

		this.Posicion = posInicial;

		this.Cartas = cartas;

		this.Carcel = carcel;

		this.Targetalibre = targetalibre;

		this.contador = contador;

	}

	public void aumentarDinero(int mas) {

		this.Dinero = this.Dinero + mas;
	}

	public boolean disminuirDinero(int menos) {
		if ((this.Dinero - menos) <= 0) {
			System.out.println(this.Nombre + " queda eliminado de la partida por no poder pagar");
			return false;
		} else {
			this.Dinero = this.Dinero - menos;
			System.out.println(this.Nombre + " ha disminuido su dinero a " + this.Dinero + "€");
			return true;
		}
	}

	public void mostrarDinero() {

		System.out.println("Dinero: " + this.Dinero);
	}

	public void nuevaPosicion(int dado) {

		if ((this.Posicion + dado) <= 40) {
			this.Posicion = this.Posicion + dado;
		} else {
			this.Posicion = this.Posicion + dado - 40;
			this.Dinero = this.Dinero + 200;
			System.out.println("Has pasado por la casilla de salida recibes 200");
		}
	}

	public void mostrarPosicion() {
		System.out.println("Dinero: " + this.Posicion);
	}

	// ********************************************************Get y Set
	// **********************************************************
	public String getNombre() {
		return Nombre;
	}

	public int getDinero() {
		return Dinero;
	}

	public int getPosicion() {
		return Posicion;
	}

	public String[] getcartas() {
		return Cartas;
	}

	public boolean isTargetalibre() {
		return Targetalibre;
	}

	public void setTargetalibre(boolean targetalibre) {
		Targetalibre = targetalibre;
	}

	public boolean isCarcel() {
		return Carcel;
	}

	public void setCarcel(boolean carcel) {
		Carcel = carcel;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public void setDinero(int dinero) {
		Dinero = dinero;
	}

	public void setPosicion(int posicion) {
		Posicion = posicion;
	}

	public void setCartas(String[] cartas) {
		Cartas = cartas;
	}
}
