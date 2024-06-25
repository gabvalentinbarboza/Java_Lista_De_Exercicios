package listadeexercicios;

import java.util.Scanner;

public class CopiaLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        
        while (true) {
            System.out.print("Digite um n�mero (ou um n�mero negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // Encerra o loop se o n�mero for negativo
            }

            soma += numero; // Adiciona o n�mero � soma
        }

        System.out.println("A soma dos n�meros digitados �: " + soma);

        scanner.close();
    }
}
