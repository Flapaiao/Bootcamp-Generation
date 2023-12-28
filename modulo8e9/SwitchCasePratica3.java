package java.modulo8e9;

import java.util.Scanner;

public class SwitchCasePratica3 {

	public static void main(String[] args) {
		float num1, num2, soma, sub, mult, divisao;
		int operacao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = ler.nextFloat();
		System.out.println("\nDigite o segundo número: ");
		num2 = ler.nextFloat();
		System.out.println("\nCalculadora: ");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Subtração");
		System.out.println("\n3 - Multiplicação");
		System.out.println("\n4 - Divisão");
		System.out.println("\nDigite o código da operação: ");
		operacao = ler.nextInt();
		
		switch(operacao) {
		case 1:
			soma = num1 + num2;
			System.out.println("\nA soma dos números é: " + soma);
			break;
		case 2:
			sub = num1 - num2;
			System.out.println("\nA subtração dos números é: " + sub);
			break;
		case 3:
			mult = num1 * num2;
			System.out.println("\nA multiplicação dos números é: " + mult);
			break;
		case 4:
			divisao = num1 / num2;
			System.out.println("\nA divisão dos números é: " + divisao);
			break;
		default:
			System.out.println("\nOpção Inválida");
		}

	}

}
