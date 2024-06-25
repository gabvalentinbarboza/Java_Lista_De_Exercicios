package listadeexercicios;

import java.util.Scanner;

public class CalculoCalorias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int caloriasPrato = 0;
        int caloriasSobremesa = 0;
        int caloriasBebida = 0;

        // Seleção do prato
        System.out.println("Escolha um prato:");
        System.out.println("1 - Vegetariano (180 cal)");
        System.out.println("2 - Peixe (230 cal)");
        System.out.println("3 - Frango (250 cal)");
        System.out.println("4 - Carne (350 cal)");

        int escolha = scanner.nextInt();
        while (escolha < 1 || escolha > 4) {
            System.out.println("Escolha inválida. Por favor, tente novamente.");
            escolha = scanner.nextInt();
        }

        if (escolha == 1) {
            caloriasPrato = 180;
        } else if (escolha == 2) {
            caloriasPrato = 230;
        } else if (escolha == 3) {
            caloriasPrato = 250;
        } else if (escolha == 4) {
            caloriasPrato = 350;
        }

        // Seleção da sobremesa
        System.out.println("Escolha uma sobremesa:");
        System.out.println("1 - Abacaxi (75 cal)");
        System.out.println("2 - Sorvete diet (110 cal)");
        System.out.println("3 - Mouse diet (170 cal)");
        System.out.println("4 - Mouse de chocolate (200 cal)");

        escolha = scanner.nextInt();
        while (escolha < 1 || escolha > 4) {
            System.out.println("Escolha inválida. Por favor, tente novamente.");
            escolha = scanner.nextInt();
        }

        if (escolha == 1) {
            caloriasSobremesa = 75;
        } else if (escolha == 2) {
            caloriasSobremesa = 110;
        } else if (escolha == 3) {
            caloriasSobremesa = 170;
        } else if (escolha == 4) {
            caloriasSobremesa = 200;
        }

        // Seleção da bebida
        System.out.println("Escolha uma bebida:");
        System.out.println("1 - Chá (20 cal)");
        System.out.println("2 - Suco de laranja (70 cal)");
        System.out.println("3 - Suco de melão (100 cal)");
        System.out.println("4 - Refrigerante diet (65 cal)");

        escolha = scanner.nextInt();
        while (escolha < 1 || escolha > 4) {
            System.out.println("Escolha inválida. Por favor, tente novamente.");
            escolha = scanner.nextInt();
        }

        if (escolha == 1) {
            caloriasBebida = 20;
        } else if (escolha == 2) {
            caloriasBebida = 70;
        } else if (escolha == 3) {
            caloriasBebida = 100;
        } else if (escolha == 4) {
            caloriasBebida = 65;
        }

        // Calcula a quantidade total de calorias
        int totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;

        // Exibe o resultado
        System.out.println("A quantidade total de calorias da refeição é: " + totalCalorias + " cal");

        scanner.close();
    }
}
