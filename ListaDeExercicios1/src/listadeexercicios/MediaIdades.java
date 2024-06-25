package listadeexercicios;

import java.util.Scanner;

public class MediaIdades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    //aqui v�o ser armazenados os numeros
		int soma = 0;

		// Ler as idades de 20 pessoas
		for (int i = 1; i <= 20; i++) {
			System.out.print("Entre com a idade da pessoa " + i + ": ");
			int idade = scanner.nextInt();
			soma += idade; // Adiciona a idade � soma
		}

		// Calcula a m�dia das idades
		double media = soma / 20.0; //20.0 para uma divis�o decimal


		System.out.println("A m�dia das idades �: " + media);

		scanner.close();
	}
}
