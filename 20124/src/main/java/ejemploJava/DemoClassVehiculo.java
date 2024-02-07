package ejemploJava;

public class DemoClassVehiculo {

	public static void main(String[] args) {
		
		ClassVehiculo minivan = new ClassVehiculo ();
		
		int rango;
		
		//Asignar los valores a los campos de minivan
		
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//calcular el rango asumiendo un tanque lleno
		
		
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println ("La minivan puede llevar" + "pasajeros con un rango de " + rango + " kilometros");
		
		
		//se pueden añadir mas metodos
		
		ClassVehiculo carro = new ClassVehiculo();
		carro.pasajeros = 4;
		
		
		System.out.println ("Número de pasajeros en carros es " + carro.pasajeros);
		
		
		
		

	}

}
