package java.modulo8e9;

import java.util.Scanner;

public class OperadoresPratica {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("\nInforme seu Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nInforme seu Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\nSeu novo salário é: \n" + novoSalario);
		

	}

}
