package listadeexercicios;

import java.util.Scanner;

public class ContagemIntervalos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vari�veis para contar os n�meros nos diferentes intervalos
        int contadorIntervalo1 = 0; // 0 a 100
        int contadorIntervalo2 = 0; // 101 a 200
        int contadorIntervalo3 = 0; // Maiores que 200

        // Ler 20 n�meros do usu�rio
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "� n�mero: ");
            int numero = scanner.nextInt();

            // Verifica em qual intervalo o n�mero se encaixa
            if (numero >= 0 && numero <= 100) {
                contadorIntervalo1++;
            } else if (numero >= 101 && numero <= 200) {
                contadorIntervalo2++;
            } else if (numero > 200) {
                contadorIntervalo3++;
            }
        }

        // Apresentar o resultado da contagem
        System.out.println("Quantidade de n�meros no intervalo de 0 a 100: " + contadorIntervalo1);
        System.out.println("Quantidade de n�meros no intervalo de 101 a 200: " + contadorIntervalo2);
        System.out.println("Quantidade de n�meros maiores que 200: " + contadorIntervalo3);

        scanner.close();
    }
}
