package ejercicio2;

import ejercicio1.DiaDeLaSemana;

public class Test {

	public static void main(String[] args) {
		
	AlmacenDeDias almacen1 = new AlmacenDeDias("Pepe");
		
	System.out.println(almacen1);
	
	System.out.println();
	
	almacen1.addDiaDeLaSemana();
	AlmacenDeDias.addDiaDeLaSemanaStatic(almacen1);
	
	System.out.println(almacen1);
	
	
	}
	
	
}
