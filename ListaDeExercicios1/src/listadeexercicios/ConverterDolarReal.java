package listadeexercicios;

import java.util.Scanner;

public class ConverterDolarReal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a cota��o do d�lar (valor de 1 d�lar em reais): ");
		double cotacaoDolar = scanner.nextDouble();

		System.out.print("Digite a quantidade de d�lares que voc� possui: ");
		double quantidadeDolares = scanner.nextDouble();


		double valorEmReais = quantidadeDolares * cotacaoDolar;

		System.out.println("O valor de $" + quantidadeDolares + " d�lares em reais � R$" + valorEmReais);

		scanner.close();
	}
}
