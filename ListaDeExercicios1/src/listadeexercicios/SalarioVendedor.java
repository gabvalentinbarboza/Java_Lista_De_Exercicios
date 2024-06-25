package listadeexercicios;

import java.util.Scanner;

public class SalarioVendedor {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o nome do vendedor
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        // Ler o salário fixo do vendedor
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        // Ler o total de vendas efetuadas pelo vendedor no mês
        System.out.print("Digite o total de vendas efetuadas pelo vendedor no mês(em dinheiro): ");
        double totalVendas = scanner.nextDouble();

        // Calcular a comissão (15% sobre o total de vendas)
        double comissao = totalVendas * 0.15;

        // Calcular o salário final (salário fixo + comissão)
        double salarioFinal = salarioFixo + comissao;

        // Apresentar o resultado
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Salário no final do mês: R$ " + salarioFinal);

        scanner.close();
    }
}