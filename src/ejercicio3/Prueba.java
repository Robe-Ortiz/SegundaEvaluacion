package ejercicio3;

public class Prueba {

	
	public static void main(String[] args) {
		
		
		Moto moto1 = new Moto("Ducati",Color.RO,2,false);		
		Moto moto2 = new Moto("Derbi",Color.NE,2,true);
			
		Coche coche1 = new Coche("Renault",Color.AZ,4,5);		
		Coche coche2 = new Coche("Peugeot",Color.VE,4,3);
		
		
		Vehiculo[] vehiculosDelConcesionario = {moto1,moto2,coche1,coche2};		
		for(Vehiculo vehiculo : vehiculosDelConcesionario) {
			System.out.println(vehiculo);
		}
	
		
		
		coche1.medidaDeSeguridad();
		moto1.medidaDeSeguridad();
		
		coche1.avanzar();
		moto1.avanzar();
		coche1.retroceder();
		moto1.retroceder();
		
		
		
		
		
		
		
		
		
	}

}
