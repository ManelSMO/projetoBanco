package aplicacao;

import java.util.Scanner;
import entidade.Cliente;
import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do cliente: ");
		String nome = sc.nextLine();
		Cliente cliente = new Cliente(nome);
		
		System.out.println("Informe o valor inicial: ");
		double saldo = sc.nextDouble();

		Conta conta1 = new Conta(cliente, 0001, saldo);

		conta1.depositar(500);
		if (conta1.validaSaque(3000)) {
			System.out.println("Saque realizado.");
		} else {
			System.out.println("Não foi possivel sacar.");
		}
		System.out.println(conta1.toString());

		
		sc.close();
	}

}
