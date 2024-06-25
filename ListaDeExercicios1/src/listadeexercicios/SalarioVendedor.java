package listadeexercicios;

import java.util.Scanner;

public class SalarioVendedor {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o nome do vendedor
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        // Ler o sal�rio fixo do vendedor
        System.out.print("Digite o sal�rio fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        // Ler o total de vendas efetuadas pelo vendedor no m�s
        System.out.print("Digite o total de vendas efetuadas pelo vendedor no m�s(em dinheiro): ");
        double totalVendas = scanner.nextDouble();

        // Calcular a comiss�o (15% sobre o total de vendas)
        double comissao = totalVendas * 0.15;

        // Calcular o sal�rio final (sal�rio fixo + comiss�o)
        double salarioFinal = salarioFixo + comissao;

        // Apresentar o resultado
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Sal�rio fixo: R$ " + salarioFixo);
        System.out.println("Sal�rio no final do m�s: R$ " + salarioFinal);

        scanner.close();
    }
}