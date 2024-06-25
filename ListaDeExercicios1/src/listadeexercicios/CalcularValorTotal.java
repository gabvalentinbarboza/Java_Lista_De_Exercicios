package listadeexercicios;

import java.util.Scanner;

import java.util.Scanner;

public class CalcularValorTotal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ler a porcentagem do IPI
		System.out.print("Digite a porcentagem do IPI: ");
		double ipi = scanner.nextDouble();

		// Ler as informações da peça 1
		System.out.print("Digite o código da peça 1: ");
		int codigoPeca1 = scanner.nextInt();
		if (codigoPeca1 != 1) {
			System.out.println("Código inválido, tente novamente.");
			extracted();
		}
		System.out.print("Digite o valor unitário da peça 1: ");
		double valorPeca1 = scanner.nextDouble();
		System.out.print("Digite a quantidade de peças 1: ");
		int quantidadePeca1 = scanner.nextInt();

		// Ler as informações da peça 2
		System.out.print("Digite o código da peça 2: ");
		int codigoPeca2 = scanner.nextInt();
		if (codigoPeca2 != 2) {
			System.out.println("Código inválido, tente novamente.");
			extracted();
		}
		System.out.print("Digite o valor unitário da peça 2: ");
		double valorPeca2 = scanner.nextDouble();
		System.out.print("Digite a quantidade de peças 2: ");
		int quantidadePeca2 = scanner.nextInt();

		// Calcular o valor total a ser pago
		double valorTotal = (valorPeca1 * quantidadePeca1 + valorPeca2 * quantidadePeca2) * (ipi / 100 + 1);

		// Apresentar o resultado
		System.out.println("O valor total a ser pago é: R$ " + valorTotal);

		scanner.close();
	}

	private static void extracted() {
	}
}
