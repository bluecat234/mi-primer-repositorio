package clase_java;

import java.util.Scanner;

public class ConcatenaCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nombre=new Scanner(System.in);
	
		System.out.printf("Introduce tu nombre:\n");
		String nombre1 = nombre.nextLine();
		
		System.out.printf("Introduce tu edad:\n");
		int edad=nombre.nextInt();
		String resultado= nombre1 + " tienes " + edad + " años";
		System.out.printf(resultado);
	}

}
