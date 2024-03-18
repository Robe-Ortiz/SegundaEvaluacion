package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import ejercicio1.DiaDeLaSemana;

public class AlmacenDeDias {

	private String nombre;
	private List<DiaDeLaSemana> listaDeDiasDeLaSemana = new ArrayList<>();
	private Map <DiaDeLaSemana,Integer> mapaParaContarDias = new HashMap<>();
	private static Random random = new Random();	
	
	/*metodos para constructor*/
	private static DiaDeLaSemana generarDiaAleatorio() {
		DiaDeLaSemana diaAleatorio = DiaDeLaSemana.values()[random.nextInt(DiaDeLaSemana.values().length)];
		return diaAleatorio;
	}
	
	private void rellenarListaYMapa(){
		for(int i = 0; i<15;i++) {
			DiaDeLaSemana diaAleatorio = generarDiaAleatorio();
			listaDeDiasDeLaSemana.add(diaAleatorio);
			mapaParaContarDias.compute(diaAleatorio, (DiaDeLaSemana key, Integer value)-> value==null?1:value+1);
		}		
	}
	
	public AlmacenDeDias(String nombre) {
		this.nombre = nombre;
		rellenarListaYMapa();	
	}	
	
	/* métodos de actualización*/	
	public void addDiaDeLaSemana() {
		DiaDeLaSemana diaAleatorio = generarDiaAleatorio();
		listaDeDiasDeLaSemana.add(diaAleatorio);
		mapaParaContarDias.compute(diaAleatorio, (DiaDeLaSemana key, Integer value)-> value==null?1:value+1);
	}
	
	public static void addDiaDeLaSemanaStatic( AlmacenDeDias almacen) {
		almacen.addDiaDeLaSemana();
	}
	
	public void deleteDiaDeLaSemana(DiaDeLaSemana diaParaBorrar) {
		while(listaDeDiasDeLaSemana.contains(diaParaBorrar)) {
			listaDeDiasDeLaSemana.remove(diaParaBorrar);
		}
		mapaParaContarDias.remove(diaParaBorrar);
	}
		
	public static void deleteDiaDeLaSemanaStatic(AlmacenDeDias almacen, DiaDeLaSemana diaParaBorrar) {
		almacen.deleteDiaDeLaSemana(diaParaBorrar);
	}
	
	
	/*report*/	
	private String comprobarCantidadDeDia(DiaDeLaSemana diaDeLaSemana) {
		return String.format("%s", mapaParaContarDias.get(diaDeLaSemana)==null?"no hay":mapaParaContarDias.get(diaDeLaSemana));
	}
	
	@Override
	public String toString() {
		return String.format("Almacén de días\n"
				+ "==========\n"
				+ "Nombre: %s\n"
				+ "LUNES: %s\n"
				+ "MARTES: %s\n"
				+ "MIÉRCOLES: %s\n"
				+ "JUEVES: %s\n"
				+ "VIERNES: %s\n"
				+ "SÁBADO: %s\n"
				+ "DOMINGO: %s\n",
				nombre,
				comprobarCantidadDeDia(DiaDeLaSemana.LU),
				comprobarCantidadDeDia(DiaDeLaSemana.MA),
				comprobarCantidadDeDia(DiaDeLaSemana.MI),
				comprobarCantidadDeDia(DiaDeLaSemana.JU),
				comprobarCantidadDeDia(DiaDeLaSemana.VI),
				comprobarCantidadDeDia(DiaDeLaSemana.SA),
				comprobarCantidadDeDia(DiaDeLaSemana.DO)
				);
	}	
}
