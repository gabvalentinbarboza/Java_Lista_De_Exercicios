package listadeexercicios;

import java.util.Scanner;

public class CreditoEspecial {

	public static void main(String[] args) {
		
        Scanner valor = new Scanner(System.in);
        
        
		System.out.print("Digite o saldo m�dio do cliente: ");
		double saldoMedio = valor.nextDouble();
		double credito = 0;

		if (saldoMedio >= 0 && saldoMedio <= 500) {
			credito = 0;
		} else if (saldoMedio >= 501 && saldoMedio <= 1000) {
			credito = saldoMedio * 0.30;
		} else if (saldoMedio >= 1001 && saldoMedio <= 3000) {
			credito = saldoMedio * 0.40;
		} else if (saldoMedio > 3000) {
			credito = saldoMedio * 0.50;
		} else {
			System.out.println("Saldo m�dio inv�lido.");
			return;
		}

		System.out.println("Saldo m�dio: R$ " + saldoMedio);
		System.out.println("Valor do cr�dito: R$ " + credito);

		valor.close();
	}
}