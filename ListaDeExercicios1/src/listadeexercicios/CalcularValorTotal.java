package listadeexercicios;

import java.util.Scanner;

import java.util.Scanner;

public class CalcularValorTotal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ler a porcentagem do IPI
		System.out.print("Digite a porcentagem do IPI: ");
		double ipi = scanner.nextDouble();

		// Ler as informa��es da pe�a 1
		System.out.print("Digite o c�digo da pe�a 1: ");
		int codigoPeca1 = scanner.nextInt();
		if (codigoPeca1 != 1) {
			System.out.println("C�digo inv�lido, tente novamente.");
			extracted();
		}
		System.out.print("Digite o valor unit�rio da pe�a 1: ");
		double valorPeca1 = scanner.nextDouble();
		System.out.print("Digite a quantidade de pe�as 1: ");
		int quantidadePeca1 = scanner.nextInt();

		// Ler as informa��es da pe�a 2
		System.out.print("Digite o c�digo da pe�a 2: ");
		int codigoPeca2 = scanner.nextInt();
		if (codigoPeca2 != 2) {
			System.out.println("C�digo inv�lido, tente novamente.");
			extracted();
		}
		System.out.print("Digite o valor unit�rio da pe�a 2: ");
		double valorPeca2 = scanner.nextDouble();
		System.out.print("Digite a quantidade de pe�as 2: ");
		int quantidadePeca2 = scanner.nextInt();

		// Calcular o valor total a ser pago
		double valorTotal = (valorPeca1 * quantidadePeca1 + valorPeca2 * quantidadePeca2) * (ipi / 100 + 1);

		// Apresentar o resultado
		System.out.println("O valor total a ser pago �: R$ " + valorTotal);

		scanner.close();
	}

	private static void extracted() {
	}
}
