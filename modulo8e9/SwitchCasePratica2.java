package java.modulo8e9;

import java.util.Scanner;

public class SwitchCasePratica2 {

	public static void main(String[] args) {
		String nome;
		int cargo;
		float salario, novoSalario;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nNome do colaborador? ");
		nome = ler.nextLine();
		System.out.println("\n1 - Gerente");
		System.out.println("\n2 - Vendedor");
		System.out.println("\n3 - Supervisor");
		System.out.println("\n4 - Motorista");
		System.out.println("\n5 - Estoquista");
		System.out.println("\n6 - Técnico de TI");
		System.out.println("\nDigite o código do seu cargo: ");
		cargo = ler.nextInt();
		System.out.println("\nDigite seu sálario atual: ");
		salario = ler.nextFloat();
		
		switch(cargo) {
		case 1:
			novoSalario = salario+(salario*10/100);
			System.out.println("\nNome do Colaborador: " +nome+ "\nCargo: Gerente" + "\nSálario Atual: R$" + novoSalario); 
			break; 
		case 2:
			novoSalario = salario+(salario*7/100);
			System.out.println("\nNome do Colaborador: " +nome+ "\nCargo: Vendedor" + "\nSálario Atual: R$" + novoSalario); 
			break; 
		case 3:
			novoSalario = salario+(salario*9/100);
			System.out.println("\nNome do Colaborador: " +nome+ "\nCargo: Supervisor" + "\nSálario Atual: R$" + novoSalario); 
			break; 
		case 4:
			novoSalario = salario+(salario*6/100);
			System.out.println("\nNome do Colaborador: " +nome+ "\nCargo: Motorista" + "\nSálario Atual: R$" + novoSalario); 
			break;
		case 5:
			novoSalario = salario+(salario*5/100);
			System.out.println("\nNome do Colaborador: " +nome+ "\nCargo: Estoquista" + "\nSálario Atual: R$" + novoSalario); 
			break; 
		case 6:
			novoSalario = salario+(salario*8/100);
			System.out.println("\nNome do Colaborador: " +nome+ "\nCargo: Técnico de TI" + "\nSálario Atual: R$" + novoSalario); 
			break; 
		default: 
			System.out.println("\nOpção Inválida");
			}

	}

}
