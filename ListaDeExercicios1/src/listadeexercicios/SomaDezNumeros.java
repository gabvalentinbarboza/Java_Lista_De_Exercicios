package listadeexercicios;

import java.util.Scanner;

public class SomaDezNumeros {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		System.out.println("Entre com o primeiro número");

		int n1 = valor.nextInt();

		System.out.println("Entre com o segundo número");
		int n2 = valor.nextInt();

		System.out.println("Entre com o terceiro número");
		int n3 = valor.nextInt();

		System.out.println("Entre com o quarto número");
		int n4 = valor.nextInt();

		System.out.println("Entre com o quinto número");
		int n5 = valor.nextInt();

		System.out.println("Entre com o sexto número");
		int n6 = valor.nextInt();

		System.out.println("Entre com o sétimo número");
		int n7 = valor.nextInt();

		System.out.println("Entre com o oitavo número");
		int n8 = valor.nextInt();

		System.out.println("Entre com o nono número");
		int n9 = valor.nextInt();

		System.out.println("Entre com o décimo número");
		int n10 = valor.nextInt();

		int soma = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
		
		System.out.println("A soma dos números é: " + soma);
		
		valor.close();
	}

}
