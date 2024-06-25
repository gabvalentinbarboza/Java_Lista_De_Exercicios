package listadeexercicios;

import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variável para contar quantas pessoas são maiores de idade( lembrar do ++)
        int contadorMaioresIdade = 0;

     
        for (int i = 1; i <= 20; i++) {
            System.out.print("Entre com a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            // Verifica se a idade é maior ou igual a 18
            if (idade >= 18) {
                contadorMaioresIdade++;
            }
        }

    
        System.out.println("Número de pessoas maiores de idade: " + contadorMaioresIdade);

        scanner.close();

	}

}
