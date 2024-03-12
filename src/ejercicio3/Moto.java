package ejercicio3;

public class Moto extends Vehiculo {

	private boolean tieneSideCar;
	
	
	
	
	
	public Moto(String nombre,Color color, int numRuedas, boolean tieneSideCar) {
		super(nombre,color, numRuedas);
		this.tieneSideCar = tieneSideCar;
		
	}

	@Override
	public void medidaDeSeguridad() {
		System.out.println("En moto imprescindible el casco");
		
	}

	@Override
	public void avanzar() {
		System.out.println("La moto avanza");
		
	}

	@Override
	public void retroceder() {
		System.out.println("La moto retrocede");	
	}

	@Override
	public String toString() {
		return String.format("Esto es una moto %s de color %s, tiene %d ruedas y en este caso %s",
				getNombre(),getColor().getNombre(),getNumRuedas(),tieneSideCar==true? "tiene sidecar.":"no tiene sidecar.");
	}

	

}
