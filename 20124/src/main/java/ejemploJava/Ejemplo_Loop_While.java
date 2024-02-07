package ejemploJava;

public class Ejemplo_Loop_While {

	public static void main(String[] args) {
		int a = 1;
		
		while ( a <= 10) { // va a salir del ciclo cuando la variable sea mayor a 10
			System.out.println("El valor de A: " + a);
			a++; //incrementa el valor de la variable a = 1 , para la siguiente iteración
			      // si no le coloco la variable de cierre a++, se va a ejecutar infinitamente
		}

	}

}
