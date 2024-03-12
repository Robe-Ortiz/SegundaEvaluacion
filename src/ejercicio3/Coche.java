package ejercicio3;

public class Coche extends Vehiculo {
	
	private int numeroDePuertas;
	

	public Coche(String nombre,Color color, int numRuedas, int numeroDePuertas) {
		super(nombre, color, numRuedas);
		this.numeroDePuertas = numeroDePuertas;		
	}
	
	

	
	@Override
	public void medidaDeSeguridad() {
		System.out.println("El coche usa cinturones");	
	}


	@Override
	public void avanzar() {
		System.out.println("El coche avanza");
		
	}

	@Override
	public void retroceder() {
		System.out.println("El coche retrocede");
		
	}

	@Override
	public String toString() {
		return String.format("Esto es un coche %s de color %s, tiene %d ruedas y en este caso tiene %d puertas.",
				getNombre(),getColor().getNombre(),getNumRuedas(),numeroDePuertas);
	}
}
