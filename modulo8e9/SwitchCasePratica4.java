package java.modulo8e9;

import java.util.Scanner;

public class SwitchCasePratica4 {

	public static void main(String[] args) {
		int operacao;
		float saldo= 1000.00f, saque, deposito;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nOperações Bancárias: ");
		System.out.println("\n1 - Saldo");
		System.out.println("\n2 - Saque");
		System.out.println("\n3 - Depósito");
		System.out.println("\nDigite o código da operação desejada: ");
		operacao = ler.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("\nOperação saldo" + "\nSaldo: R$" + saldo);
			break;
		case 2:
			System.out.println("\nInforme o valor do saque: ");
			saque = ler.nextFloat();
			if(saque > saldo) {
				System.out.println("\nSaldo insuficiente"); }
			else {
				System.out.println("\nOperação Saque" + "\nSaldo: R$" + (saldo - saque)); }
			break;
		case 3: 
			System.out.println("\nInforme o valor do depósito: ");
			deposito = ler.nextFloat();
			System.out.println("\nOperação Depósito: " + "\nSaldo: R$" + (saldo + deposito));
			break;
		default:
			System.out.println("\nOpção Inválida!");
			
		}

	}

}
