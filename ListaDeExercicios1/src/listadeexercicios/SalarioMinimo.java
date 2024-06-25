package listadeexercicios;

import java.util.Scanner;

public class SalarioMinimo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        final double salarioMinimo = 1212.00;

        // Ler o valor do salário do usuário
        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        // Calcular a quantidade de salários mínimos
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        // Apresentar o resultado
        System.out.println("Você ganha " + quantidadeSalariosMinimos + " salários mínimos.");

        scanner.close();
    }
}
