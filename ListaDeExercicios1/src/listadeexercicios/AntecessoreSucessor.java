package listadeexercicios;

import java.util.Scanner;

public class AntecessoreSucessor {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		System.out.print("Entre com o n�mero: ");
		int numero = valor.nextInt();

		int sucessor = numero + 1;
		int antecessor = numero - 1;

		System.out.println("O antecessor de " + numero + " � " + antecessor);
		System.out.println("O sucessor de " + numero + " � " + sucessor);

		// Fechar o scanner
		valor.close();
	}
}
