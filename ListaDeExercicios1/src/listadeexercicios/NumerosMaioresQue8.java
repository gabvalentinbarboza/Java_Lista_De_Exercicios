package listadeexercicios;

import java.util.Scanner;

public class NumerosMaioresQue8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int contadorMaioresQue8 = 0;

  
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "� n�mero: ");
            int numero = scanner.nextInt();

      
            if (numero > 8) {
                contadorMaioresQue8++;
            }
        }

 
        System.out.println("Quantidade de n�meros maiores que 8: " + contadorMaioresQue8);

        scanner.close();
    }
}
