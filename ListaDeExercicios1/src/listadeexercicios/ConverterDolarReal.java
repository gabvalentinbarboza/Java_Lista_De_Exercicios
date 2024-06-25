package listadeexercicios;

import java.util.Scanner;

public class ConverterDolarReal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a cotação do dólar (valor de 1 dólar em reais): ");
		double cotacaoDolar = scanner.nextDouble();

		System.out.print("Digite a quantidade de dólares que você possui: ");
		double quantidadeDolares = scanner.nextDouble();


		double valorEmReais = quantidadeDolares * cotacaoDolar;

		System.out.println("O valor de $" + quantidadeDolares + " dólares em reais é R$" + valorEmReais);

		scanner.close();
	}
}
