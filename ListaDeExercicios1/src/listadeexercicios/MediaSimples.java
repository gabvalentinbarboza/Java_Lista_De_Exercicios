package listadeexercicios;

import java.util.Scanner;

public class MediaSimples {

	public static void main(String[] args) {

		// Declaração e inicialização dos números
		int[] numeros1 = { 8, 9, 7 };
		int[] numeros2 = { 4, 5, 6 };

		// Calcula média dos primeiros números
		double media1 = (numeros1[0] + numeros1[1] + numeros1[2]) / 3;
		System.out.println("A média dos números 8, 9 e 7 é: " + media1);

		// Calcula média dos segundos números
		double media2 = (numeros2[0] + numeros2[1] + numeros2[2]) / 3;
		System.out.println("A média dos números 4, 5 e 6 é: " + media2);

		//soma das duas médias
		double somaDasMedias = media1 + media2;
		System.out.println("A soma das duas médias é: " + somaDasMedias);

		// média das médias
		double mediaDasMedias = somaDasMedias / 2;
		System.out.println("A média das médias é: " + mediaDasMedias);
	}
}
