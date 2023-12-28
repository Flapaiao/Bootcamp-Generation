package java.modulo8e9;

import java.util.Scanner;

public class OperadoresPratica3 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adNoturno, hrExtra, descontos, salarioLiquido;
		
		System.out.println("\nInforme seu Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nInforme seu Adicional Noturno: ");
		adNoturno = leia.nextFloat();
		
		System.out.println("\nInforme seu Horas Extras: ");
		hrExtra = leia.nextFloat();
		
		System.out.println("\nInforme seu Desconto: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adNoturno + (hrExtra * 5) - descontos;
		
		System.out.println("\nSeu Salário Liquido é: \n" + salarioLiquido);

	}

}
