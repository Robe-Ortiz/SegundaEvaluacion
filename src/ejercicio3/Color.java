package ejercicio3;

public enum Color {
	RO("rojo"),AM("amarillo"),VE("verde"),AZ("azul"),NE("negro");
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	private Color(String nombre) {
		this.nombre = nombre;
	}
	
}
