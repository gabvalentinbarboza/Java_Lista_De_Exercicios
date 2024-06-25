package listadeexercicios;

import java.util.Scanner;

public class OrdenarValores {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = valor.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = valor.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = valor.nextInt();

        if (a >= b && b >= c) {
            System.out.println("Valores em ordem descendente: " + a + ", " + b + ", " + c);
        } else if (a >= c && c >= b) {
            System.out.println("Valores em ordem descendente: " + a + ", " + c + ", " + b);
        } else if (b >= a && a >= c) {
            System.out.println("Valores em ordem descendente: " + b + ", " + a + ", " + c);
        } else if (b >= c && c >= a) {
            System.out.println("Valores em ordem descendente: " + b + ", " + c + ", " + a);
        } else if (c >= a && a >= b) {
            System.out.println("Valores em ordem descendente: " + c + ", " + a + ", " + b);
        } else {
            System.out.println("Valores em ordem descendente: " + c + ", " + b + ", " + a);
        }

        valor.close();
    }
}
