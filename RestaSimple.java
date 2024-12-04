package ejercicioclaseparte2;

import java.util.Scanner;

public class RestaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner resultado = new Scanner(System.in);
		System.out.printf("introduce un numero:\n");
		int num1 = resultado.nextInt();
		System.out.printf("introduce otro numero:\n");
		int num2 = resultado.nextInt();
		int hola;

		if (num1 >= num2) {
			hola = num1 - num2;
		} else {
			hola = num2 - num1;
		}
		System.out.printf("el resultado es %d", hola);
		resultado.close();

	}

}
