package listadeexercicios;

import java.util.Scanner;

public class EntreZeroeCem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int contadorIntervalo = 0;

		// for le 20 números do usuário e o contadorIntervalo
		for (int i = 1; i <= 20; i++) {
			System.out.print("Digite o " + i + "º número: ");
			int numero = scanner.nextInt();

			// Verifica se o número está no intervalo de 0 a 100
			if (numero >= 0 && numero <= 100) {
				contadorIntervalo++;
			}
		}

		
		System.out.println("Quantidade de números no intervalo de 0 a 100: " + contadorIntervalo);

		scanner.close();
	}
}
