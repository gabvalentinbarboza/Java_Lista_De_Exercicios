package listadeexercicios;

import java.util.Scanner;

public class SalarioMinimo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        final double salarioMinimo = 1212.00;

        // Ler o valor do sal�rio do usu�rio
        System.out.print("Digite o valor do seu sal�rio: ");
        double salarioUsuario = scanner.nextDouble();

        // Calcular a quantidade de sal�rios m�nimos
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        // Apresentar o resultado
        System.out.println("Voc� ganha " + quantidadeSalariosMinimos + " sal�rios m�nimos.");

        scanner.close();
    }
}
