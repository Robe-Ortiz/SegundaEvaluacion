package ejercicio3;

public abstract class Vehiculo implements Movimiento {

	
	private String nombre;
	private Color color;
	private int numRuedas;
	
	
	public Vehiculo(String nombre,Color color, int numRuedas) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.numRuedas = numRuedas;
	}


	public String getNombre() {
		return nombre;
	}

	public Color getColor() {
		return color;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public abstract void medidaDeSeguridad();
	
	
	
}
