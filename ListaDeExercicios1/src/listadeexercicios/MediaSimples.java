package listadeexercicios;

import java.util.Scanner;

public class MediaSimples {

	public static void main(String[] args) {

		// Declara��o e inicializa��o dos n�meros
		int[] numeros1 = { 8, 9, 7 };
		int[] numeros2 = { 4, 5, 6 };

		// Calcula m�dia dos primeiros n�meros
		double media1 = (numeros1[0] + numeros1[1] + numeros1[2]) / 3;
		System.out.println("A m�dia dos n�meros 8, 9 e 7 �: " + media1);

		// Calcula m�dia dos segundos n�meros
		double media2 = (numeros2[0] + numeros2[1] + numeros2[2]) / 3;
		System.out.println("A m�dia dos n�meros 4, 5 e 6 �: " + media2);

		//soma das duas m�dias
		double somaDasMedias = media1 + media2;
		System.out.println("A soma das duas m�dias �: " + somaDasMedias);

		// m�dia das m�dias
		double mediaDasMedias = somaDasMedias / 2;
		System.out.println("A m�dia das m�dias �: " + mediaDasMedias);
	}
}
