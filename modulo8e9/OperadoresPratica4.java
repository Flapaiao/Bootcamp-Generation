package java.modulo8e9;

import java.util.Scanner;

public class OperadoresPratica4 {

	public static void main(String[] args) {
    Scanner  leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("\nInforme o primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nInforme o segundo numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nInforme o terceiro numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nInforme o quarto numero: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("\nA diferença é: " + diferenca);


	}

}
