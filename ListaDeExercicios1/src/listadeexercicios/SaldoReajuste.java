package listadeexercicios;

import java.util.Scanner;

public class SaldoReajuste {

	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Por favor digite seu saldo");
		 float Saldo = scanner.nextFloat();
		 
		 double Reajuste = 0.015;
		 
		 double SaldoReajuste = Saldo + (Saldo * Reajuste);
		 System.out.println("Seu saldo com reajuste de 1.5% é:   " + SaldoReajuste);
	}

}
