package listadeexercicios;

import java.util.Scanner;

public class MediaIdades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    //aqui vão ser armazenados os numeros
		int soma = 0;

		// Ler as idades de 20 pessoas
		for (int i = 1; i <= 20; i++) {
			System.out.print("Entre com a idade da pessoa " + i + ": ");
			int idade = scanner.nextInt();
			soma += idade; // Adiciona a idade à soma
		}

		// Calcula a média das idades
		double media = soma / 20.0; //20.0 para uma divisão decimal


		System.out.println("A média das idades é: " + media);

		scanner.close();
	}
}
