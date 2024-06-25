package listadeexercicios;

import java.util.Scanner;

public class CalculoDivisivel {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o número:");
		float numero = teclado.nextFloat();

		if (numero % 10 == 0) {
			System.out.println("O número é divisível por 10");
		} else if (numero % 5 == 0) {
			System.out.println("O número é divisível por 5");
		} else if (numero % 2 == 0F) {
			System.out.println("O número é divisível por 2");
		} else {
			System.out.println("O número não é divisível por 10, 5 ou 2.");
		}
	}

}
