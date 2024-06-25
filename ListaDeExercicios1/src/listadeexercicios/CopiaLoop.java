package listadeexercicios;

import java.util.Scanner;

public class CopiaLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        
        while (true) {
            System.out.print("Digite um número (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // Encerra o loop se o número for negativo
            }

            soma += numero; // Adiciona o número à soma
        }

        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close();
    }
}
