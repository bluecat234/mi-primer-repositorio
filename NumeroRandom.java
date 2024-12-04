package ejercicioclaseparte2;

import java.util.Random;

public class NumeroRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();

		int numero;
		numero = rd.nextInt(11) + 5;
		System.out.printf("el numero random es: %d\n", numero);

	}
	
}
