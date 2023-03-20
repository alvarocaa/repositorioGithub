package practica3;

import java.util.Scanner;

public class main {
	public static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {

		int n1, n2, n3;
		
		System.out.println("Introduce el numero 1");
		n1= teclado.nextInt();
		
		System.out.println("Introduce el numero 2");
		n2= teclado.nextInt();
		
		System.out.println("Introduce el numero 3");
		n3 = teclado.nextInt();
		
		if (n1>n2) {
			System.out.println("el primer numero es mayor que el segundo");
		} 
		if (n2>n3) {
			System.out.println("el segundo numero es mayor que el tercero");
		}
		if (n1>n3 ) {
			System.out.println("el primer numero es mayor que el tercero");
		}
		
		String autor;
		
		System.out.println("El autor de este programa es alvaro");
		autor = teclado.nextLine();
	}
	
	

}
