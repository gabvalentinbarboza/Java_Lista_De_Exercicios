package listadeexercicios;

import java.util.Scanner;

public class SomaIdades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Podia ter feito isso no exercicio anterior mas assim � bem mais f�cil
		int soma = 0;

		// O for vai ler a idade das 20 pessoas
		for (int i = 1; i <= 20; i++) {
			System.out.print("Entre com a idade da pessoa " + i + ": ");
			int idade = scanner.nextInt();
			soma += idade; // Adiciona a idade � soma (+= � como a = a + b / a += b)
		}

		
		System.out.println("A soma das idades �: " + soma);

		scanner.close();
	}
}
