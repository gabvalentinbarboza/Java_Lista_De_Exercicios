package listadeexercicios;

import java.util.Scanner;

public class SomaDezNumeros {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero");

		int n1 = valor.nextInt();

		System.out.println("Entre com o segundo n�mero");
		int n2 = valor.nextInt();

		System.out.println("Entre com o terceiro n�mero");
		int n3 = valor.nextInt();

		System.out.println("Entre com o quarto n�mero");
		int n4 = valor.nextInt();

		System.out.println("Entre com o quinto n�mero");
		int n5 = valor.nextInt();

		System.out.println("Entre com o sexto n�mero");
		int n6 = valor.nextInt();

		System.out.println("Entre com o s�timo n�mero");
		int n7 = valor.nextInt();

		System.out.println("Entre com o oitavo n�mero");
		int n8 = valor.nextInt();

		System.out.println("Entre com o nono n�mero");
		int n9 = valor.nextInt();

		System.out.println("Entre com o d�cimo n�mero");
		int n10 = valor.nextInt();

		int soma = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
		
		System.out.println("A soma dos n�meros �: " + soma);
		
		valor.close();
	}

}
