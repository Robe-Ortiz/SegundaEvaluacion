package ejercicio1;

public class Main {

	
	public static void main(String[] args) {
		
		DiaDeLaSemana dia1 = DiaDeLaSemana.LU;
		
		DiaDeLaSemana dia2 = DiaDeLaSemana.SA;

		System.out.println(dia1);
		System.out.println(dia2);
		
		System.out.println(dia1.diaAnterior());
		
		System.out.println(dia2.siguienteDia());
		
	}
	
	
	
}
