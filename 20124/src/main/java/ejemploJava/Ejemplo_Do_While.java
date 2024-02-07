package ejemploJava;

public class Ejemplo_Do_While {

	public static void main(String[] args) {
		
		int b = 10;
		
		do { //-> este código del Do, se imprime incluso si las condición del while es falsa
			System.out.println("El valor de B: " + b);
			b++;
		
		} while (b <= 20);

	}

}
