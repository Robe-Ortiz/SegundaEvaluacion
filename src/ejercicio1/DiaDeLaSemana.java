package ejercicio1;

public enum DiaDeLaSemana {

	LU("LUNES", 1), MA("MARTES", 2), MI("MIÉRCOLES", 3), JU("JUEVES", 4), VI("VIERNES", 5), SA("SÁBADO", 6),
	DO("DOMINGO", 7);

	private String nombreCompleto;
	private int numeroDeDia;

	private DiaDeLaSemana(String nombreCompleto, int numeroDeDia) {
		this.nombreCompleto = nombreCompleto;
		this.numeroDeDia = numeroDeDia;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public DiaDeLaSemana siguienteDia() {
		switch (this) {
		case LU:
			return MA;
		case MA:
			return MI;
		case MI:
			return JU;
		case JU:
			return VI;
		case VI:
			return SA;
		case SA:
			return DO;
		case DO:
			return LU;
		default:
			return this;
		}
		
	}
	
	public DiaDeLaSemana diaAnterior() {
		switch (this) {
		case LU:
			return DO;
		case DO:
			return SA;
		case SA:
			return VI;
		case VI:
			return JU;
		case JU:
			return MI;
		case MI:
			return MA;
		case MA:
			return LU;
		default:
			return this;
		}
	}
	
	
	@Override
	public String toString() {
		return String.format("Hoy es %s y me corresponde el día %d", nombreCompleto,numeroDeDia);
	}
	
	

	
}
